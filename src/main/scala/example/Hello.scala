package example

object Hello extends Greeting with App {

  println(doGreet("Taras1"))

  var a: Boolean = _
  if (a) {
    println("Holy!")
  }

  def doGreet(name: String): String = {
    name match {
      case "Taras" => s"Hello $name"
      case "User" => s"Ciao $name"
    }
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
