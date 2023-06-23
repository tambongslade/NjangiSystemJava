
import java.lang.management.ManagementFactory;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("======== welcome to our njangi system=========");
        System.out.println("1. Manage Memebers");
        System.out.println("2. Manage contribution");
        System.out.println("3. Manage debt");
        System.out.println("0. Exit");
        System.out.print("choix: ");
        Njangi njangi1= new Njangi();
        int choice;
        Scanner sc= new Scanner(System.in);
        choice=sc.nextInt();
        switch (choice){
            case 1:
                    Njangi.ManageMembers();
                break;
            case 2:
                Njangi.ManageContributions();
                break;
            case 3:
                Njangi.ManageDebts();
                break;
            default:
                System.out.println("invalid option");
        }


        }








}
