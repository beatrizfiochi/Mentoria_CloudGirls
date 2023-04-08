//console.log(document.querySelector("h1")); //document.querySelector é usado para buscar algum elemento no seu html (apenas um único elemento), neste caso, buscar o h1 e o console.log irá imprimí-lo no console do programador 
var titulo = document.querySelector(".titulo"); // anteriormente estávamos buscando pela tag h1, uma boa prática é não buscar pela tag em si, mas sim por outras opções como id, class, seletores css. então neste caso add uma class a tag h1 e então buscamos por ela (neste caso: .titulo)
// textContent é usado para ter acesso ao conteúdo de texto da minha tag
titulo.textContent = "Aparecida Nutricionista"; //assim, irá mudar o conteúdo da variável titulo


//document.querySelectorAll irá buscar todos os elementos/retornará uma array (lista) com todos da classe q eu pedir (neste caso, os pacientes)
var pacientes = document.querySelectorAll(".paciente");
console.log(pacientes);

for(var i = 0; i < pacientes.length; i++){
    var paciente = pacientes[i];

    var tdPeso = paciente.querySelector(".info-peso");
    var peso = tdPeso.textContent;

    var tdAltura = paciente.querySelector(".info-altura");
    var altura = tdAltura.textContent;

    var tdImc = paciente.querySelector(".info-imc");

    var pesoEhValido = true;
    var alturaEhValida = true;

    if (peso <= 0 || peso >= 1000){  // || significa ou
        console.log("Peso inválido!");
        pesoEhValido = false;
        tdImc.textContent = "Peso inválido!";
        paciente.classList.add("paciente-invalido"); //para alterar aspecto visual na página, utilizo o css, por isso não faço as alterações direto aqui, como por exemplo usar paciente.style.backgroundColor("orange") no js - assim, utilizando o css, eu só altero 1x em apenas um local, ao invés de ter q buscar pelo meu código todo locais que necessitam de alterações.
    }

    if (altura <= 0 || altura >= 3.00){
        console.log("Altura inválida!");
        alturaEhValida = false;
        tdImc.textContent = "Altura inválida!";
        paciente.classList.add("paciente-invalido"); 
    }

    if (pesoEhValido && alturaEhValida){
        var imc = peso/(altura*altura);
        tdImc.textContent = imc.toFixed(2); //.toFixed arredonda o número de casas decimais que eu defino, neste caso, 2 casas decimais
    }

}





/*durante o desenvolvimento do projeto, utiliza-se o console.log para verificar se as coisas estão se comportando como esperamos exemplo:
console.log(paciente); //tr
console.log(tdPeso); //td que tem o peso
console.log(peso); //obter o valor (100)
console.log(tdAltura); //td que tem a altura
console.log(altura); //obter o valor (2.00)
console.log(imc);*/