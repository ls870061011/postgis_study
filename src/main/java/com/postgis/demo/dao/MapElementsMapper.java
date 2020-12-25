package com.postgis.demo.dao;

import com.postgis.demo.model.MapElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MapElementsMapper {

    /**
     * @param id id
     * @return 依据id返回数据
     */
    MapElements findById(Integer id);

    void addMapElement(MapElements record);

    /**
     * @return 返回全部的mapElement
     */
    List<MapElements> findAll();

    /**
     * 条件查找
     * @param mapElements
     * @return 复合条件的地图元素
     */
    List<MapElements> findMapElementByCondition(MapElements mapElements);


    /**
     * @param mapElements
     * @return x修改后的地图元素
     */
    void updateMapElement(MapElements mapElements);

    /**
     * @param id id
     */
    void deleteMapElement(Long id);

    /**
     * 圆形区域查找
     * @param geometry 地理信息
     * @param radius 区域半径，单位为km
     * @return 以给定点为原型，radius为半径的区域中满足条件的元素的集合
     */
    List<MapElements> findMapElementByCircle(@Param("geometry") String geometry,
                                            @Param("radius") double radius);

    /**
     * 多边形区域查找
     * @param geometry 对变形地理信息
     * @return 给定多边形区域中满足条件的元素的集合
     */
    List<MapElements> findMapElementByPolygon(String geometry);

}