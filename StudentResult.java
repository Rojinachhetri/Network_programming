import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int[] marks = new int[5];

    
    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }


    public double calculatePercentage() {
        int totalMarks = calculateTotalMarks();
        return (double) totalMarks / marks.length;
    }

   
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

   
        System.out.println("Enter student's age:");
        int age = scanner.nextInt();

       
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }

      
        Student student = new Student(name, age, marks);

      
        student.displayInfo();

    
        scanner.close();
    }
}
