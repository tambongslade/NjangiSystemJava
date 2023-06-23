import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Vector;

public class Njangi {
    public Njangi() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("new Njangi created on the "+ dtf.format(now));

    }

    Vector<Person> Members;

    public void addMembers() {
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
    public void viewMembers(){
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
    public void deleteMember(){
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
    public void contribute(Person p){
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
}
