var campoFiltro = document.querySelector("#filtrar-tabela");
campoFiltro.addEventListener("input", function(){
    var pacientes = document.querySelectorAll(".paciente");

    if(this.value.length > 0){
        for(var i = 0; i < pacientes.length; i++){
            var paciente = pacientes[i];
            var tdNome = paciente.querySelector(".info-nome");
            var nome = tdNome.textContent;
            var expressao = new RegExp(this.value, "i");
            if(!expressao.test(nome)){
                paciente.classList.add("invisivel");
            } else {
                paciente.classList.remove("invisivel");
            }

            //uma opção se não quisermos utilizar expressões regulares (RegExp) é utilizar a função substring
            /*ficaria assim:
            
            var comparavel = nome.substr(0, this.value.length);
            var comparavelMinusculo = comparavel.toLowerCase();
            var valorDigitadoMinusculo = this.value.toLowerCase();
            if(!(valorDigitadoMinusculo == comparavelMinusculo)){
                paciente.classList.add("invisivel");
            } else {
                paciente.classList.remove("invisivel");
            } */
        }
    } else {
        for(var i = 0; i < pacientes.length; i++){
            var paciente = pacientes[i];
            paciente.classList.remove("invisivel");
        }
    }
   
})