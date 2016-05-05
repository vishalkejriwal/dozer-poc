package com.vishal.dozer;

import org.dozer.DozerBeanMapper;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.vishal on 07/04/16.
 */
public class DozerDemo {

    public static void main(String str[]) {

        int iterate = 1, total = iterate*1000000;
        long totalns,totalms,perns,perms;
        ShipmentDao shipmentDao = new ShipmentDao();
        Item item = new Item();

        DozerBeanMapper mapper = new DozerBeanMapper();
        List myMappingFiles = new ArrayList();
        myMappingFiles.add("dozerMapping.xml");
        mapper.setMappingFiles(myMappingFiles);

        item.setItemId("itemIdIsString");
        item.setItemName("This is item name");
        item.setItemPrice(123.32);

        shipmentDao.setShipmentId("xyz");
        shipmentDao.setItemQuantity(2);
        shipmentDao.setPrice(2332.21);
        shipmentDao.setSize(299.21);
        shipmentDao.setItem(item);

        System.out.println("**************************DOZER MAPPING****************************************");


        long start = System.nanoTime();
        for (int ii = 0; ii < iterate; ii++) {
            ShipmentDto shipmentDto = new ShipmentDto();
            shipmentDto = mapper.map(shipmentDao, ShipmentDto.class);

            System.out.println(shipmentDto.getId());
            System.out.println(shipmentDto.getItemQuantity());
            System.out.println(shipmentDto.getPrice());
            System.out.println(shipmentDto.getSize());
            System.out.println(shipmentDto.getOwner());
            System.out.println(shipmentDto.getItemId());
            System.out.println(shipmentDto.getItemPrice());
            System.out.println(shipmentDto.getItemName());
        }
        long elapsed = System.nanoTime() - start;
        totalns = elapsed;
        totalms = elapsed/1000000;
        perns = elapsed/iterate;
        perms = elapsed/total;
        System.out.println("elapsed time = " + totalns + " nano seconds" + " OR " + totalms + " milliseconds");
//        System.out.println((elapsed * 1000.0) / iterate + " microseconds per execution");
        System.out.println(perns + " nano seconds "  + " OR " + perms + " milliseconds "+ "per execution");

        System.out.println("**************************MANUAL****************************************");

        start = System.nanoTime();
        for (int ii = 0; ii < iterate; ii++) {
            ShipmentDto shipmentDto = new ShipmentDto();
            shipmentDto.setSize(shipmentDao.getSize());
            shipmentDto.setItemQuantity(shipmentDao.getItemQuantity());
            shipmentDto.setPrice(shipmentDao.getPrice());
            shipmentDto.setId(shipmentDao.getShipmentId());
            shipmentDto.setItemPrice(String.valueOf(shipmentDao.getItem().getItemPrice()));
            shipmentDto.setItemId(shipmentDao.getItem().getItemId());
            shipmentDto.setItemName(shipmentDao.getItem().getItemName());

//            System.out.println(shipmentDto.getId());
//            System.out.println(shipmentDto.getItemQuantity());
//            System.out.println(shipmentDto.getPrice());
//            System.out.println(shipmentDto.getSize());
//            System.out.println(shipmentDto.getOwner());
//            System.out.println(shipmentDto.getItemId());
//            System.out.println(shipmentDto.getItemPrice());
//            System.out.println(shipmentDto.getItemName());
        }
        elapsed = System.nanoTime() - start;
        totalns = elapsed;
        totalms = elapsed/1000000;
        perns = (elapsed)/(iterate);
        perms = (elapsed/(iterate*1000000));
        System.out.println("elapsed time = " + totalns + " nano seconds" + " OR " + totalms + " milliseconds");
//        System.out.println((elapsed * 1000.0) / iterate + " microseconds per execution");
        System.out.println(perns + " nano seconds "  + " OR " + perms + " milliseconds "+ "per execution");
//        System.out.println(shipmentDto);
//        System.out.println(shipmentDto.getId());
//        System.out.println(shipmentDto.getItemQuantity());
//        System.out.println(shipmentDto.getPrice());
//        System.out.println(shipmentDto.getSize());
//        System.out.println(shipmentDto.getOwner());
    }
}
