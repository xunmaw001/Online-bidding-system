package com.entity.view;

import com.entity.ZhaobiaozheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 招标者
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
@TableName("zhaobiaozhe")
public class ZhaobiaozheView  extends ZhaobiaozheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaobiaozheView(){
	}
 
 	public ZhaobiaozheView(ZhaobiaozheEntity zhaobiaozheEntity){
 	try {
			BeanUtils.copyProperties(this, zhaobiaozheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
