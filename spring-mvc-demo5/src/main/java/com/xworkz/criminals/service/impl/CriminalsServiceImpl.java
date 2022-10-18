package com.xworkz.criminals.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.criminals.dao.CriminalsDAO;
import com.xworkz.criminals.dto.CriminalsDTO;
import com.xworkz.criminals.service.CriminalsService;

@Service
public class CriminalsServiceImpl implements CriminalsService {

	@Autowired
	private CriminalsDAO criminalsDAO;

	@Override
	public Boolean validateAndSave(CriminalsDTO criminalsDTO) {
		System.out.println("calling validateAndSave");
		if (criminalsDTO != null) {
			String name = criminalsDTO.getName();
			String wifeName = criminalsDTO.getWifeName();
			String rightHandName = criminalsDTO.getRightHandName();
			String leftHandName = criminalsDTO.getLeftHandName();
			String prisonName = criminalsDTO.getPrisonName();
			Double netWorth = criminalsDTO.getNetWorth();

			if (name.length() > 3 && name.length() < 30 && wifeName.length() > 3 && wifeName.length() < 30
					&& rightHandName.length() > 3 && rightHandName.length() < 30 && leftHandName.length() > 3
					&& leftHandName.length() < 30 && prisonName.length() > 3 && prisonName.length() < 30
					&& netWorth != 0) {

				return this.criminalsDAO.save(criminalsDTO);
			} else {
				System.out.println("Data is not Valid");
			}

		}
		return false;
	}

	@Override
	public List<CriminalsDTO> findAll() {
		System.out.println("calling findAll method from Service");

		List<CriminalsDTO> find = criminalsDAO.findAll();
		return this.criminalsDAO.findAll();
	}

}
