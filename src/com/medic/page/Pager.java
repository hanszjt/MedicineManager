package com.medic.page;

public class Pager {
	 private int totalRows; // 总行�?
	 private int pageSize; // 每页显示的行�?
	 private int currentPage; // 当前页号
	 private int totalPages; // 总页�?
	 private int startRow; // 当前页在数据库中的起始行
	 private String linkUrl; // 要跳转的URL
//	 @Override
//	public String toString() {
//		String str = "totalRows = "+totalRows+",pageSize = "+pageSize+",currentPage = "+currentPage+",totalPages = "
//		+totalPages+",startRow = "+startRow+",linkUrl = "+linkUrl;
//		return str;
//	}
	 
	 public Pager() {
	 }
	 public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public Pager(int totalRows, int pageSize) {
	  this.totalRows = totalRows;
	  this.pageSize = pageSize;
	  //对不够一页的做处�?
	  totalPages = totalRows / pageSize;
	  int mod = totalRows % pageSize;
	  if (mod > 0) {
	   totalPages++;
	  }
	  //页面的第�?�?
	  this.currentPage = 1;
//	  数据库的第一条记�?
	  this.startRow = 0;
	 }
	 /**
	  * 设定hibernate查询的起始行�?
	  * @param currentPage
	  */
	 public void setStart(int currentPage) {
	    this.currentPage = currentPage;
	    //计算数据库的起始记录位置
	    startRow = (currentPage - 1) * pageSize;
	 }
	}

