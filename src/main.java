import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C,F;
        int choice;
        for (int i = 0; i >=0 ; i++) {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice==0){
                System.exit(0);
            }if (choice == 1){
                System.out.println("Enter the F : ");
                F = input.nextDouble();
                System.out.println(" F to C =  " + FtoC(F));
            }if (choice ==2 ){
                System.out.println("Enter the C : ");
                C = input.nextDouble();
                System.out.println(" F to C =  " + CtoF(C));
            }
        }
    }
    public static double CtoF(double C){
        double F = (9.0/5) * (C + 32);
        return F;
    }
    public static double FtoC(double F ){
        double C = (5.0/9) * (F -32);
        return  C;
    }
}
