```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    value match {
      case Some(v) => println(v)
      case None => println("None")
      case _ => println(value)
    }
  }
}

object Main extends App {
  val myInt = new MyClass[Int](10)
  val myString = new MyClass[String]("Hello")
  myInt.printValue()
  myString.printValue()
  val myOptionInt = new MyClass[Option[Int]](Some(20))
  myOptionInt.printValue() //This line now works correctly
  val myOptionIntNone = new MyClass[Option[Int]](None)
  myOptionIntNone.printValue() //This line now works correctly
}
```