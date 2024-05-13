package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyanEntity;
import java.util.Map;

/**
 * 科研项目 服务类
 * @since 2021-03-17
 */
public interface KeyanService extends IService<KeyanEntity> {

     PageUtils queryPage(Map<String, Object> params);

}