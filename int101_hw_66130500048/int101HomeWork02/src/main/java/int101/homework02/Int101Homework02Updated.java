package int101.homework02;
import work01.Utilitor;
import work02.Person;
import work03.Account;

public class Int101Homework02Updated {

    public static void main(String[] args) {
        work01Utilitor();
        work02Person();
        work03Account();
    }
    static void work01Utilitor() {

        Utilitor u = new Utilitor();
        System.out.println(u.testString("Test  "));
        System.out.println(u.testPositive(100));
        System.out.println(u.computeIsbn10( 100000000));
    }
    static void work02Person() {

        Person thai = new Person("A","Thai");
        Person japanese = new Person("B","Japan");
        Person chinese = new Person("C","China");

        System.out.println(thai.getId() + thai.getFirstname() + thai.getLastname());

        thai.setFirstname("Thai");
        thai.setLastname("Chai");

        System.out.println(thai.equals(japanese));
        System.out.println(thai.toString());
        System.out.println(japanese.toString());
        System.out.println(chinese.toString());

    }
    static void work03Account() {

        Person thai = new Person("Chai","Thai");
        Person japanese = new Person("Mio","Japan");
        Person chinese = new Person("Lang","China");

        Account account1 = new Account(thai);
        Account account2 = new Account(japanese);
        Account account3 = new Account(chinese);

        account1.deposit(100000);
        account1.transfer(50000, account2);
        account3.deposit(1000);
        account3.withdraw(200);

        System.out.println(account1.equals(account2));

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());

    }
}
