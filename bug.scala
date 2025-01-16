```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == value) {
      return value
    } else {
      throw new Exception("Values are not equal")
    }
  }
}

val myInstance = new MyClass[Int](5)
val result = myInstance.myMethod(5) //Correct result: 5
val anotherResult = myInstance.myMethod(10) //Throws Exception: Values are not equal
```