// IWallet.java
package Exchange;

public interface IWallet {
    void addFunds(String coin, double amount);
    double getBalance(String coin);
    void withdrawFunds(String coin, double amount);
    void displayFunds();
}
