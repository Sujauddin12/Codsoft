package Codsoft.java;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int atmnumber=12345;
        int atmpin=1234;
        AtmOperationInter op = new AtmOpertionImp();
      Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Atm Machine");
        System.out.println("Enter Atm  Number :");
        int atmNumber = sc.nextInt();
        System.out.println("Atm pin");
        int Pin =sc.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==Pin)){
            while(true){
                System.out.println("1.View Available balance\n 2.Withdraw the money\n 3.Deposit Amount \n 4.View Ministatement\n5 Exit");
                System.out.println("Enter the choice :");
                int ch=sc.nextInt();
                if(ch==1){
                    op.viewBalance();
                } else if (ch==2) {
                    System.out.println("Enter the Amount to winthdrawn:");
                    double withdrawAmount = sc.nextDouble();
                    op.withDrawAmount(withdrawAmount);

                } else if (ch==3) {
                    System.out.println("Enter Amount to deposit");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch==4) {
                    op.viewMinistatement();

                } else if (ch==5) {
                    System.out.println("Collect Your Atm Card:\n Thank's For Visting");
                    System.exit(0);

                }
            }
        }
        else{
            System.out.println("Pls Enter Correct Choice");

        }
    }
}
