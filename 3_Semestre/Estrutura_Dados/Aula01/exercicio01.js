var vetor = new Array(100)

function gerarNum(min, max) {
    min = Math.ceil(min)
    max = Math.floor(max)

    return Math.floor(Math.random() * (max - min) + min)
}

function gerarVetor(vetor, min, max) {
    var menor = max
    var maior = min
    
    for (var i = 0; i < vetor.length; i++) {
        vetor[i] = gerarNum(min, max)

        menor = (menor < vetor[i])? menor : vetor[i]
        maior = (maior > vetor[i])? maior : vetor[i]
    }

    console.log('menor => ' + menor)
    console.log('maior => ' + maior)
}

function imprimirVetor(vetor) {
    console.log(vetor)
}

gerarVetor(vetor, 0, 100)
imprimirVetor(vetor)