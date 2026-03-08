// Vamos importar o módulo "readline" com a entrada e sáida dos dados
const readLine = require('readline').createInterface({
    input: process.stdin, // Define a entrada como fluxo de entrada padrão
    output: process.stdout, // Define a saída com o fluxo de saíd padrão
});

// Exibe uma pergunta no termial e exibe a esposta do usuário
readLine.question('Por favor, digite um número: ', (numeroDigitado) => {
    // Converte a entrada do usuário (string) para um número inteiro
    const numero = parseInt(numeroDigitado);
    // Verifica a conversão para o número foi efetiva
    if (!isNaN(numero)) {
        let a = ' ';
        if (numero % 2 == 0) {
            a = 'par';
        } else {
            a = 'ímpar';
        };
        console.log(`O número ${numero} é ${a}.`);
    } else {
        console.log(`O valor de entrada não é um inteiro...`)
    };
    readLine.close();
});

// document.querySelector('button').addEventListener('click', () => {
//     let usuario = document.querySelector('#usuario').value;
//     let numero = document.querySelector('#numero').value;

//     let a = ' ';
//     if (numero % 2 == 0) {
//         a = 'par';
//     } else {
//         a = 'ímpar';
//     };
//     console.log(`Olá ${usuario}! O número ${numero} é ${a}.`);
// })