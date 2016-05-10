package com.vishal.dozer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by k.vishal on 08/04/16.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String itemId;
    private String itemName;
    private double itemPrice;
    private String itemType;
    private String requestID;

}
