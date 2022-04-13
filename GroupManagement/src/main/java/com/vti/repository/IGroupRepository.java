package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vti.entity.Group;

public interface IGroupRepository extends JpaRepository<Group, Integer>, JpaSpecificationExecutor<Group> {

	public Group findByName(String name);

	public boolean existsByName(String name);
}
