package com.postgis.demo.service.impl;

import com.postgis.demo.dao.MapElementsMapper;
import com.postgis.demo.model.MapElements;
import com.postgis.demo.service.MapElementsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 地图信息表(MapElements)表服务实现类
 *
 * @author makejava
 * @since 2020-12-25 15:35:33
 */
@Service("mapElementsService")
public class MapElementsServiceImpl implements MapElementsService {
    @Resource
    private MapElementsMapper mapElementsMapper;

    @Override
    public MapElements findById(Integer id) {
        return mapElementsMapper.findById(id);
    }

    @Override
    public void addMapElement(MapElements mapElements) {
        mapElementsMapper.addMapElement(mapElements);
    }

}