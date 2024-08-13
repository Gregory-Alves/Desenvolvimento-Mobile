open class Pato(var voo : Voar) {

        fun voarDefato(){
            this.voo.executarVoo()
        }

        fun mudarEstiloDeVoo(novoVoo : Voar){
            this.voo = novoVoo
        }

        fun fazerQuack() {
            println("Quack!")
        }

        fun boiar() {
            println("Estou boiando!")
        }
}