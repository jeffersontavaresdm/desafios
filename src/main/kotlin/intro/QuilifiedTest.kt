package intro

fun main() {
  println(Greeter.sayHello()) // Hello there!
  println(Greeter.sayHello("Jefferson")) // Hello, Jefferson!
}

class Greeter {
  companion object {
    fun sayHello(name: String? = null): String {
      return if (name.isNullOrBlank()) {
        "Hello there!"
      } else {
        "Hello, ${name}!"
      }
    }
  }
}