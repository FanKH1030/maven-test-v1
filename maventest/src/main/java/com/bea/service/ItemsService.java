package com.bea.service;

import com.bea.pojo.Items;

import java.util.List;

/**
 * Created by fandi on 2020/5/1 0001.
 */
public interface ItemsService {

    List<Items> findAll();

    void insertItems(Items items);

    void updateItems(Items items);

    void deleteItems(Integer id);
}
