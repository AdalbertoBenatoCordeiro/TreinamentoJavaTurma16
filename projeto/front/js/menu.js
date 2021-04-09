function validaLogin() {
    let userTxt = localStorage.getItem("userlogged");
    if (!userTxt) {
        window.location = "index.html"
    }
    let user = JSON.parse(userTxt);
    document.getElementById("user").innerHTML = `nome: ${user.nome} RACF ${user.racf}`
    document.getElementById("foto").innerHTML = `<img id="fotoUser" src=${user.linkFoto}>`
}
function logout() {
    localStorage.removeItem("userlogged");
    window.location = "index.html"
}
function gerarRelatorioEventos() {
    let dataInicio = document.getElementById("dataInicio").value
    let dataFinal = document.getElementById("dataFinal").value

    let datas = {
        dataIni: dataInicio,
        dataFim: dataFinal
    }
    let msg = {
        method: 'POST',
        body: JSON.stringify(datas),
        headers:{
            'Content-type':'application/json'
        }
    }
    fetch("http://localhost:8080/evento/data", msg)
        .then(res => tratarRespostaEvento(res))
   
}
    function gerarRelatorioAlarmes() {
        
    fetch("http://localhost:8080/alarmes/all")
        .then(res => tratarResposta(res))
    
}
function tratarRespostaEvento(resposta) {
    if (resposta) {
        resposta.json().then(res => exibirDadosEventos(res))
    }
}

function tratarResposta(resposta) {
    if (resposta) {
        resposta.json().then(res => exibirDadosAlarmes(res))
    }
}

function exibirDadosAlarmes(listaAlarmes) {
    let tabela = '<table class="table table-sm"> <tr> <th>nome</th> <th>descricao</th> </tr>'
    for (i = 0; i < listaAlarmes.length; i++) {
        tabela = tabela + `<tr> <td>${listaAlarmes[i].nome}</td> <td>${listaAlarmes[i].descricao}</td> </tr>`
    }
    tabela = tabela + '</table>'
    document.getElementById("tabela").innerHTML = tabela
}
function exibirDadosEventos(listaEventos) {
    let tabela = '<table class="table table-sm"> <tr> <th>data</th> <th>alarme</th> <th>equipamento</th>  </tr>'
    for (i = 0; i < listaEventos.length; i++) {
        let databr = new Date(listaEventos[i].dataEvt).toLocaleDateString("pt-BR", { timeZone: 'UTC' });
        tabela = tabela + `<tr> <td>${databr}</td>  <td>${listaEventos[i].alarme.nome}</td> <td>${listaEventos[i].equipamento.hostname}</td> </tr>`
    }
    tabela = tabela + '</table>'
    document.getElementById("tabela").innerHTML = tabela
}