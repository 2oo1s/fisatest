package com.ce.fisa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ce.fisa.model.entity.Dept;

//dept table과 1:1 매핑
// DAO 구조의 이런 interface당 1:1 기본
// <Dept, Integer> - table과 매핑된 entity명, key명

@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer> {
	// 기본 CRUD
	// findAll()
}
