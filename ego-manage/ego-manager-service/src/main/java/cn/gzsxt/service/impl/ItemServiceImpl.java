package cn.gzsxt.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.gzsxt.common.pojo.EUDataGridResult;
import cn.gzsxt.mapper.TbItemMapper;
import cn.gzsxt.pojo.TbItem;
import cn.gzsxt.pojo.TbItemExample;
import cn.gzsxt.pojo.TbItemExample.Criteria;
import cn.gzsxt.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemById(long itemId) {
		// 添加查询条件
				TbItemExample example = new TbItemExample();
				Criteria criteria = example.createCriteria();
				criteria.andIdEqualTo(itemId);
				List<TbItem> list = itemMapper.selectByExample(example);
				if (list != null && list.size() > 0) {
					TbItem item = list.get(0);
					return item;
				}
				return null;
	}

	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		TbItemExample example = new TbItemExample();
		//处理分页
		PageHelper.startPage(page, rows);
		//查询所有数据
		List<TbItem> list = itemMapper.selectByExample(example);
		//相当于分页的pageBean
		EUDataGridResult result = new EUDataGridResult();
		//设置每页的行数
		result.setRows(list);
		//取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;

	}

}
