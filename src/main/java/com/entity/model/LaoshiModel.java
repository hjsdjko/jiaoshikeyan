package com.entity.model;

import com.entity.LaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-17
 */
public class LaoshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * id
     */
    private Integer id;


    /**
     * 用户名称 Search
     */
    private String name;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 联系方式
     */
    private String phone;


    /**
     * 院系
     */
    private Integer xyTypes;


    /**
     * 院系
     */
    private Integer yxTypes;


    /**
     * 地区
     */
    private String area;


    /**
     * 论文
     */
    private String lwFile;


    /**
     * 头像
     */
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
	 * 设置：用户名称 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：用户名称 Search
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

    }
