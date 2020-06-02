package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 13.2
        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        SaleRequest saleRequest = saleRequestRetriever.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new GamesSaleService(), new GamesSalesRepository());
        productOrderService.process(saleRequest);
    }
}
