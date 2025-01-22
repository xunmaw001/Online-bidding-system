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
 * 标书信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
@TableName("biaoshuxinxi")
public class BiaoshuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BiaoshuxinxiEntity() {
		
	}
	
	public BiaoshuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标书编号
	 */
					
	private String biaoshubianhao;
	
	/**
	 * 标书名称
	 */
					
	private String biaoshumingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 标书文件
	 */
					
	private String biaoshuwenjian;
	
	/**
	 * 标书内容
	 */
					
	private String biaoshuneirong;
	
	/**
	 * 上传日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangchuanriqi;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标书编号
	 */
	public void setBiaoshubianhao(String biaoshubianhao) {
		this.biaoshubianhao = biaoshubianhao;
	}
	/**
	 * 获取：标书编号
	 */
	public String getBiaoshubianhao() {
		return biaoshubianhao;
	}
	/**
	 * 设置：标书名称
	 */
	public void setBiaoshumingcheng(String biaoshumingcheng) {
		this.biaoshumingcheng = biaoshumingcheng;
	}
	/**
	 * 获取：标书名称
	 */
	public String getBiaoshumingcheng() {
		return biaoshumingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：标书文件
	 */
	public void setBiaoshuwenjian(String biaoshuwenjian) {
		this.biaoshuwenjian = biaoshuwenjian;
	}
	/**
	 * 获取：标书文件
	 */
	public String getBiaoshuwenjian() {
		return biaoshuwenjian;
	}
	/**
	 * 设置：标书内容
	 */
	public void setBiaoshuneirong(String biaoshuneirong) {
		this.biaoshuneirong = biaoshuneirong;
	}
	/**
	 * 获取：标书内容
	 */
	public String getBiaoshuneirong() {
		return biaoshuneirong;
	}
	/**
	 * 设置：上传日期
	 */
	public void setShangchuanriqi(Date shangchuanriqi) {
		this.shangchuanriqi = shangchuanriqi;
	}
	/**
	 * 获取：上传日期
	 */
	public Date getShangchuanriqi() {
		return shangchuanriqi;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
