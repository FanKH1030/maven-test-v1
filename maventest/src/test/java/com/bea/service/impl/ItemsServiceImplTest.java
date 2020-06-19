package com.bea.service.impl;

import com.bea.pojo.Items;
import com.bea.service.ItemsService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fandi on 2020/5/1 0001.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class ItemsServiceImplTest {
    @Autowired
    private ItemsService itemsService;

    @Test
    public void findAll() throws Exception {
        List<Items> list = itemsService.findAll();
        list.forEach((items) -> System.out.println(items));
    }

    @Test
    public void insertItems() throws Exception {
        Items items = new Items();
        items.setName("alibaba");
        items.setPrice(1000.0f);
        items.setPic("lalalal");
        items.setCreatetime(new Date());
        items.setDetail("杨云金，我们就这样吧！");

        itemsService.insertItems(items);
    }

    @Test
    public void updateItems() throws Exception {
        Items items = new Items();
        items.setName("alibaba");
        items.setPrice(1000.0f);
        items.setPic("lalalal");
        items.setCreatetime(new Date());
        items.setDetail("杨云金，我们就这样吧！");

        items.setId(3);
        itemsService.updateItems(items);
    }

    @Test
    public void deleteItems() throws Exception {
        itemsService.deleteItems(2);
    }

}