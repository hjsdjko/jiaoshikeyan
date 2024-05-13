package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 科研项目
 *
 * @email
 * @date 2021-03-17
 */
@TableName("keyan")
public class KeyanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public KeyanEntity() {

    }

    public KeyanEntity(T t) {
    try {
    BeanUtils.copyProperties(this, t);
    } catch (IllegalAccessException | InvocationTargetException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 研发老师
     */
    @TableField(value = "fjh_types")

    private Integer fjhTypes;


    /**
     * 成果名称
     */
    @TableField(value = "name")

    private String name;


    /**
     * 研发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "keyan_time")

    private Date keyanTime;


    /**
     * 展示图片
     */
    @TableField(value = "img_photo")

    private String imgPhoto;


    /**
     * 成果描述
     */
    @TableField(value = "chengguo_content")

    private String chengguoContent;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：研发老师
	 */
    public Integer getFjhTypes() {
        return fjhTypes;
    }


    /**
	 * 获取：研发老师
	 */

    public void setFjhTypes(Integer fjhTypes) {
        this.fjhTypes = fjhTypes;
    }
    /**
	 * 设置：成果名称
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：成果名称
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：研发时间
	 */
    public Date getKeyanTime() {
        return keyanTime;
    }


    /**
	 * 获取：研发时间
	 */

    public void setKeyanTime(Date keyanTime) {
        this.keyanTime = keyanTime;
    }
    /**
	 * 设置：展示图片
	 */
    public String getImgPhoto() {
        return imgPhoto;
    }


    /**
	 * 获取：展示图片
	 */

    public void setImgPhoto(String imgPhoto) {
        this.imgPhoto = imgPhoto;
    }
    /**
	 * 设置：成果描述
	 */
    public String getChengguoContent() {
        return chengguoContent;
    }


    /**
	 * 获取：成果描述
	 */

    public void setChengguoContent(String chengguoContent) {
        this.chengguoContent = chengguoContent;
    }

    @Override
    public String toString() {
    return "Keyan{" +
            "id=" + id +
            ", fjhTypes=" + fjhTypes +
            ", name=" + name +
            ", keyanTime=" + keyanTime +
            ", imgPhoto=" + imgPhoto +
            ", chengguoContent=" + chengguoContent +
    "}";
    }
    }
