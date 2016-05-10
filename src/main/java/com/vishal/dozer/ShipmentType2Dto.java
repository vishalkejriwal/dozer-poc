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
public class ShipmentType2Dto {

    private String itemName;
    private double itemPrice;
    private String itemType;
    private String itemId;
    private int tax;
}
