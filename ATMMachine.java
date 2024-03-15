import java.util.Scanner;
class ATM{
    float bal;
    int PIN = 2024;
    public void checkPIN(){
        System.out.println("Enter your PIN");
        Scanner sc=new Scanner(System.in);
        int enteredPIN = sc.nextInt();
if(enteredPIN==PIN){
    menu();
}
else{
    System.out.println("Enter a valid PIN ");
    menu();
}
    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println(" 1. Check A/C Balance ");
        System.out.println(" 2. Withdraw money ");
        System.out.println(" 3. Deposit money ");
        System.out.println(" 4.  Exit ");
        Scanner sc = new Scanner(System.in );
int opt = sc.nextInt();
if(opt==1){
    checkBalance();
}
else if (opt==2){
    withdrawMoney();
}
else if (opt== 3){
    depositMoney();
}
else if (opt==4){
    return;
}
else{
    System.out.println("Enter a valid choice");
}
    }
    public void checkBalance(){
        System.out.println("Balance:" + bal);
        menu();
    }
public void withdrawMoney(){
    System.out.println("Enter Amount to Withdraw");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if (amount>bal){
System.out.println("Insufficient Balanace ");
    }
    else {
       bal= bal - amount ;
       System.out.println("Money Withdraw Succesfully ");
       menu();
    }
}
public void depositMoney(){
    System.out.println("Enter the amount you want to deposit");
    Scanner sc = new Scanner( System.in);
    float amount = sc.nextFloat();
    bal= bal + amount;
    System.out.println("Money Deposit Succesfully ");
menu();
}
}
public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPIN();

    }
}
