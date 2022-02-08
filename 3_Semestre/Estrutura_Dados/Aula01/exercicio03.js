function criarArray(coluna, linha) {
    return Array.from(Array(coluna), () => new Array(linha))
}

function randomNum(min, max) {
    min = Math.ceil(min)
    max = Math.floor(max)

    return Math.floor(Math.random() * (max - min) + min)
}

function gerarNum(array, min, max) {
    for(var i = 0; i < array.length; i++) {
        for(var j = 0; j < array[i].length; j++) {
            array[i][j] = randomNum(min, max)
        }
    }
}

function somaDiagonal(array) {
    var temp = 0
    
    for (var i = 0; i < array.length; i++) {
        for (var j = 0; j < array[i].length; j++) {
            
            if (i == j) {
                temp += array[i][j]
            }
        }
    }

    console.log('Soma diagonal: ' + temp)
}

var teste = criarArray(5, 5)
gerarNum(teste, 0, 100)
somaDiagonal(teste)
console.log(teste)