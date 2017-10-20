package cn.gzsxt.service;

import cn.gzsxt.common.pojo.EUDataGridResult;
import cn.gzsxt.pojo.TbItem;

public interface ItemService {
	//根据id查询商品信息
	public TbItem getItemById(long itemId) ;
	
	public EUDataGridResult getItemList(int page, int rows);
}
