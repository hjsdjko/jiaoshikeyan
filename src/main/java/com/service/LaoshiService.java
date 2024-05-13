package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaoshiEntity;
import java.util.Map;

/**
 *  服务类
 * @since 2021-03-17
 */
public interface LaoshiService extends IService<LaoshiEntity> {

     PageUtils queryPage(Map<String, Object> params);

}