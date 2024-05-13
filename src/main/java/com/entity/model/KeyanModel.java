package com.entity.model;

import com.entity.KeyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 科研项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-17
 */
public class KeyanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 研发老师 Search
     */
    private Integer fjhTypes;


    /**
     * 成果名称 Search
     */
    private String name;


    /**
     * 研发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date keyanTime;


    /**
     * 展示图片
     */
    private String imgPhoto;


    /**
     * 成果描述
     */
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
	 * 设置：研发老师 Search
	 */
    public Integer getFjhTypes() {
        return fjhTypes;
    }


    /**
	 * 获取：研发老师 Search
	 */

    public void setFjhTypes(Integer fjhTypes) {
        this.fjhTypes = fjhTypes;
    }
    /**
	 * 设置：成果名称 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：成果名称 Search
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

    }
