package com.vishal.dozer;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.vishal on 07/04/16.
 */

/*
public class DozerDemo {


    public static void main(String str[]) throws MappingException {

        //int iterate = 1, total = iterate*1000000;
        //long totalns,totalms,perns,perms;
        ShipmentType1Dto shipmentType1Dto = new ShipmentType1Dto();
        ShipmentType2Dto shipmentType2Dto = new ShipmentType2Dto();
        ShipmentType3Dto shipmentType3Dto = new ShipmentType3Dto();

        Item item = new Item();

        DozerBeanMapper mapper = new DozerBeanMapper();
        List myMappingFiles = new ArrayList();

        myMappingFiles.add("dozerMapping.xml");
        mapper.setMappingFiles(myMappingFiles);

        //map-null
        // bean factory
        //date-format
        //map-empty-string
        //map-id
        //relationship-type
        //stop-on-errors
        //trim strings
        //type
        //wildcard

        item.setItemId("ABC123");
        item.setItemName("itemIdIsString");
        item.setItemPrice(23);
        item.setItemType("electronic");
        item.setRequestID("REQ12345");

        shipmentType1Dto = mapper.map(item, ShipmentType1Dto.class);

        System.out.println(shipmentType1Dto.getShipmentItem());
        System.out.println(shipmentType1Dto.getItemPrice());
        System.out.println(shipmentType1Dto.getItemType());
        System.out.println(shipmentType1Dto.getOwner());
        System.out.println(shipmentType1Dto.getTax());



        shipmentType2Dto = mapper.map(item, ShipmentType2Dto.class);

        System.out.println(shipmentType2Dto.getItemId());
        System.out.println(shipmentType2Dto.getItemPrice());
        System.out.println(shipmentType2Dto.getItemType());
        System.out.println(shipmentType2Dto.getItemName());
        System.out.println(shipmentType2Dto.getTax());

        System.out.println("**************************DOZER MAPPING****************************************");
    }
/*
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
    */
