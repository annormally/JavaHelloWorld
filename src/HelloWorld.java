/**
 * Comment all line to understand.
 * Put comment by you for you.
 * The most easier program that can be build.
 * In the System.out.println("you can put what do you want");
 */

//
// public => access modifier
// access modifier can be: default, public, private and protected
// "HelloWorld" => class name
// classes can be: class, interface, enum, annotation

public class HelloWorld {

    // public static void main(String[] args) is the most important Java method
    // this is the first method you encounter
    // "public" - is the access modifier of the method
    // "static" - In this main method has to be static so that JVM(Java Virtual Machine) can load the class into memory
    // and call the main method
    // "void" - java main method doesn't return anything, that's why it's return type is void
    // "main" - this is the name of java main method
    // "String[] args" - java main method accepts a single argument of type String array
    public static void main(String[] args) {

        // "System" - it is a final class defined in the java.lang.package
        // "out" - this is an instance of PrintSteam type, which is public and static member of the System class.
        // "println()" - as all instances of PrintStream class have a public method println(), System.out represents the
        //  Standard Output Stream
        System.out.println("Hello World");
        // "HelloWorld" - represent the message that will show at console
    }
}