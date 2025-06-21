// Mudança de tema do body
const botaoClaro = document.querySelector('#tema-claro');
const botaoEscuro = document.querySelector('#tema-escuro');
const body = document.querySelector('body');

const chaveTema = 'preferenciaTema';

function aplicarTema(tema) {
    body.classList.remove('tema-claro', 'tema-escuro');
    body.classList.add(`tema-${tema}`);

    localStorage.setItem(chaveTema, tema);
}

const temaSalvo = localStorage.getItem(chaveTema);

if (temaSalvo) {
    aplicarTema(temaSalvo);
} else {
    aplicarTema('claro');
}

botaoClaro.addEventListener('click', () => {
    aplicarTema('claro');
});

botaoEscuro.addEventListener('click', () => {
    aplicarTema('escuro');
});


// Adicionar itens no carrinho
const inputNovoItem = document.querySelector('#novo-item');
const botaoAdicionar = document.querySelector('#adicionar-ao-carrinho');
const listaDeItens = document.querySelector('#lista-de-itens');

const chaveCarrinho = 'itensCarrinho';

function obterCarrinho() {
    const carrinhoSalvo = sessionStorage.getItem(chaveCarrinho);
    return carrinhoSalvo ? JSON.parse(carrinhoSalvo) : [];
}

let carrinho = obterCarrinho();

exibirCarrinho();

function exibirCarrinho() {
    listaDeItens.innerHTML = '';

    carrinho.array.forEach(item => {
        const listaItem = document.createElement('li');
        listaItem.innerHTML = item;
        listaDeItens.appendChild(listaItem);
    });
}

botaoAdicionar.addEventListener('click', () => {
    const novoItem = inputNovoItem.ariaValueMax.trim()

    if (novoItem != '') {
        carrinho.push(novoItem);
        sessionStorage.setItem(chaveCarrinho, JSON.stringify(carrinho));
        inputNovoItem.value = '';
        exibirCarrinho();
    }
})