import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Vector;

public class Njangi {
    static Vector<Person> Members;
    public Njangi() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("new Njangi created on the "+ dtf.format(now));

    }






    public static void addMembers() {
        String name;
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name of the member:");
        name=sc.nextLine();
        System.out.println("Enter the num of the member:");
        num=sc.nextInt();
        Person p= new Person(name,num);
        Members.add(p);
        System.out.println("Do you want to add another member\n 1. Yes 2.  NO");
        int choice;
        choice=sc.nextInt();
        if(choice==1){
            addMembers();
        }else {

        }
    }
    public static void viewMembers(){
        for (Person p:
                Members
             ) {
            System.out.println("--------------------");

            System.out.println("Name:"+ p.Name);
            System.out.println("phone:"+ p.phone);
            System.out.println("Contribution:"+ p.contribution);
            System.out.println("Debt:"+ p.debt);


            System.out.println("--------------------");
        }

    }

    public static void deleteMember(){
        Scanner sc = new Scanner(System.in);
        String name;
        for (Person p:
                Members
        ) {
            System.out.println("--------------------");
            System.out.println("Name:" + p.Name);
        }
        System.out.println("Enter the name of the person you want to delete");
        name=sc.nextLine();
        for (Person x: Members
             ) {
            if (name== x.Name){
                Members.remove(x);
            }
        }

    }
    public static void contribute(Person p){
        System.out.println("How much do you want to contribute: ");
        int contribution;
        Scanner sc = new Scanner(System.in);
        contribution=sc.nextInt();
        p.contribution= p.contribution+contribution;
    }
    public void Borrow(Person p){
        System.out.println("how much do you want to borrow: ");
        int debt = 0;
        Scanner sc = new Scanner(System.in);
        p.debt= p.debt+debt;
    }
    public void paydebt(){

        Scanner sc= new Scanner(System.in);
        int pay;
        System.out.println("How much do you want to pay:");
        pay= sc.nextInt();

    }

    static void ManageMembers() {
        System.out.println("1. add member\n 2. remove member \n 3. view members 0. To Main Menu");
        Scanner sc= new Scanner(System.in);
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                addMembers();
                break;
            case 2:
                deleteMember();
            case 3:
                viewMembers();
            default:
                ManageMembers();

        }

    }
    public static void ManageContributions() {
        System.out.println("Enter the Name of the person you want to Contribute");
        Scanner sc = new Scanner(System.in);
        String Name= sc.next();
        for (Person p:Members
             ) {
            if(p.Name==Name){
                contribute(p);
            }else{
                System.out.println("Wrong Name");
                ManageContributions();
            }
        }

    }
    public static void ManageDebts() {
        int choice;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the person you want manage debt");
        String name;
        name= sc.next();
        for (Person p : Members) {
            if (p.Name==name){
                System.out.println("1. pay debt\n 2. Borrow");
                choice= sc.nextInt();
                if(choice==1){
                    if(p.debt==0){
                        System.out.println("you dont owe anything");
                    }else{
                        System.out.println("how much do you want to pay");
                       int amount= sc.nextInt();

                        p.debt= p.debt-amount;

                    }
                }else if (choice==2){
                    System.out.println("how much do you want to borrow");
                    int amount= sc.nextInt();
                    p.debt= p.debt+amount;


                }
            }else{
                System.out.println("Wrong Name reEnter the Name");
                ManageDebts();

            }

        }


    }
}
