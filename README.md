CryptoExchange Simulation 

Overview

The "CryptoExchange" project, organized within the "Exchange" package, is a Java application simulating a cryptocurrency exchange. It employs object-oriented programming principles, featuring classes for coins, a crypto exchange, and a wallet. The main class, "apnaExchange," orchestrates user interactions, allowing simulated cryptocurrency transactions with encapsulation and modularity.

Features
Coins: Define and select various cryptocurrencies with specified price ranges.
       (you can also add your own coins by simply add that in the array with its min and max range)
Market : As i didnt added any api or FIX libraray so we are making our own market by simulating  random price.        
Crypto Exchange: Simulate buying cryptocurrencies based on desired prices and amounts.
Wallet Management: Utilize a wallet to track and display funds for different cryptocurrencies.


How to Use

Compile:
javac Exchange/*.java apnaExchange.java

Run:
java apnaExchange

Follow prompts:

Choose a cryptocurrency and enter desired price and amount for a simulated order.
View acquired coins and optionally display wallet funds.
Example

Choose a coin:
1. BTC
2. ETH
3. BNB
4. SOL
 
Enter your choice: 1

Enter desired price: 55

Enter Amount of USDT you wanted to order of: 200

Order details:

Coin: BTC

Desired Price: 55

Amount to Buy: 200.0

Current Price: 55

Order has been placed! Funds added to wallet.

You got 3.6363636363636362 in 55

Do you want to view your funds? (yes/no): yes

Wallet Funds:

BTC: 3.6363636363636362

Notes
Adjust the number and details of coins as needed in the apnaExchange class.
The program demonstrates object-oriented principles, encapsulation, and modularity.
Feel free to customize and extend this simulated crypto exchange for your projects. If you encounter any issues or have suggestions for improvements, please contribute or open an issue.
