```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main extends App {
  val myInt = new MyClass[Int](10)
  val myString = new MyClass[String]("Hello")
  myInt.printValue()
  myString.printValue()
  val myOptionInt = new MyClass[Option[Int]](Some(20))
  myOptionInt.printValue() //This will cause an error due to the use of Some
}
```