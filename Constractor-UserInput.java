import java.util.Scanner;
public class Person {
    private String name;
    private String gender;
    private String contact;
    private int age;
 
  
    public Person(String name, int age, String contact, String gender) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.contact = contact;

    
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Contact: " + contact + ", Gender: " + gender);
    
    }

    public static void main(String[] args) {
       Scanner scan= new Scanner (System.in);
       
       System.out.println("Enter Name: ");
       String name = scan.nextLine();
       
       System.out.println("Enter Gender: ");
       String gender = scan.nextLine();
       
       System.out.println("Enter Contact: ");
       String contact = scan.nextLine();
       
       System.out.println("Enter Age: ");
       int age = scan.nextInt();
        
        Person person1 = new Person(name, age , contact, gender);
        person1.displayInfo();
 
    }
}
