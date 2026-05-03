import java.util.Scanner;
public class Test {
public static void main(String[] args) {
    System.out.println("Hello World");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
  
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to Java programming.");
        scanner.close();

    
    // Here you can add code to connect to a database
}
}