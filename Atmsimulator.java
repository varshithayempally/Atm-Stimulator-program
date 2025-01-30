
import java.util.Scanner;
public class Atmsimulator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int balance=1000;//initial balance
        int pin=7735;//initial PIN
        System.out.println("enter PIN:");
        int enteredpin=scanner.nextInt();
        if(enteredpin==pin){
            int option;
            do{
                System.out.println("\nATM menu:");
                System.out.println("1.balance enquiry");
                System.out.println("2.cash withdrawl");
                System.out.println("3.change PIN");
                System.out.println("4.exit");
                System.out.println("select option:");
                option=scanner.nextInt();
                switch(option){
                    case 1:
                    System.out.println("balance:$"+balance);
                    break;
                    case 2:
                    System.out.println("enter amount to withdraw:");
                    int withdraw=scanner.nextInt();
                    if(withdraw<=balance){
                        balance-=withdraw;
                        System.out.println("withdrawl succesfull!new balance:$"+balance);
                    }else{
                        System.out.println("insufficient funds.");
                    }
                    break;
                    case 3:
                    System.out.println("enter new PIN:");
                    pin=scanner.nextInt();
                    System.out.println("PIN changes successfully.");
                    break;
                    case 4:
                    System.out.println("goodbye!");
                    break;
                    default:
                    System.out.println("invalid option.");
                } 
            }while(option!=4);
            }else{
                System.out.println("incorrect PIN.");
            }
            scanner.close();
        }
    }
    

