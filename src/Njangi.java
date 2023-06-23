import java.util.Scanner;
import java.util.Vector;

public class Njangi {
    Vector<Person> Members;

    public void addMembers(Person p) {
        Members.add(p);
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
    public void deleteMember(Person p){
        Members.remove(p);
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
    public void paydebt(Person p){
        System.out.println("");
    }
}
