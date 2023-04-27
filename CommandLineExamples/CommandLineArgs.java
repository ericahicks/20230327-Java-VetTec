public class CommandLineArgs {
     
  // To provide a list of args, we need to use a space separated list after java Hello like
  // java Hello hello apples bananas 1 2 a b

    public static void main(String[] args) {
       // Note: if no args are passed args is an empty String[] not null
        System.out.println("args has length " + args.length);

        // This will cause a runtime exception if no args are passed
        System.out.println(args[0]);
    }
}
