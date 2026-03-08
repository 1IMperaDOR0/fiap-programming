// Importa a lista de clientes da models
let clientes = require("../models/clienteModel");

const listarClientes = (requeste, response) => {
    // Responde com a lista completa dos clientes no formatdo JSON
    response.json(clientes);
};

const adicionarCliente = (requeste, response) => {
    // Extrai os dados vindos do frontend
    const {nome, email, empresa} = requeste.body

    // Cria um novo cliente com um id automático
    const novoCliente = {id: (clientes.length+1), nome: "Beltrano", email: "beltrano@gmail.com", empresa: "Beltrano"};

    // Adiciona o novoCliente ao "Banco de Dados" (array)
    clientes.push(novoCliente)

    // Responde para o frontend confirmando que o novo cliente foi criado
    response.status(201).json(novoCliente);
};

// Exportamos as funções para serem usadas em outras partes do meu sistema
module.exports = {listarClientes, adicionarCliente};