package com.org.record.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.record.model.PersonInfo;
import com.org.record.repository.PersonInfoRepository;

@Service
public class PersonInfoService {

	@Autowired
	PersonInfoRepository personInfoRepository;

	public List<PersonInfo> getallPersonInfo() {
		List<PersonInfo> persons = new ArrayList<>();
		personInfoRepository.findAll().forEach(persons::add);
		return persons;
	}

	public PersonInfo findByMobileNo(Long mobileNo) {
		return personInfoRepository.findByMobileNo(mobileNo);
	}

	public PersonInfo findRecord(String name, String mobileNo) {
		return personInfoRepository.findRecord(name, mobileNo);
	}

}
