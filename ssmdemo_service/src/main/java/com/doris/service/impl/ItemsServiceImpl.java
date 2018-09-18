package com.doris.service.impl;

import com.doris.dao.ItemsDAO;
import com.doris.entity.Items;
import com.doris.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * desc:
 * author: ailinxi
 * date: 2018/9/17.
 */
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDAO itemsDAO;
    public Items queryById(int id) {
        return itemsDAO.queryById(id);
    }
}
