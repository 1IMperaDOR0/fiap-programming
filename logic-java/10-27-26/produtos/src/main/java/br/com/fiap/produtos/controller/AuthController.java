package br.com.fiap.produtos.controller;

import br.com.fiap.produtos.dto.LoginRequest;
import br.com.fiap.produtos.dto.LoginResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwsHeader;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtEncoder jwtEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthController(JwtEncoder jwtEncoder, AuthenticationManager authenticationManager) {
        this.jwtEncoder = jwtEncoder;
        this.authenticationManager = authenticationManager;
    }

    // POST /auth/login  (rota pública)
    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {

        // 1. Confere email + senha. Se estiverem errados, lança exceção -> 401
        var authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.email(), loginRequest.password())
        );

        // 2. Monta o JWT: header + claims
        var header = JwsHeader.with(MacAlgorithm.HS256).build();
        var now = Instant.now();
        var claims = JwtClaimsSet.builder()
                .subject(authentication.getName())          // "sub": email
                .issuedAt(now)                               // "iat": emitido em
                .expiresAt(now.plus(2, ChronoUnit.HOURS))    // "exp": expira em 2h
                .build();

        // 3. Assina e devolve
        var token = jwtEncoder.encode(JwtEncoderParameters.from(header, claims));
        return new LoginResponse(token.getTokenValue());
    }
}