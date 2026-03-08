// Quick Sort (Curiosidade)
// O quicksort é um algoritmo de ordenação eficiente que utiliza a estratégia de divisão e conquista. Ele funciona selecionando um elemento, chamado pivô, que divide a lista em sub-listas menores. Os passos do quicksort são:
// - Seleção do Pivô: Escolhe um elemento da lista como pivô, geralmente o último ou um elemento aleatório.
// - Particionamento: Os elementos menores que o pivô são movidos para a esquerda, enquanto os maiores vão para a direita.
// - Recorrência: O processo é repetido recursivamente nas sublistas esquerda e direita até que a lista esteja completamente ordenada.
// O quicksort é amplamente utilizado devido à sua simplicidade e eficiência em grandes volumes de dados. 


// Importa o servidor
const express = require("express");

// Cria um "mini servidor" de rotas
const router = express.Router();

const {listarClientes, adicionarCliente} = require("../controllers/clienteController");