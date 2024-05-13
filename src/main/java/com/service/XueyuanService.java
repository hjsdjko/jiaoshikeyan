package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuanEntity;
import java.util.Map;

/**
 * 学院 服务类
 * @since 2021-03-17
 */
public interface XueyuanService extends IService<XueyuanEntity> {

     PageUtils queryPage(Map<String, Object> params);

}