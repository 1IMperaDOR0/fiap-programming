package br.com.fiap.CrudSpring.controller;

import org.springframework.web.bind.annotation.*;

@RestController                 // esta classe responde requisições HTTP
@RequestMapping("/example")     // todas as rotas daqui começam com /example
public class ExampleController {

    @GetMapping                 // GET /example
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hello")       // GET /example/hello?name=Lucas
    public String sayMyName(@RequestParam(required = false) String name) {
        return String.format("Hello, %s", name);
    }
}