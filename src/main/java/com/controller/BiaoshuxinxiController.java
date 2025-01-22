package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BiaoshuxinxiEntity;
import com.entity.view.BiaoshuxinxiView;

import com.service.BiaoshuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 标书信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
@RestController
@RequestMapping("/biaoshuxinxi")
public class BiaoshuxinxiController {
    @Autowired
    private BiaoshuxinxiService biaoshuxinxiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BiaoshuxinxiEntity biaoshuxinxi, 
		HttpServletRequest request){

        EntityWrapper<BiaoshuxinxiEntity> ew = new EntityWrapper<BiaoshuxinxiEntity>();
		PageUtils page = biaoshuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biaoshuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BiaoshuxinxiEntity biaoshuxinxi, 
		HttpServletRequest request){
        EntityWrapper<BiaoshuxinxiEntity> ew = new EntityWrapper<BiaoshuxinxiEntity>();
		PageUtils page = biaoshuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biaoshuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BiaoshuxinxiEntity biaoshuxinxi){
       	EntityWrapper<BiaoshuxinxiEntity> ew = new EntityWrapper<BiaoshuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( biaoshuxinxi, "biaoshuxinxi")); 
        return R.ok().put("data", biaoshuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BiaoshuxinxiEntity biaoshuxinxi){
        EntityWrapper< BiaoshuxinxiEntity> ew = new EntityWrapper< BiaoshuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( biaoshuxinxi, "biaoshuxinxi")); 
		BiaoshuxinxiView biaoshuxinxiView =  biaoshuxinxiService.selectView(ew);
		return R.ok("查询标书信息成功").put("data", biaoshuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BiaoshuxinxiEntity biaoshuxinxi = biaoshuxinxiService.selectById(id);
		biaoshuxinxi.setClicknum(biaoshuxinxi.getClicknum()+1);
		biaoshuxinxi.setClicktime(new Date());
		biaoshuxinxiService.updateById(biaoshuxinxi);
        return R.ok().put("data", biaoshuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BiaoshuxinxiEntity biaoshuxinxi = biaoshuxinxiService.selectById(id);
		biaoshuxinxi.setClicknum(biaoshuxinxi.getClicknum()+1);
		biaoshuxinxi.setClicktime(new Date());
		biaoshuxinxiService.updateById(biaoshuxinxi);
        return R.ok().put("data", biaoshuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BiaoshuxinxiEntity biaoshuxinxi, HttpServletRequest request){
    	biaoshuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(biaoshuxinxi);

        biaoshuxinxiService.insert(biaoshuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BiaoshuxinxiEntity biaoshuxinxi, HttpServletRequest request){
    	biaoshuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(biaoshuxinxi);

        biaoshuxinxiService.insert(biaoshuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BiaoshuxinxiEntity biaoshuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(biaoshuxinxi);
        biaoshuxinxiService.updateById(biaoshuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        biaoshuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BiaoshuxinxiEntity> wrapper = new EntityWrapper<BiaoshuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = biaoshuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,BiaoshuxinxiEntity biaoshuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<BiaoshuxinxiEntity> ew = new EntityWrapper<BiaoshuxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = biaoshuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biaoshuxinxi), params), params));
        return R.ok().put("data", page);
    }







}
