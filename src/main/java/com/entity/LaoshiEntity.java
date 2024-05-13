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
 * 
 *
 * @email
 * @date 2021-03-17
 */
@TableName("laoshi")
public class LaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public LaoshiEntity() {

    }

    public LaoshiEntity(T t) {
    try {
    BeanUtils.copyProperties(this, t);
    } catch (IllegalAccessException | InvocationTargetException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }


    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户名称
     */
    @TableField(value = "name")

    private String name;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 联系方式
     */
    @TableField(value = "phone")

    private String phone;


    /**
     * 院系
     */
    @TableField(value = "xy_types")

    private Integer xyTypes;


    /**
     * 院系
     */
    @TableField(value = "yx_types")

    private Integer yxTypes;


    /**
     * 地区
     */
    @TableField(value = "area")

    private String area;


    /**
     * 论文
     */
    @TableField(value = "lw_file")

    private String lwFile;


    /**
     * 头像
     */
    @TableField(value = "img_photo")

    private String imgPhoto;


    /**
	 * 设置：id
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：id
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户名称
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：用户名称
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getPhone() {
        return phone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
	 * 设置：院系
	 */
    public Integer getXyTypes() {
        return xyTypes;
    }


    /**
	 * 获取：院系
	 */

    public void setXyTypes(Integer xyTypes) {
        this.xyTypes = xyTypes;
    }
    /**
	 * 设置：院系
	 */
    public Integer getYxTypes() {
        return yxTypes;
    }


    /**
	 * 获取：院系
	 */

    public void setYxTypes(Integer yxTypes) {
        this.yxTypes = yxTypes;
    }
    /**
	 * 设置：地区
	 */
    public String getArea() {
        return area;
    }


    /**
	 * 获取：地区
	 */

    public void setArea(String area) {
        this.area = area;
    }
    /**
	 * 设置：论文
	 */
    public String getLwFile() {
        return lwFile;
    }


    /**
	 * 获取：论文
	 */

    public void setLwFile(String lwFile) {
        this.lwFile = lwFile;
    }
    /**
	 * 设置：头像
	 */
    public String getImgPhoto() {
        return imgPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setImgPhoto(String imgPhoto) {
        this.imgPhoto = imgPhoto;
    }

    @Override
    public String toString() {
    return "Laoshi{" +
            "id=" + id +
            ", name=" + name +
            ", sexTypes=" + sexTypes +
            ", phone=" + phone +
            ", xyTypes=" + xyTypes +
            ", yxTypes=" + yxTypes +
            ", area=" + area +
            ", lwFile=" + lwFile +
            ", imgPhoto=" + imgPhoto +
    "}";
    }
    }
