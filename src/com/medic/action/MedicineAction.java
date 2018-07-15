package com.medic.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.medic.page.Pager;
import com.medic.pojo.Medicine;
import com.medic.service.MedicineService;
import com.medic.service.impl.MedicineServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class MedicineAction extends ActionSupport{
	private Medicine medicine;
	
	
	public Medicine getMedicine() {
		return medicine;
	}


	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	
	public String medicinelist(){
		HttpServletRequest request = ServletActionContext.getRequest();
		MedicineService ms = new MedicineServiceImpl();
		ms.getMedicineList(request);
		return SUCCESS;
	}
	
	public String deleteMedicine() {
		MedicineService ms = new MedicineServiceImpl();
		ms.deleteMedicineById(this.medicine.getId());
		return SUCCESS;
	}
	
	public String addMedicine() {
		MedicineService ms = new MedicineServiceImpl();
		ms.addMedicine(this.medicine);
		return null;
	}
}
