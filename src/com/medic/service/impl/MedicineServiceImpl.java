package com.medic.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.medic.dao.MedicineDao;
import com.medic.dao.impl.MedicineDaoImpl;
import com.medic.page.Pager;
import com.medic.page.PagerHelper;
import com.medic.pojo.Medicine;
import com.medic.pojo.User;
import com.medic.service.MedicineService;

public class MedicineServiceImpl implements MedicineService {

	public void getMedicineList(HttpServletRequest request) {
		MedicineDao md = new MedicineDaoImpl();
		Pager pager = null;
		long totalRows = 0;
		int pageSize = 10;
		totalRows = md.getCountMedicine();
		pager = PagerHelper.getPager(request, (int)totalRows, pageSize);
		pager.setLinkUrl("listAllPage.action"); // 设置跳转路径，也可以是？&
		request.setAttribute("total", totalRows);
		request.setAttribute("pb", pager); // 将分页信息保存在Request对象pb中
		List<Medicine> list = md.queryAllMedicine(pager);
		request.setAttribute("MedicineList", list);
	}

	@Override
	public void deleteMedicineById(int id) {
		MedicineDao md = new MedicineDaoImpl();
		md.deleteMedicine(id);
	}

	@Override
	public void addMedicine(Medicine medicine) {
		MedicineDao md = new MedicineDaoImpl();
		md.addMedicine(medicine);
		
		
	}
}
