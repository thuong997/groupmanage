package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Group;
import com.vti.service.IGroupService;

@RestController
@RequestMapping(value = "api/v1/groups")
@CrossOrigin(origins = "*")
public class GroupController {

	@Autowired
	private IGroupService service;

	@GetMapping()
	public ResponseEntity<?> getAllGroups() {
		List<Group> entities = service.getAllGroups();
		return new ResponseEntity<List<Group>>(entities, HttpStatus.OK);
	}
}
