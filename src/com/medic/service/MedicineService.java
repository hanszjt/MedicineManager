package com.medic.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import com.medic.pojo.Medicine;

public interface MedicineService {

	public void getMedicineList(HttpServletRequest request);
	
	public void deleteMedicineById(int id);
	
	public void addMedicine(Medicine medicine);
}
