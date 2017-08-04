package example

object Hello extends Greeting with App {

  println(doGreet("Taras1"))
  println(doGreet2(Some("Taras1")))
  println(new B().doGreet3(Some("Taras1")))

  var a: Boolean = _
  if (a) {
    println("Holy!")
  }

  def doGreet(name: String): String = {
    name match {
      case "Taras" => s"Hello $name"
      case "Taras2" => s"Hello2 $name"
      case "User" => s"Ciao $name"
    }
  }


  def doGreet2(name: Option[String]): String = {
    name match {
      case Some("Taras") => s"Hello $name"
      case Some("Taras2") => s"Hello2 $name"
      case Some("User") => s"Ciao $name"
    }
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}

class B {
  def doGreet3(name: Option[String]): String = {
    name match {
      case Some("Taras") => s"Hello $name"
      case Some("Taras2") => s"Hello2 $name"
      case Some("User") => s"Ciao $name"
    }
  }
}
