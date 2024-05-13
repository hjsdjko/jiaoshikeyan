package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.YuanxiDao;
import com.entity.YuanxiEntity;
import com.service.YuanxiService;
import com.entity.view.YuanxiView;

/**
 * 院系 服务实现类
 * @since 2021-03-17
 */
@Service("yuanxiService")
@Transactional
public class YuanxiServiceImpl extends ServiceImpl<YuanxiDao, YuanxiEntity> implements YuanxiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<YuanxiView> page =new Query<YuanxiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
