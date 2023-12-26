// Wallet.java
package Exchange;

public class Wallet implements IWallet {
    private String[] coins;
    private double[] balances;

    public Wallet(int capacity) {
        this.coins = new String[capacity];
        this.balances = new double[capacity];
    }

    @Override
    public void addFunds(String coin, double amount) {
        for (int i = 0; i < coins.length; i++) {
            if (coin.equals(coins[i])) {
                balances[i] += amount;
                return;
            }
        }
        // Coin not found, add new entry
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == null) {
                coins[i] = coin;
                balances[i] = amount;
                return;
            }
        }
    }

    @Override
    public double getBalance(String coin) {
        for (int i = 0; i < coins.length; i++) {
            if (coin.equals(coins[i])) {
                return balances[i];
            }
        }
        return 0.0;
    }

    // @Override
    // public void withdrawFunds(String coin, double amount) {
    //     for (int i = 0; i < coins.length; i++) {
    //         if (coin.equals(coins[i])) {
    //             double currentBalance = balances[i];
    //             if (currentBalance >= amount) {
    //                 balances[i] -= amount;
    //             } else {
    //                 System.out.println("Insufficient funds");
    //             }
    //             return;
    //         }
    //     }
    // }

    @Override
    public void displayFunds() {
        System.out.println("Wallet Funds:");
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] != null) {
                System.out.println(coins[i] + ": " + balances[i]);
            }
        }
    }
}
