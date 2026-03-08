for (let i = 0; i < 5; i++) {
    console.log(`Número: ${i}.`);
};

let contador = 0;

while (contador < 3) {
    console.log(`Contador está em: ${contador}.`);
    contador++;
};

// const readLine = require('readline').createInterface(
//     input = process.stdin,
//     output = process.stdout,
// );

// readLine.question('Quantos números você quer?\n: ', resposta => {
//     resposta = parseInt(resposta);
//     for (let i = 1; i < (resposta + 1); i++) {
//         console.log(`Número ${i}`);
//     }
//     readLine.close()
// });

let pessoa = {
    nome: 'Ana',
    idade: 30,
    cidade: 'São Paulo',
};

for (const propriedade in pessoa) {
    console.log(`${propriedade}: ${pessoa[propriedade]}`);
};

const cores = ['vermelho', 'azul', 'amarelo'];

for (const cor of cores) {
    console.log(cor);
};

const resultadoDiv = document.querySelector('.resultado');

const carro = {
    marca: 'Ford',
    modelo: 'Mustang',
    ano: 2007,
    cor: 'Azul',
    ligar: function () {
        console.log(`O carro está ligado!`)
        exibirMensagemNoNavegador(`O carro está ligado!`)
    },
    obterDetalhes: function () {
        return `Marca: ${this.marca} / Modelo: ${this.modelo} / Ano: ${this.ano}`
    },
};

console.log('---Objeto Literal---');
console.log(`Marca: ${carro.marca}`);
console.log(`Modelo: ${carro['modelo']}`);
carro.ligar();

const detalhesCarro = carro.obterDetalhes();
console.log(`Detalhes do carro: ${detalhesCarro}.`);

exibirMensagemNoNavegador(`Detalhes do carro: ${detalhesCarro}`);

console.log('---Exibindo o Objeto---');
for (const propriedade in carro) {
    console.log(`${propriedade}: ${carro[propriedade]}.`);
    exibirMensagemNoNavegador(`${propriedade}: ${carro[propriedade]}`);
};

const carroJSON = JSON.stringify(carro);
console.log(`Objeto carro com JSON: ${carroJSON}`);
exibirMensagemNoNavegador(`Objeto carro com JSON: ${carroJSON}`);

function exibirMensagemNoNavegador(mensagem) {
    const paragrafo = document.createElement('p');
    paragrafo.innerHTML = mensagem;
    resultadoDiv.appendChild(paragrafo);
};

function Pessoa(nome, idade, profissao) {
    this.nome = nome;
    this.idade = idade;
    this.profissao = profissao;
    this.saudar = function () {
        console.log(`Olá! Meu nome é ${this.nome} e tenho ${this.idade}. Minha profissão é ${profissao}.`);
    }
}

const pessoa1 = new Pessoa('Carlos', 32, 'Engenheiro de Software');
const pessoa2 = new Pessoa('Diego', 18, 'Engenheiro de Software');

console.log('---Funcões Construtoras---');
console.log(`Nome da pessoa 1: ${pessoa1.nome}`);
pessoa1.saudar();
console.log(`Nome da pessoa 2: ${pessoa2.nome}`);
pessoa2.saudar();