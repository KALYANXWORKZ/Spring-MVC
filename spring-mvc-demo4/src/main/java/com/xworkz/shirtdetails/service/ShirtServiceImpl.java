package com.xworkz.shirtdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.shirtdetails.dao.ShirtDAO;
import com.xworkz.shirtdetails.dto.ShirtDTO;

@Service
public class ShirtServiceImpl implements ShirtService {
	@Autowired
	private ShirtDAO shirtDAO;

	@Override
	public boolean validateAndSave(ShirtDTO dto) {
		System.out.println("created"+this.getClass().getSimpleName());
		 shirtDAO.save(dto);
		return true;
	}

}
