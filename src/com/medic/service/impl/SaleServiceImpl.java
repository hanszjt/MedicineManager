package com.medic.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.taglibs.standard.tag.common.core.ForEachSupport;

import com.medic.dao.MedicineDao;
import com.medic.dao.SaleDao;
import com.medic.dao.impl.MedicineDaoImpl;
import com.medic.dao.impl.SaleDaoImpl;
import com.medic.page.Pager;
import com.medic.page.PagerHelper;
import com.medic.pojo.Medicine;
import com.medic.pojo.Sale;
import com.medic.service.SaleService;

public class SaleServiceImpl implements SaleService {
	SaleDao sd = new SaleDaoImpl();
	@Override
	public void searcMedicine(HttpServletRequest request,String mname) {
		MedicineDao md = new MedicineDaoImpl();
		List<Medicine> medicineByName = md.queryMedicineByName(mname);
		for (Medicine medicine : medicineByName) {
			System.out.println(medicine);
		}
		request.setAttribute("total", medicineByName.size());
		request.setAttribute("medicineByName", medicineByName);
	}
	@Override
	public void salelist(HttpServletRequest request) {
		Pager pager = null;
		long totalRows = 0;
		int pageSize = 10;
		totalRows = sd.getCountSale();
		pager = PagerHelper.getPager(request, (int)totalRows, pageSize);
		pager.setLinkUrl("listAllPage.action"); // ������ת·����Ҳ�����ǣ�&
		request.setAttribute("total", totalRows);
		request.setAttribute("pb", pager); // ����ҳ��Ϣ������Request����pb��
		List<Sale> list = sd.queryAllSale(pager);
		request.setAttribute("Salelist", list);
		
	}
	@Override
	public void deletesale(Sale sale) {
		sd.deleteSale(sale.getId());
	}

}
