import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return (double) sum / marks.length;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter Marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        Student s = new Student(name, marks);

        System.out.println("Average Marks: " + s.calculateAverage());

        sc.close();
    }
}