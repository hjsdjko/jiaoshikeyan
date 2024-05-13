package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import com.annotation.IgnoreAuth;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.LaoshiEntity;

import com.service.LaoshiService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 
 * 后端接口
 * @author
 * @email
 * @date 2021-03-17
*/
@RestController
@Controller
@RequestMapping("/laoshi")
public class LaoshiController {
    private static final Logger logger = LoggerFactory.getLogger(LaoshiController.class);

    @Autowired
    private LaoshiService laoshiService;

    /**
    * 后端列表
    */
    @IgnoreAuth
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = laoshiService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @IgnoreAuth
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        LaoshiEntity laoshi = laoshiService.selectById(id);
        if(laoshi!=null){
            return R.ok().put("data", laoshi);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @IgnoreAuth
    @RequestMapping("/save")
    public R save(@RequestBody LaoshiEntity laoshi, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<LaoshiEntity> queryWrapper = new EntityWrapper<LaoshiEntity>()
            .eq("name", laoshi.getName())
            .eq("sex_types", laoshi.getSexTypes())
            .eq("phone", laoshi.getPhone())
            .eq("xy_types", laoshi.getXyTypes())
            .eq("yx_types", laoshi.getYxTypes())
            .eq("area", laoshi.getArea())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LaoshiEntity laoshiEntity = laoshiService.selectOne(queryWrapper);
        if("".equals(laoshi.getLwFile()) || "null".equals(laoshi.getLwFile())){
            laoshi.setLwFile(null);
        }
        if("".equals(laoshi.getImgPhoto()) || "null".equals(laoshi.getImgPhoto())){
            laoshi.setImgPhoto(null);
        }
        if(laoshiEntity==null){
            laoshiService.insert(laoshi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @IgnoreAuth
    @RequestMapping("/update")
    public R update(@RequestBody LaoshiEntity laoshi, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<LaoshiEntity> queryWrapper = new EntityWrapper<LaoshiEntity>()
            .notIn("id",laoshi.getId())
            .eq("name", laoshi.getName())
            .eq("sex_types", laoshi.getSexTypes())
            .eq("phone", laoshi.getPhone())
            .eq("xy_types", laoshi.getXyTypes())
            .eq("yx_types", laoshi.getYxTypes())
            .eq("area", laoshi.getArea())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LaoshiEntity laoshiEntity = laoshiService.selectOne(queryWrapper);
        if("".equals(laoshi.getLwFile()) || "null".equals(laoshi.getLwFile())){
                laoshi.setLwFile(null);
        }
        if("".equals(laoshi.getImgPhoto()) || "null".equals(laoshi.getImgPhoto())){
                laoshi.setImgPhoto(null);
        }
        if(laoshiEntity==null){
            laoshiService.updateById(laoshi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        laoshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

