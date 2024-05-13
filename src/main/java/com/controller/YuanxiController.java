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

import com.entity.YuanxiEntity;

import com.service.YuanxiService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 院系
 * 后端接口
 * @author
 * @email
 * @date 2021-03-17
*/
@RestController
@Controller
@RequestMapping("/yuanxi")
public class YuanxiController {
    private static final Logger logger = LoggerFactory.getLogger(YuanxiController.class);

    @Autowired
    private YuanxiService yuanxiService;

    /**
    * 后端列表
    */
    @IgnoreAuth
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = yuanxiService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @IgnoreAuth
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        YuanxiEntity yuanxi = yuanxiService.selectById(id);
        if(yuanxi!=null){
            return R.ok().put("data", yuanxi);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YuanxiEntity yuanxi, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<YuanxiEntity> queryWrapper = new EntityWrapper<YuanxiEntity>()
            .eq("name", yuanxi.getName())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YuanxiEntity yuanxiEntity = yuanxiService.selectOne(queryWrapper);
        if(yuanxiEntity==null){
            yuanxiService.insert(yuanxi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YuanxiEntity yuanxi, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<YuanxiEntity> queryWrapper = new EntityWrapper<YuanxiEntity>()
            .notIn("id",yuanxi.getId())
            .eq("name", yuanxi.getName())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YuanxiEntity yuanxiEntity = yuanxiService.selectOne(queryWrapper);
        if(yuanxiEntity==null){
            yuanxiService.updateById(yuanxi);//根据id更新
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
        yuanxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

