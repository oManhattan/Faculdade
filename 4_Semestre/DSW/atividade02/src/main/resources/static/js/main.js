let montarCurriculo = function(content) {
    document.querySelector("#nome-completo").innerHTML = content.nome
    document.querySelector("#telefone > span").innerHTML = content.telefone
    document.querySelector("#email > span").innerHTML = content.email
    document.querySelector("#nascimento > span").innerHTML = dateFormatter(content.dataNascimento)

    document.querySelector("#linkedin > a").href = content.linkedin
    document.querySelector("#linkedin > a").innerHTML = content.linkedin
    document.querySelector("#github > a").href = content.github
    document.querySelector("#github > a").innerHTML = content.github

    content.conhecimentos.forEach(montarConhecimentos)
    content.experiencias.forEach(montarExperiencias)
    content.formacoes.forEach(montarFormacoes)
    content.idiomas.forEach(montarIdiomas)
}

let dateFormatter = function(content) {
    const temp = content.split("-")
    return `${temp[2]}/${temp[1]}/${temp[0]}`
}

let montarExperiencias = function(item) {
    document.querySelector("#xp-prof > ul").insertAdjacentHTML("beforeend", 
    `<li>
    <p>Empresa: ${item.empresa}</p>
    <p>Cargo: ${item.cargo}</p>
    <p>Início: ${item.dataInicio}</p>
    <p>${(item.dataTermino == null ? "Atual" : item.dataTermino)}</p>
    </li>`)
}

let montarConhecimentos = function(item) {
    document.querySelector("#conhecimentos > ul").insertAdjacentHTML("beforeend", `<p>${item}</p>`)
}

let montarFormacoes = function(item) {
    document.querySelector("#form-academica > ul").insertAdjacentHTML("beforeend", 
    `<p>Curso: ${item.curso}</p>
    <p>Instituição: ${item.instituicao}</p>`)
}

let montarIdiomas = function(item) {
    document.querySelector("#idiomas > table > tbody").insertAdjacentHTML("beforeend",
    `<tr>
    <th>${item.idioma}</th>
    <th>${item.leitura}</th>
    <th>${item.escrita}</th>
    <th>${item.conversacao}</th>
    </tr>`)
}

let fetchCurriculo = async function() {
    let response = await fetch("http://localhost:8080/get-curriculo")
    let content = await response.json()
    montarCurriculo(content)
}

// document.querySelector("#fetch-data").onclick = fetchCurriculo
fetchCurriculo()