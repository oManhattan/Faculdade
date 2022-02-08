var vetor = new Array(10)

function gerarVetor(vetor) {
    for (var i = 0; i < vetor.length; i++) {
        vetor[i] = gerarValores(0, 100)
    }
}

function imprimirVetor(vetor) {
    vetor.forEach(function (item, indice, array) {
        console.log(item)
    })
}

function gerarValores(min, max) {
    min = Math.ceil(min)
    max = Math.floor(max)

    return Math.floor(Math.random() * (max - min) + min)
}

gerarVetor(vetor)
imprimirVetor(vetor)