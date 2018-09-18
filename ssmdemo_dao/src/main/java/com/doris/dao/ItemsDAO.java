package com.doris.dao;

import com.doris.entity.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * desc:
 * author: ailinxi
 * date: 2018/9/17.
 */
@Component
public interface ItemsDAO {
    @Select("select * from items where id = #{id}")
    public Items queryById(int id);
}
