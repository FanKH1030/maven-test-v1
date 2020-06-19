package com.bea.service.impl;

import com.bea.mapper.ItemsMapper;
import com.bea.pojo.Items;
import com.bea.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by fandi on 2020/5/1 0001.
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAll() {
        return itemsMapper.selectByExample(null);
    }

    @Override
    public void insertItems(Items items) {
        itemsMapper.insert(items);
    }

    @Override
    public void updateItems(Items items) {
        itemsMapper.updateByPrimaryKey(items);
    }

    @Override
    public void deleteItems(Integer id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
