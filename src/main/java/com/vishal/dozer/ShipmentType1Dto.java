package com.vishal.dozer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by aditya.mullela on 06/05/16.
 */

@Setter
@Getter
@NoArgsConstructor
public class ShipmentType1Dto {

    private String shipmentItem;
    private double itemPrice;
    private String itemType;
    //private String itemId;
    private int tax;
    private String owner;

}
