const frutas = ['maçã', 'melancia', 'banana', 'laranja'];

console.log(frutas);

const numeros = [10, 20, 30, 40, 50];

console.log(numeros);

let valor = 0;

const mistura = [1, '2', 3, '4', true, false, null, undefined, valor = 10, numeros, {
    chave: 'valor',
}];

console.log(mistura);

const cores = new Array('vermelho', 'preto', 'branco');

console.log(cores);

const vazio = [];

console.log(vazio);

const linguagens = ['javascript', 'java', 'python', 'c#'];

const primeiraLinguagem = linguagens[0];

console.log(`A primeira linguagem é: ${primeiraLinguagem}`);

const ultimaLinguagem = linguagens[linguagens.length - 1];

console.log(`A última linguagem é: ${ultimaLinguagem}`);

let coresMutaveis = ['branco', 'preto', 'rosa'];
coresMutaveis[coresMutaveis.length] = 'roxo';

console.log(coresMutaveis);

let planetas = ['terra', 'marte'];
const ultimosItensAdicionados = planetas.push('saturno', 'urano');

console.log(planetas);

const ultimoItemRemovido = planetas.pop();

console.log(planetas);

const indiceTerra = planetas.indexOf('terra');

console.log(indiceTerra);

const stringParaItens = planetas.join(' - ');

console.log(stringParaItens);

const coresInteracao = ['marrom', 'magenta', 'ciano'];

for (let i = 0; i < coresInteracao.length; i++) {
    console.log(`O indíce da ${coresInteracao[i]} é ${i}`);
};

coresInteracao.forEach(function (cor, indice) {
    console.log(`Cor ${cor} no índice ${indice}`);
});

const readLine = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout,
});

const listasCompras = [];

function addItem() {
    readLine.question('Digite um item para adicionar a lista de compras (ou "fim" para encerrar):\n-> ', (resposta) => {
        const itemFormado = resposta.trim();
        if (resposta == 'fim') {
            console.log('\nSua lista de compra ficou assim:\n');
            listasCompras.forEach((produto, indice) => {
                console.log(`${indice + 1}. ${produto}`)
            });
            readLine.close();
        } else if (itemFormado != '') {
            listasCompras.push(itemFormado);
            console.log(`"${itemFormado}" foi adicionado à sua lista.`);
            addItem();
        } else {
            console.log('Por favor, digite um item válido.');
            addItem();
        };
    });
}

console.log('Bem vindo a sua lista de compras!')
addItem()