public class CommandLineNumbersv2 {

    // We can compilie and run this with an argument like 2
    // javac CommandLineNumbersv2.java
    // java CommandLineNumbersv2 2
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("x squared is " + (x * x));
    }
    
}
