package hijava;

/**
 * Sort-of emulating the behaviour from Greeter.scala, which a simple closure example.
 * Basically the key take-away here is that in Java (pre-8) we would have to create
 * and pass around instances of classes, all of which is cleaner and less verbose with
 * higher order functions and closures
 *
 */
public class ClosureSortOfButNotReally {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setHelloPhrase("Hello");
        FooBar foo = new FooBar(greeter);
        foo.sayHello("World!");
        greeter.setHelloPhrase("Hola");
        foo.sayHello("World!");

    }
}
class Greeter {
    private String helloPhrase;

    public void setHelloPhrase(String helloPhrase) {
        this.helloPhrase = helloPhrase;
    }

    public void sayHello(String name) {
        System.out.println(helloPhrase + ", " + name);
    }
}
class FooBar {
    private Greeter greeter;

    public FooBar(Greeter greeter) {
        this.greeter = greeter;
    }

    public void sayHello(String name) {
        greeter.sayHello(name);
    }
}
