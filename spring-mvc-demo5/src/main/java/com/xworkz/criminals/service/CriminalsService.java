package com.xworkz.criminals.service;

import java.util.List;

import com.xworkz.criminals.dto.CriminalsDTO;

public interface CriminalsService {

	Boolean validateAndSave(CriminalsDTO criminalsDTO);

	List<CriminalsDTO> findAll();

}
