public class CommandLineNumbers {
    // We can compilie and run this with an argument like 1
    // javac CommandLineNumbers.java
    // java CommandLineNumbers 1
    public static void main(String[] args) {
        
     int x = args[0]; // compile time error because args[0] is a String not an int
    }
}
