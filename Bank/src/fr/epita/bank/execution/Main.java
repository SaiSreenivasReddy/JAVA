package fr.epita.bank.execution;

import fr.epita.bank.datamodel.*;

import java.util.Scanner;

public class Main {
    public static final double COMMISSION_RATE = 0.01;
    public static double test;

    public static void main(String[] args) {
        System.out.println("Welcome to Bank Application!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter ticker name of the stock you want to define: ");
        String tickerName = scanner.nextLine();


        // 1.initialize gold stock
        Stock stock = new Stock();
        stock.setTicker(tickerName);
        stock.setCurrentPrice(3400.00);

        // 2.initialize customer
        Customer customer = new Customer();
        customer.setName("Sai");


        // 3.initialize account
        InvestmentAccount investmentAccount = new InvestmentAccount();
        investmentAccount.setAccountNumber("744171313");
        investmentAccount.setBalance(100000.00);
        investmentAccount.setCustomer(customer);

        // 4.create an order to buy 1 unit of gold
        Double currentPrice = stock.getCurrentPrice();
        int quantity=1;
        double value = currentPrice* quantity;
        StockOrder order = new StockOrder();
        order.setStock(stock);
        order.setInvestmentAccount(investmentAccount);
        order.setQuantity(quantity);
        order.setPrice(currentPrice);
        order.setCommission(value * COMMISSION_RATE);

        investmentAccount.setBalance(investmentAccount.getBalance() - value- order.getCommission());

        // 5.check and display the balance of the account
        System.out.println("final balance: ");
        System.out.println(investmentAccount.getBalance());



        //==

        Customer suraj=new Customer();
        suraj.setName("Suraj");


        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.setCustomer(suraj);
        savingsAccount.setBalance(100000.00);
        savingsAccount.setAccountNumber("780883023");
        savingsAccount.setInterestRate(0.05);

        Double currentBalance = savingsAccount.getBalance();
        Double gain = currentBalance * savingsAccount.getInterestRate();
        savingsAccount.setBalance(currentBalance + gain);

        System.out.println("final balance: " + savingsAccount.getBalance());



        scanner.close();
    }
}