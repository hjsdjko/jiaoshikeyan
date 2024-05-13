package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.LaoshiDao;
import com.entity.LaoshiEntity;
import com.service.LaoshiService;
import com.entity.view.LaoshiView;

/**
 *  服务实现类
 * @since 2021-03-17
 */
@Service("laoshiService")
@Transactional
public class LaoshiServiceImpl extends ServiceImpl<LaoshiDao, LaoshiEntity> implements LaoshiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<LaoshiView> page =new Query<LaoshiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
