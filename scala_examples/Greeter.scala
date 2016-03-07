package scope1 {
    class Foo {
        // Method that performs the function func on the inputted string
        def exec(func:(String) => Unit, name: String) {
            func(name)
        }
    }
}

object Greeter extends App {
    var hello = "Hello"
    def sayHello(name: String) { println(s"$hello, $name") }

    val foo = new scope1.Foo
    foo.exec(sayHello, "World!")
    
    // Change hello to see what happens
    hello = "Hola"
    foo.exec(sayHello, "World!")
}