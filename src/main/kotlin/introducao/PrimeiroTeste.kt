package introducao

fun main() {
  println(Recepcionista.olaFulano()) // Hello there!
  println(Recepcionista.olaFulano("Jefferson")) // Hello, Jefferson!
}

class Recepcionista {
  companion object {
    fun olaFulano(nome: String? = null): String {
      return if (nome.isNullOrBlank()) {
        "Olá, Fulano!"
      } else {
        "Olá, ${nome}!"
      }
    }
  }
}