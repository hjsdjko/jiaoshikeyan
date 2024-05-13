package com.entity.view;

import com.entity.KeyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 科研项目
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @email
 * @date 2021-03-17
 */
@TableName("keyan")
public class KeyanView extends KeyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public KeyanView() {

	}

	public KeyanView(KeyanEntity keyanEntity) {
		try {
			BeanUtils.copyProperties(this, keyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
