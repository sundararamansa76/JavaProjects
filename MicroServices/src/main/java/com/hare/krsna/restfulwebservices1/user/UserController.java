package com.hare.krsna.restfulwebservices1.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {
	// GET/usrs
	@Autowired
	private UserDaoService userDao;

	@GetMapping("/users")
	public List<User> retrieveAllUsers()
	{
		return this.userDao.findAll();
	}

	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user = this.userDao.getUser(id);
		if (user ==null)
			throw new UserNotFoundException("Id-"+id);
		return user;
	}



	@PostMapping("/users")
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		User savedU = this.userDao.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedU.getId())
				.toUri();
		return ResponseEntity.created(location).build();

	}

	//	@PostMapping("/users")
	//	public void saveUser(@RequestBody User user) {
	//		User savedU = this.userDao.save(user);
	//	}

}

