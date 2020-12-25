package com.postgis.demo.controller;

import com.postgis.demo.model.MapElements;
import com.postgis.demo.service.MapElementsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(value = "mapElements")
@RestController
@RequestMapping("mapElements")
public class MapElementsController {

    @Autowired
    private MapElementsService mapElementsService;

    @ApiOperation("新增地理元素")
    @PostMapping("/addMapElement")
    public MapElements addMapElement(@RequestBody MapElements mapElements) {
        mapElements.setGeoStr(geometryToString(mapElements.getLongitude(), mapElements.getLatitude()));
        mapElementsService.addMapElement(mapElements);
        Integer id = mapElements.getId();
        return mapElementsService.findById(id);
    }

    private String geometryToString(double longitude, double latitude) {
        String geoStr = "POINT" + "(" + longitude + " " + latitude + ")";
        return geoStr;
    }

}