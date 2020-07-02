import java.util.ArrayList;

public class Customer {
    
    private String name;
    private ArrayList<Double> transactions;
    private double balance;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(transaction);
        this.balance += transaction;
    }

    public boolean addTransaction(double transaction) {
        if(balance+transaction >=0) {
            balance += transaction;
            transactions.add(transaction);
            System.out.println("Customer " + this.name + ", transaction successful " +
                    "(" + transaction + "). New balance: " + this.balance);
            return true;
        }
        else {
            System.out.println("Transaction (" + transaction +
                    ") cancelled, insufficient funds on " + this.name + "\'s balance (" + balance +")");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printCustomers(boolean withTranstions) {
        String result = "customer: " + name + ", balance: " + balance;
        if(!withTranstions) return result;
        else {
            result += "  Transactions:  \t";
            for(Double i: transactions) {
               result += " | " + i;
            }
        }
        return result;
    }
}
