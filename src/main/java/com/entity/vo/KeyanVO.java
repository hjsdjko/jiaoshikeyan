package com.entity.vo;

import com.entity.KeyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 科研项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-17
 */
@TableName("keyan")
public class KeyanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 研发老师 Search
     */

    @TableField(value = "fjh_types")
    private Integer fjhTypes;


    /**
     * 成果名称 Search
     */

    @TableField(value = "name")
    private String name;


    /**
     * 研发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
