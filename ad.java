
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
        
        Person person1 = new Person("John", 30, "09434296892", "male");
        person1.displayInfo();
 
    }
}
