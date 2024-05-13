package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ConfigEntity;
import java.util.Map;

/**
 * 轮播图 服务类
 * @since 2021-03-17
 */
public interface ConfigService extends IService<ConfigEntity> {

     PageUtils queryPage(Map<String, Object> params);

}