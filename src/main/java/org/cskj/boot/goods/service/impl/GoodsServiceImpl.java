package org.cskj.boot.goods.service.impl;

import java.util.List;

import org.cskj.boot.goods.bean.Goods;
import org.cskj.boot.goods.mapper.GoodsMapper;
import org.cskj.boot.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsMapper gm;

	@Override
	public List<Goods> queryGoodsAll() {
		return gm.queryGoodsAll();
	}

	
}
