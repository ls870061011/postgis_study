package com.postgis.demo.model;

import java.io.Serializable;

import lombok.Data;

/**
 * map_elements
 *
 * @author
 */
@Data
public class MapElements implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 地图元素名称
     */
    private String name;

    /**
     * 地图元素位置经度
     */
    private Float longitude;

    /**
     * 地图元素位置经度
     */
    private Float latitude;

    /**
     * 空间信息转换为字符串
     */
    private String geoStr;
}