package com.dao;

import com.entity.NewsEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.NewsView;

/**
 * 新闻资讯 Dao 接口
 *
 * @since 2021-03-17
 */
public interface NewsDao extends BaseMapper<NewsEntity> {

   List<NewsView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
