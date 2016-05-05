package com.vishal.dozer;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by k.vishal on 07/04/16.
 */

@Getter
@Setter

public class ShipmentDto {
    private String id;
    private double size;
    private double itemQuantity;
    private double price;
    private String owner;
    private String itemId;
    private String itemPrice;
    private String itemName;
}
