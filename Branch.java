import java.util.ArrayList;

public class Branch {
    public String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String name, double startBalance) {
        if(startBalance >=0) {
            customers.add(new Customer(name, startBalance));
            System.out.println("Customer " + name + ", with balance: " +
                    startBalance + " was added to " + this.name + " branch");
            return true;
        } else {
            System.out.println("Negative initial balance, customer " +
                    name + " was not added to " + this.name + " branch");
            return false;
        }
    }

    public boolean addTransaction(int customerNr, double transaction) {
        if(customerNr <customers.size()) {
            return customers.get(customerNr).addTransaction(transaction);
        }
        System.out.println("Transaction unsuccessful, choose valid customer");
        return false;
    }

    public String getName() {
        return name;
    }

    public String printCustomers(boolean withTransactions) {
        String result = "Branch " + name + ", customer list:";
        for(int i =0; i<customers.size(); i++) {
            result += "\n" + (i+1) + ". " + customers.get(i).printCustomers(withTransactions);
        }
        return result;
    }

}
