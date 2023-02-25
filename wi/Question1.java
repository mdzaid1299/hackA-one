package wi;
//withdrawl 0.50%
//deposit 0.25% amount charged as processing fee
// if two successive transactions are of different type
// the charges are 0.40% and 0.20% on withdrawal and deposit respectively on a current transaction.

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance");
        int initialBalance = sc.nextInt();
        System.out.println("Enter withdrawl amount");
        int withdrwalAmount = sc.nextInt();
//        System.out.println("Enter Deposit amount");
//        int depositAmount = sc.nextInt();
        double afterWithdrawlCharge, afterDepositCharge = 0;
        double currentBalance = 0;
//        if(initialBalance >= withdrwalAmount){
//            afterWithdrawlCharge = (withdrwalAmount * 0.5) / 100;
//           double currentBalance = withdrwalAmount - afterWithdrawlCharge;
//        }
        System.out.println("Enter choice 1/for withdraw /n/2 for deposit /n/0 for exit");
        int choice = sc.nextInt();
        while(true){
            if(choice == 0){
                break;
            }
            if(choice == 1){
                if(initialBalance >= withdrwalAmount){
                    System.out.println("Do you want to again deposit or withdrawl-----" +
                            "Enter 1 for deposit 2 for withdrawl 0 for main menu");
                    int choice2 = sc.nextInt();
                    switch (choice2){
                        case 1:
                            System.out.println("You have selected deposit menu");
                            System.out.println("Enter amount you want to deposit");
                            int depositAmount = sc.nextInt();
                            afterDepositCharge = (depositAmount * 0.25) / 100;
                            currentBalance = currentBalance + depositAmount - afterDepositCharge;
                            System.out.println("Available balance = "+ currentBalance);

                        case 2:
                            System.out.println("You have selected withdrawl menu");
                            System.out.println("Enter amount you want to withdrawl");
                            int withdrawlAmount = sc.nextInt();
                            afterWithdrawlCharge = (withdrwalAmount * 0.5) / 100;
                            currentBalance = currentBalance - withdrwalAmount - afterWithdrawlCharge;
                    }

               }
            }
        }
    }
}
