import Exchange.*;

import java.util.Random;
import java.util.Scanner;

public class apnaExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // yahan we can Create coins
        Coin[] coins = {
                new Coin("BTC", 50, 60),
                new Coin("ETH", 20, 30),
                new Coin("BNB", 10, 13),
                new Coin("SOL", 11, 14)
                // Add more coins as needed
        };

        // Display coin options
        System.out.println("Choose a coin:");
        for (int i = 0; i < coins.length; i++) {
            System.out.println((i + 1) + ". " + coins[i].getName());
        }

        int selectedCoin = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Check if the selected coin index is valid means if it will not be more or
        // less than number of coins
        if (selectedCoin < 1 || selectedCoin > coins.length) {
            System.out.println("Invalid choice. Exiting...");
            scanner.close();
            return;
        }
        // Create a Wallet object with a capacity of 10 (you can adjust as needed)
        IWallet wallet = new Wallet(10);

        // Create a CryptoExchange object for the chosen coin
        CryptoExchange cryptoExchange = new CryptoExchange(coins[selectedCoin - 1], wallet);
        // Additional user input for desired price and amount
        System.out.print("Enter desired price: ");
        int desiredPrice = scanner.nextInt(); // Change to int

        System.out.print("Enter Amount of USDT you wanted to order of: ");
        double amountToBuy = scanner.nextDouble();

        // Simulate the order
        cryptoExchange.simulateOrder(desiredPrice, amountToBuy);

        double coi = (amountToBuy / desiredPrice);

        System.out.println("You got" + " " + coi + " " + "in " + desiredPrice);

        System.out.print("Do you want to view your funds? (yes/no): ");
        String viewFundsOption = scanner.next().toLowerCase();

        if (viewFundsOption.equals("yes")) {
            // Display funds
            wallet.displayFunds();
        }

        scanner.close();
    }
}