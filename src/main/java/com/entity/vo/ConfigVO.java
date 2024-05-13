package com.entity.vo;

import com.entity.ConfigEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 轮播图
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-17
 */
@TableName("config")
public class ConfigVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Long id;


    /**
     * 轮播图名称
     */

    @TableField(value = "name")
    private String name;


    /**
     * 轮播图
     */

    @TableField(value = "idcard_photo")
    private String idcardPhoto;


    /**
	 * 设置：主键
	 */
    public Long getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Long id) {
        this.id = id;
    }
    /**
	 * 设置：轮播图名称
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：轮播图名称
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：轮播图
	 */
    public String getIdcardPhoto() {
        return idcardPhoto;
    }


    /**
	 * 获取：轮播图
	 */

    public void setIdcardPhoto(String idcardPhoto) {
        this.idcardPhoto = idcardPhoto;
    }

}
