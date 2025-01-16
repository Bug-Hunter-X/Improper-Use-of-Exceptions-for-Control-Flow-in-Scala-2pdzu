```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): Option[T] = {
    if (x == value) {
      Some(value)
    } else {
      None
    }
  }
}

val myInstance = new MyClass[Int](5)
val result = myInstance.myMethod(5) //Correct result: Some(5)
val anotherResult = myInstance.myMethod(10) //Correct result: None
```