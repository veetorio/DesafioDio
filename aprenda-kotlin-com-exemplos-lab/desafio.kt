import java.util.ArrayList
import java.util.Arrays


// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(var nome: String, val duracao: Int = 60,val dificuldade:Nivel)

class Usuario(val nome:String)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun remover(int: Int){
        inscritos.removeAt(int)
    }
    fun mostrar(){
        println("$nome")
        for(i in inscritos.indices){
            println(inscritos.get(i).nome)
        }
    }
}

fun main() {
    val BackEnd = Formacao("BackEnd", listOf( ConteudoEducacional( "Java" , duracao = 60 ,Nivel.INTERMEDIARIO) ) )
    BackEnd.matricular(Usuario("ettore"))
    BackEnd.matricular(Usuario("Lucas"))
    BackEnd.matricular(Usuario("Joao"))
    BackEnd.matricular(Usuario("Roberto"))
    BackEnd.remover(1)
    BackEnd.mostrar()

    println()
    val Frontend = Formacao("Front-end", listOf(ConteudoEducacional("Javascript", duracao = 60,Nivel.BASICO)))
    Frontend.matricular(Usuario("Gabriel"))
    Frontend.matricular(Usuario("joao"))
    Frontend.matricular(Usuario("Bir"))
    Frontend.matricular(Usuario("Gabriel"))
    Frontend.matricular(Usuario("Gabriel"))

    Frontend.mostrar()

}
