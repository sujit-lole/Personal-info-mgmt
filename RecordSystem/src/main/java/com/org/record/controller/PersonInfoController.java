package com.org.record.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.record.model.PersonInfo;
import com.org.record.services.PersonInfoService;

@RestController
@RequestMapping("/v1")
public class PersonInfoController {

	@Autowired
	PersonInfoService personInfoService;

	@RequestMapping(method = RequestMethod.GET, value = "/personinfo")
	public List<PersonInfo> getAllPersonInfo() {
		return personInfoService.getallPersonInfo();
	}

	@RequestMapping(value = "/personinfo/search", method = RequestMethod.POST)
	public PersonInfo getPersonInfo(@RequestParam("mobileNo") long mobileNo) {
		return personInfoService.findByMobileNo(mobileNo);

	}

	@RequestMapping(value = "/personinfo/info", method = RequestMethod.POST)
	public PersonInfo getPersonInformation(@RequestParam("name") String name,
			@RequestParam("mobileNo") String mobileNo) {
		return personInfoService.findRecord(name, mobileNo);

	}

	// @RequestMapping(method = RequestMethod.POST, value = "/topics")
	// public void addTopic(@RequestBody Topic topic) {
	// topicService.addTopic(topic);
	// }

	// , RequestParam("mobileNo") Long mobileNO
}
