package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanxiEntity;
import java.util.Map;

/**
 * 院系 服务类
 * @since 2021-03-17
 */
public interface YuanxiService extends IService<YuanxiEntity> {

     PageUtils queryPage(Map<String, Object> params);

}