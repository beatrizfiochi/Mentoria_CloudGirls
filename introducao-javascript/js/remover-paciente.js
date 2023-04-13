//var pacientes = document.querySelectorAll(".paciente");
// pacientes.forEach(function(paciente){
//     paciente.addEventListener("dblclick", function(){   //dblclick - duplo click
//         this.remove();   //this - palavra de contexto, com quem o evento está atrelado
//     });
// });

var tabela = document.querySelector("table");

tabela.addEventListener("dblclick", function(event){
    var alvoEvento = event.target; //target - quem foi o alvo do evento, neste caso, quem foi clicado duas vezes
    var paiDoAlvo = alvoEvento.parentNode; // neste caso, o pai do alvo é o Tr
    paiDoAlvo.classList.add("fadeOut");

    setTimeout(function(){
        paiDoAlvo.remove();
    }, 500);
});