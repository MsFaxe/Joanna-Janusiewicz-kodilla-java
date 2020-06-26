package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("1234/xyz");
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        Product pc = new Product("personal computer");
        productDao.save(pc);
        int pcId = pc.getId();

        Product nb = new Product("notebook");
        productDao.save(nb);
        int nbId = nb.getId();

        Item item1 = new Item (pc, new BigDecimal(7000), 1);
        Item item2 = new Item (pc, new BigDecimal(7000), 2);
        Item item3 = new Item (nb, new BigDecimal(4500), 2);

        //When
        pc.getProductItems().add(item1);
        pc.getProductItems().add(item2);
        nb.getProductItems().add(item1);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        List<Item> readInvoice = invoice.getItems();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(3, readInvoice.size());
        Assert.assertEquals(2, pc.getProductItems().size());
        Assert.assertEquals(1, nb.getProductItems().size());

        //CleanUp
        try {
            productDao.deleteById(pcId);
            productDao.deleteById(nbId);
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
            //do nothing
        }

    }
}
