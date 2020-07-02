public class Main {

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        bank1.addBranch("Oslo");
        bank1.addBranch("Bergen");

        bank1.addCustomer(0, "John",-100);
        bank1.addCustomer(0, "Jim",200);
        bank1.addCustomer(4, "Jack",5);
        bank1.addCustomer(0, "Tom",50);

        bank1.addTransaction(0, 1, -10);
        bank1.addTransaction(2,2,1500);
        bank1.addTransaction(0,2,1500);
        bank1.addTransaction(0,1,980);


        bank1.addCustomer(1, "Jacky",1);
        bank1.addCustomer(1, "Tommy",0);

        bank1.addTransaction(1,0,-1);
        bank1.addTransaction(1,0,150);
        bank1.addTransaction(1,1,98);
        bank1.addTransaction(1,1,-90);

        System.out.println(bank1.printCustomers(2, false));
        System.out.println(bank1.printCustomers(0, true));
        System.out.println(bank1.printCustomers(1, true));

    }
}
