package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Group;
import com.vti.repository.IGroupRepository;

@Service
public class GroupService implements IGroupService {

	@Autowired
	private IGroupRepository repository;

	@Override
	public List<Group> getAllGroups() {
		return repository.findAll();
	}

}
