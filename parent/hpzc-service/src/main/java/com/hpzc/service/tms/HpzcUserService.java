package com.hpzc.service.tms;

import java.util.List;
import java.util.Map;

import com.hpzc.model.tms.HpzcUser;

/**
 * 
 * @Description:采购信息
 * @author ：zhengguohui
 * @return ： 2016年8月12日 下午3:07:20
 */
public interface HpzcUserService {

	public void save(HpzcUser hpzcCgd);

	public void update(HpzcUser hpzcCgd);

	public List<HpzcUser> selectByQuery(Map<String, Object> map);

}
