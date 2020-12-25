package com.postgis.demo.service;

import com.postgis.demo.model.MapElements;

/**
 * 地图信息表(MapElements)表服务接口
 *
 * @author makejava
 * @since 2020-12-25 15:41:10
 */
public interface MapElementsService {

    /**
     * @param id
     * @return 依据id返回数据
     */
    MapElements findById(Integer id);

    /**
     * @param mapElements
     */
    void addMapElement(MapElements mapElements);

}