package cn.gzsxt.common.pojo;

import java.util.List;

/**
 * easyuiDataGrid要求的数据类型格式
 * @author lyq
 *
 */
public class EUDataGridResult {

	private Long total;
	
	private  List<?> rows;

	public EUDataGridResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
