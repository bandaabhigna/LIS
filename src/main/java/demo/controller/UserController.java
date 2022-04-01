package demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.User;
import demo.repository.UserRepository;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserRepository userRepository;
    @GetMapping("/users")
    public List<User> getUsers(){
    	
    	return this.userRepository.findAll();
    }
}
