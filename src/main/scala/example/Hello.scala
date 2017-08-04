package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"

  greeting match {
    case "Hello" => println("yay")
    case "World" => println("ciao!")
  }
}
