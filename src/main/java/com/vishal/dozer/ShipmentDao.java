package com.vishal.dozer;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by k.vishal on 07/04/16.
 */

@Getter
@Setter

public class ShipmentDao {
    private String shipmentId;
    private double size;
    private int itemQuantity;
    private double price;
    private Item item;

}
