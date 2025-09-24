// Criação do framework express, que facilita criar um servidor HTTP no Node.js
const express = require("express");

// Importa o cors que irános possibilitar que o frontend, vulgo projeto react, possa se comunicar com o banckend sem bloqueios
const cors = require("cors");

// Cria a aplicação express, que será o nosso servidor
const app = express();

// Habilita o cors, vulgo servidor, que possibilita que o frontend acesse a API sem restrições de segurança 
app.use(cors());

// Importa as rotas do cliente que criamos em outro arquivo
const clienteRoutes = require("./routes/clienteRoutes");

// Toda vez que eu acessar o meu /clientes, serei redirecionado para as rotas dos clientes 
app.use("/clientes", clienteRoutes);

// Define a porta do servidor, nesse caso a 5000
const PORT = 5000;

// Testando o servidor
app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});