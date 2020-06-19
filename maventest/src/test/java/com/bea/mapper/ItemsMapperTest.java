package com.bea.mapper;

import com.bea.pojo.Items;
import com.bea.pojo.ItemsExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fandi on 2020/5/1 0001.
 */
public class ItemsMapperTest {
    private ItemsMapper itemsMapper;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        itemsMapper = applicationContext.getBean(ItemsMapper.class);
    }

    @Test
    public void selectByExample() throws Exception {
        List<Items> list = itemsMapper.selectByExample(null);
        list.forEach((items)-> System.out.println(items));
    }

    @Test
    public void insert() throws Exception {
        Items items = new Items();
        items.setName("alibaba");
        items.setPrice(1000.0f);
        items.setPic("lalalal");
        items.setCreatetime(new Date());
        items.setDetail("杨云金，我们就这样吧！");

        itemsMapper.insert(items);
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
        Items items = new Items();
        items.setName("alibaba");
        items.setPrice(1000.0f);
        items.setPic("lalalal");
        items.setCreatetime(new Date());
        items.setDetail("杨云金，我们就这样吧！");

        items.setId(2);
        itemsMapper.updateByPrimaryKey(items);
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {
        itemsMapper.deleteByPrimaryKey(8);
    }

}