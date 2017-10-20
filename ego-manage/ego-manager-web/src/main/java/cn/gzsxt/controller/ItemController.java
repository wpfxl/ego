package cn.gzsxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gzsxt.common.pojo.EUDataGridResult;
import cn.gzsxt.pojo.TbItem;
import cn.gzsxt.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	/**
	 * @param itemId
	 * @return
	 * 根据ID查询记录
	 */
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}
	/**
	 * @param page 当前页数
	 * @param rows 当前显示行数
	 * @return 返回一个json数据
	 * 分页显示所有记录
	 */
	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
}
