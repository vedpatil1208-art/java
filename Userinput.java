import java.util.Scanner;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Division: ");
        String division = sc.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Phone No.  : " + phone);
        System.out.println("Department : " + department);
        System.out.println("Division   : " + division);
        System.out.println("Percentage : " + percentage + "%");

        sc.close();
    }