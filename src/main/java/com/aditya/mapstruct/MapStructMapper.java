package com.aditya.mapstruct;

import com.vishal.dozer.Item;
import com.vishal.dozer.ShipmentType1Dto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * Created by aditya.mullela on 09/05/16.
 */


@Mapper
public interface MapStructMapper {

    MapStructMapper MAPPER = Mappers.getMapper( MapStructMapper.class );

    //@Mappings({
           // @Mapping(source = "itemId ", target = "shipmentItem"),
           // @Mapping(source = "itemPrice", target = "itemPrice"),

    //@Mappings({
           // @Mapping(source = "itemId ", target = "shipmentItem"),
           // @Mapping(source = "itemPrice", target = "itemPrice"),
    @Mapping(source = "itemId", target = "shipmentItem")
    ShipmentType1Dto ItemtoShipmentType1Dto(Item item);

}
