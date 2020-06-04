package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public ProductOrderService(final InformationService informationService,
                           final SaleService saleService,
                           final SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public SaleDto process(final SaleRequest saleRequest) {
        boolean isRented = saleService.sale(saleRequest.getUser(), saleRequest.getPurchasesDate());

        if(isRented) {
            informationService.inform(saleRequest.getUser());
            saleRepository.createSale(saleRequest.getUser(), saleRequest.getPurchasesDate());
            return new SaleDto(saleRequest.getUser(), true);
        } else {
            return new SaleDto(saleRequest.getUser(), false);
        }
    }
}