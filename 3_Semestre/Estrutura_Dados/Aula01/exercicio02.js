var vetor = new Array(20)

function gerarNum(min, max) {
    min = Math.ceil(min)
    max = Math.floor(max)

    return Math.floor(Math.random() * (max - min) + min)
}

function gerarVetor(vetor, min, max) {
    var vpar = new Array()

    for (var i = 0; i < vetor.length; i++) {
        var temp = gerarNum(min, max)

        if (temp % 2 == 0) {
            vpar.push(temp)
        }

        vetor[i] = temp
    }

    console.log(vetor)
    console.log(vpar)
}

gerarVetor(vetor, 0, 100)