package com.example.demo.rest;

import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.User;
import com.example.demo.rest.dto.UserDTO;
import com.example.demo.service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/api")
public class UserController {

	//test
	@Autowired
	private UserService userService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getALL() {
		List<UserDTO> dtos = new ArrayList<UserDTO>();
		List<User> users = userService.getAll();
		for(User u :users) {
			dtos.add(UserDTO.createDTO(u));
		}

		return ResponseEntity.status(HttpStatus.OK).body("HI");
	}

	//new register
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?>  SaveUser(@RequestBody UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUser_name());
        user.setPassword(userDTO.getPassword());
        user = userService.save(user);
        
		return ResponseEntity.status(HttpStatus.OK).body(UserDTO.createDTO(user));
	}
	
	//login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> login(@RequestBody UserDTO userDTO) {
		User user = userService.login(userDTO.getUser_name(), userDTO.getPassword());

		if(user==null) {
			return ResponseEntity.status(HttpStatus.OK).body(null);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(UserDTO.createDTO(user));
	}


}
