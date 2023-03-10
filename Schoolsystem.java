import java.util.Scanner;
import java.io.*;
public class Schoolsystem {
    Scanner sc = new Scanner(System.in);
    // User log-in
    System.out.println("Please enter the patients name:");
    String username = sc.nextLine();
    String password = sc.nextLine();
    admin adm = new admin(username,password);
    // adding a new Patient
    System.out.println("Please enter the patients name:");
    String name = sc.nextLine();
    System.out.println("Please enter the patients age:");
    int age = sc.nextInt();
    System.out.println("Please enter the patients address:");
    String address = sc.nextLine();
    System.out.println("Please enter the patients phone number:");
    String number = sc.nextLine();
    System.out.println("Please enter the patients ID:");
    String id = sc.nextLine();
    System.out.println("Please enter the patients insurance company:");
    String company = sc.nextLine();
    patient pa = new patient(name,age,address,number,id,company);
}
