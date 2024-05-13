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

import com.entity.KeyanEntity;

import com.service.KeyanService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 科研项目
 * 后端接口
 * @author
 * @email
 * @date 2021-03-17
*/
@RestController
@Controller
@RequestMapping("/keyan")
public class KeyanController {
    private static final Logger logger = LoggerFactory.getLogger(KeyanController.class);

    @Autowired
    private KeyanService keyanService;

    /**
    * 后端列表
    */
    @IgnoreAuth
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = keyanService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @IgnoreAuth
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        KeyanEntity keyan = keyanService.selectById(id);
        if(keyan!=null){
            return R.ok().put("data", keyan);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody KeyanEntity keyan, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<KeyanEntity> queryWrapper = new EntityWrapper<KeyanEntity>()
            .eq("fjh_types", keyan.getFjhTypes())
            .eq("name", keyan.getName())
            .eq("chengguo_content", keyan.getChengguoContent())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KeyanEntity keyanEntity = keyanService.selectOne(queryWrapper);
            keyan.setKeyanTime(new Date());
        if("".equals(keyan.getImgPhoto()) || "null".equals(keyan.getImgPhoto())){
            keyan.setImgPhoto(null);
        }
        if(keyanEntity==null){
            keyanService.insert(keyan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody KeyanEntity keyan, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<KeyanEntity> queryWrapper = new EntityWrapper<KeyanEntity>()
            .notIn("id",keyan.getId())
            .eq("fjh_types", keyan.getFjhTypes())
            .eq("name", keyan.getName())
            .eq("chengguo_content", keyan.getChengguoContent())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        KeyanEntity keyanEntity = keyanService.selectOne(queryWrapper);
                keyan.setKeyanTime(new Date());
        if("".equals(keyan.getImgPhoto()) || "null".equals(keyan.getImgPhoto())){
                keyan.setImgPhoto(null);
        }
        if(keyanEntity==null){
            keyanService.updateById(keyan);//根据id更新
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
        keyanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

