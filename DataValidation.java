import java.util.Scanner;

class DataValidation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        if(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("You have entered " + num);
        }else{
            System.out.println("Invalid input! Please enter a number.");
        }

        System.out.println("Enter a name: ");
        if(sc.hasNext()){
            String name = sc.next();
            System.out.println("You have entered " + name);
        }else{
            System.out.println("Invalid input! Please enter a name.");
        }
    }
}