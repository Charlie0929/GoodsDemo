package org.cskj.boot.goods.controller;

import java.util.List;

import org.cskj.boot.goods.bean.Goods;
import org.cskj.boot.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

	@Autowired
	private GoodsService gs;
	
	/*
	 * restful风格
	 * get查询
	 * post添加
	 * put修改
	 * delete删除
	 */
	
	@GetMapping(value="queryGoodsAll")
	public List<Goods> queryGoodsAll(){
		return gs.queryGoodsAll();
	}
	
}
