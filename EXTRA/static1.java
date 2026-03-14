package EXTRA;

import java.util.Scanner;

class Student {  
    int rollno;  
    String name;  
    static String college = "mca department";  

    static void change() {  
        college = "MCA DEPT";  
    }  

    Student(int r, String n) { 
        rollno = r;  
        name = n;  
    }  

    void display() { 
        System.out.println(rollno + " " + name + " " + college); 
    }  
}  

public class static1 {
    public static void main(String args[]) {  

        int i, n;  
        String name;  
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter how many no. of students you want to create :");  
        n = sc.nextInt();  

        sc.nextLine();   // 🔴 VERY IMPORTANT (buffer clear)

        Student s1[] = new Student[n];  

        for(i = 0; i < n; i++) { 
            System.out.print("Enter name");  
            name = sc.nextLine();  
            s1[i] = new Student(i + 1, name);  
        }  

        // before static change
        for(i = 0; i < n; i++) { 
            s1[i].display();  
        }  

        Student.change();  
        System.out.println("After static function......");  

        // after static change
        for(i = 0; i < n; i++) { 
            s1[i].display();  
        }  
    } 
}
