package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProducersList {
    private final List <Producer> listOfProducers = new ArrayList<>();

    public void revealProducersMap() {
        listOfProducers.add(new Producer(new NipAndRegon("12311223123", "123123123"), "ExtraFoodShop"
                , new ExtraFoodShopSupply(), new ExtraFoodShopOrderImplementation()));
        listOfProducers.add(new Producer(new NipAndRegon("12345678910", "123456789"), "HealthyShop"
                , new HealthyShopSupply(), new HealthyShopOrderImplementation()));
        listOfProducers.add(new Producer(new NipAndRegon("98765432100", "987654321"), "GlutenFreeShop"
                , new GlutenFreeShopSupply(), new GlutenFreeShopOrderImplementation()));
    }

    public Producer getProducer(String producerName) {
        List<Producer> producer = listOfProducers.stream()
                .filter(e -> e.getName().equals(producerName))
                .collect(Collectors.toList());

        return producer.get(0);
    }
}
