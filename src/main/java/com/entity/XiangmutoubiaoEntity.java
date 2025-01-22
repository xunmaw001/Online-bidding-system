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
 * 项目投标
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-26 17:57:38
 */
@TableName("xiangmutoubiao")
public class XiangmutoubiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmutoubiaoEntity() {
		
	}
	
	public XiangmutoubiaoEntity(T t) {
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
	 * 投标编号
	 */
					
	private String toubiaobianhao;
	
	/**
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
	/**
	 * 投标文件
	 */
					
	private String toubiaowenjian;
	
	/**
	 * 招标金额
	 */
					
	private Integer zhaobiaojine;
	
	/**
	 * 投标金额
	 */
					
	private Integer toubiaojine;
	
	/**
	 * 投标内容
	 */
					
	private String toubiaoneirong;
	
	/**
	 * 投标日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date toubiaoriqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 招标账号
	 */
					
	private String zhaobiaozhanghao;
	
	/**
	 * 招标姓名
	 */
					
	private String zhaobiaoxingming;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：投标编号
	 */
	public void setToubiaobianhao(String toubiaobianhao) {
		this.toubiaobianhao = toubiaobianhao;
	}
	/**
	 * 获取：投标编号
	 */
	public String getToubiaobianhao() {
		return toubiaobianhao;
	}
	/**
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
	/**
	 * 设置：投标文件
	 */
	public void setToubiaowenjian(String toubiaowenjian) {
		this.toubiaowenjian = toubiaowenjian;
	}
	/**
	 * 获取：投标文件
	 */
	public String getToubiaowenjian() {
		return toubiaowenjian;
	}
	/**
	 * 设置：招标金额
	 */
	public void setZhaobiaojine(Integer zhaobiaojine) {
		this.zhaobiaojine = zhaobiaojine;
	}
	/**
	 * 获取：招标金额
	 */
	public Integer getZhaobiaojine() {
		return zhaobiaojine;
	}
	/**
	 * 设置：投标金额
	 */
	public void setToubiaojine(Integer toubiaojine) {
		this.toubiaojine = toubiaojine;
	}
	/**
	 * 获取：投标金额
	 */
	public Integer getToubiaojine() {
		return toubiaojine;
	}
	/**
	 * 设置：投标内容
	 */
	public void setToubiaoneirong(String toubiaoneirong) {
		this.toubiaoneirong = toubiaoneirong;
	}
	/**
	 * 获取：投标内容
	 */
	public String getToubiaoneirong() {
		return toubiaoneirong;
	}
	/**
	 * 设置：投标日期
	 */
	public void setToubiaoriqi(Date toubiaoriqi) {
		this.toubiaoriqi = toubiaoriqi;
	}
	/**
	 * 获取：投标日期
	 */
	public Date getToubiaoriqi() {
		return toubiaoriqi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：招标账号
	 */
	public void setZhaobiaozhanghao(String zhaobiaozhanghao) {
		this.zhaobiaozhanghao = zhaobiaozhanghao;
	}
	/**
	 * 获取：招标账号
	 */
	public String getZhaobiaozhanghao() {
		return zhaobiaozhanghao;
	}
	/**
	 * 设置：招标姓名
	 */
	public void setZhaobiaoxingming(String zhaobiaoxingming) {
		this.zhaobiaoxingming = zhaobiaoxingming;
	}
	/**
	 * 获取：招标姓名
	 */
	public String getZhaobiaoxingming() {
		return zhaobiaoxingming;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
