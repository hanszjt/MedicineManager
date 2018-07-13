package com.medic.dao;

import java.util.List;

import com.medic.page.Pager;
import com.medic.pojo.Medicine;

/**
 * 药品接口
 * @author 张金倓
 *
 */
public interface MedicineDao {
	public void addMedicine(Medicine medicine);
	
	public void deleteMedicine(int id);
	
	public void updateMedicine(Medicine medicine,int id);
	
	public List<Medicine> queryAllMedicine(Pager pager);
	
	public Medicine queryMedicineByID(int id);
}
