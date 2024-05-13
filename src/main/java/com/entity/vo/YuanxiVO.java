package com.entity.vo;

import com.entity.YuanxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 院系
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-17
 */
@TableName("yuanxi")
public class YuanxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 院系名称 Search
     */

    @TableField(value = "name")
    private String name;


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
	 * 设置：院系名称 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：院系名称 Search
	 */

    public void setName(String name) {
        this.name = name;
    }

}
