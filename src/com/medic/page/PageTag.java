package com.medic.page;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PageTag extends TagSupport {
	 private static final long serialVersionUID = 1L;
	 private Pager pager;
	 @SuppressWarnings("static-access")
	public int doStartTag() {
	    try {
	     JspWriter out = pageContext.getOut();
	     out.print("ç¬? " + pager.getCurrentPage() + " é¡?/å…? " + (pager.getTotalPages()) + " é¡?");
	     if (pager.getCurrentPage() == 1) {
	      out.print("[æœ?é¦–é¡µ]");
	      out.print("[ä¸Šä¸€é¡µ]");
	     }
	     if (pager.getCurrentPage() != 1) {
	      out.print("[<a href='" + pager.getLinkUrl() + "cpage=1'>æœ?é¦–é¡µ</a>]");
	      out.print("[<a href='" + pager.getLinkUrl() + "cpage=" + (pager.getCurrentPage() - 1) + "'>ä¸Šä¸€é¡?</a>]");
	     }
	     for (int i = pager.getCurrentPage() - 3; i <= pager.getCurrentPage() + 3; i++) {
	      if (i <= 0 || i > pager.getTotalPages()) {
	       continue;
	      }
	      if (i == pager.getCurrentPage()) {
	       out.print("[<span style='color:#FF0000; border: 1px solid #cccccc; font-weight:bold; width:15px;text-align: center;'> " + i + " </span>]");
	      } else {
	       out.print("[<a href='" + pager.getLinkUrl() + "cpage=" + i + "'> " + i + " </a>]");
	      }
	     }
	     if (pager.getCurrentPage() == pager.getTotalPages() || pager.getTotalPages() == 0) {
	      out.print("[ä¸‹ä¸€é¡µ]");
	      out.print("[æœ?æœ«é¡µ]");
	     }
	     if (pager.getCurrentPage() != pager.getTotalPages() && pager.getTotalPages() != 0) {
	      out.print("[<a href='" + pager.getLinkUrl() + "cpage=" + (pager.getCurrentPage() + 1) + "'>ä¸‹ä¸€é¡?</a>]");
	      out.print("[<a href='" + pager.getLinkUrl() + "cpage=" + (pager.getTotalPages()) + "'>æœ?æœ«é¡µ</a>]");
	     }
	     out.flush();
	    } catch (IOException e) {
	     e.printStackTrace();
	    }
	    return super.SKIP_BODY;
	 }
	 @SuppressWarnings("static-access")
	public int doEndTag() {
	  return super.EVAL_PAGE;
	 }
	 public void setPager(Pager pager) {
	  this.pager = pager;
	 }
	 public Pager getPager() {
	  return pager;
	 }
	}
