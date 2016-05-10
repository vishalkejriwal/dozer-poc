package com.vishal.dozer;

/**
 * Created by aditya.mullela on 09/05/16.
 */
public class MapStructDemo {

    public static void main(String[] args){

    Item item = new Item();

    item.setItemId("ABC123");
    item.setItemName("itemIdIsString");
    item.setItemPrice(23);
    item.setItemType("electronic");
    item.setRequestID("REQ12345");

    ShipmentType1Dto shipmentType1Dto = MapStructMapper.MAPPER.ItemtoShipmentType1Dto(item);


    System.out.println(shipmentType1Dto.getItemType());
}

}
