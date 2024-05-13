package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.XueyuanDao;
import com.entity.XueyuanEntity;
import com.service.XueyuanService;
import com.entity.view.XueyuanView;

/**
 * 学院 服务实现类
 * @since 2021-03-17
 */
@Service("xueyuanService")
@Transactional
public class XueyuanServiceImpl extends ServiceImpl<XueyuanDao, XueyuanEntity> implements XueyuanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XueyuanView> page =new Query<XueyuanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
