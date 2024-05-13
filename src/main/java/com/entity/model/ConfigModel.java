package com.entity.model;

import com.entity.ConfigEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 轮播图
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-17
 */
public class ConfigModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Long id;


    /**
     * 轮播图名称
     */
    private String name;


    /**
     * 轮播图
     */
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
