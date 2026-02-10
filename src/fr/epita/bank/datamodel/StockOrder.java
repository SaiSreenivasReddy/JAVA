package fr.epita.bank.datamodel;

public class StockOrder {
    private Integer id;
    private Integer quantity;
    private Double price;
    private Double commission;

    private Stock stock;
    private InvestmentAccount investmentAccount;
}
