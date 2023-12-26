package Exchange;

import java.util.Random;

public class CryptoExchange {
    private Coin coin;
    private int currentPrice;
    private IWallet wallet;

    public CryptoExchange(Coin coin, IWallet wallet) {
        this.coin = coin;
        this.currentPrice = generateRandomPrice();
        this.wallet = wallet;
    }

    private int generateRandomPrice() {
        Random rand = new Random();
        int minPrice = (int) coin.getMinPrice();
        int maxPrice = (int) coin.getMaxPrice();
        return minPrice + rand.nextInt(maxPrice - minPrice + 1);
    }

    public void simulateOrder(int desiredPrice, double amountToBuy) {
        System.out.println("Order details:");
        System.out.println("Coin: " + coin.getName());
        System.out.println("Desired Price: " + desiredPrice);
        System.out.println("Amount to Buy: " + amountToBuy);

        while (currentPrice != desiredPrice) {
            System.out.println("Current Price: " + currentPrice);
            try {
                Thread.sleep(2000); // Wait for 10 seconds between iterations
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentPrice = generateRandomPrice();
        }

        // System.out.println("Order has been placed!");

        // Simulate the order
        if (currentPrice == desiredPrice) {
            wallet.addFunds(coin.getName(), amountToBuy);
            System.out.println("Order has been placed! Funds added to wallet.");
        } else {
            System.out.println("Order failed. Prices did not match.");
        }
    }
}