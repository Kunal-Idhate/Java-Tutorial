class Student{  
    int rollno;//instance variable  
    String name;  
    static String college ="ITS";//static variable  
    //constructor  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
 }  

public class StaticVAriable {
    public static void main(String[] args) {
        Student s1 = new Student(111,"Karan");  
        Student s2 = new Student(222,"Aryan");  
        s1.display();
        s1.college = "JJK";
        s2.display();
        
    }
}
