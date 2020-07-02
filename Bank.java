import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(String name) {
        branches.add(new Branch(name));
    }

    public boolean addCustomer(int branchNr, String customerName, double startBalance) {
        if(checkBranch(branchNr)) {
            return branches.get(branchNr).addCustomer(customerName, startBalance);
        }
        return false;
    }

    private boolean checkBranch(int branchNr) {
        if(branchNr >=branches.size()) {
            System.out.println("Chosen branch does not exist");
            return false;
        }
        return true;
    }

    public boolean addTransaction(int branchNr, int customerNr, double transaction) {
        if(checkBranch(branchNr)) {
            return branches.get(branchNr).addTransaction(customerNr, transaction);
        }
        return false;
    }

    public String printCustomers(int branchNr, boolean withTransactions) {
        if(checkBranch(branchNr)) {
            return branches.get(branchNr).printCustomers(withTransactions);
        }
        return "Choose valid branch";
    }

}
