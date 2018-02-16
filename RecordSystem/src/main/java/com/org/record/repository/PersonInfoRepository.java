package com.org.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.org.record.model.PersonInfo;

@Repository("personRepo")
public interface PersonInfoRepository extends JpaRepository<PersonInfo, Long> {

	@Query("select t from PersonInfo t where mob=?")
	PersonInfo findByMobileNo(Long mob);

	@Query("select t from PersonInfo t where name=? and mob=?")
	PersonInfo findRecord(String name, String mobileNo);

}
