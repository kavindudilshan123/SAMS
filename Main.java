import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> students = new ArrayList<>();
    static ArrayList<String> courses = new ArrayList<>();
    static ArrayList<String> lecturers = new ArrayList<>();
    static ArrayList<String> attendance = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Simple Login
        System.out.print("Username: ");
        String u = input.nextLine();
        System.out.print("Password: ");
        String p = input.nextLine();

        if (u.equals("admin") && p.equals("1234")) {

            while (true) {
                System.out.println("\n==== SAMS MENU ====");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Add Course");
                System.out.println("4. Add Lecturer");
                System.out.println("5. Mark Attendance");
                System.out.println("6. View Attendance");
                System.out.println("7. Exit");

                System.out.print("Choose: ");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Student Name: ");
                        students.add(input.nextLine());
                        System.out.println("Student Added!");
                        break;

                    case 2:
                        System.out.println("Student List:");
                        for (String s : students) {
                            System.out.println(s);
                        }
                        break;

                    case 3:
                        System.out.print("Enter Course: ");
                        courses.add(input.nextLine());
                        System.out.println("Course Added!");
                        break;

                    case 4:
                        System.out.print("Enter Lecturer: ");
                        lecturers.add(input.nextLine());
                        System.out.println("Lecturer Added!");
                        break;

                    case 5:
                        System.out.print("Student Name: ");
                        String name = input.nextLine();

                        System.out.print("Date: ");
                        String date = input.nextLine();

                        System.out.print("Present (yes/no): ");
                        String status = input.nextLine();

                        attendance.add(name + " | " + date + " | " + status);
                        System.out.println("Attendance Marked!");
                        break;

                    case 6:
                        System.out.println("Attendance Records:");
                        for (String a : attendance) {
                            System.out.println(a);
                        }
                        break;

                    case 7:
                        System.out.println("Exit...");
                        return;

                    default:
                        System.out.println("Invalid Option!");
                }
            }

        } else {
            System.out.println("Login Failed!");
        }
    }
}