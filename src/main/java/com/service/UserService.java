package com.service;

import java.util.List;

import com.dto.UserDTO;
import com.entity.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	@Autowired
	UserRepository userRepository;

	public UserDTO getUserById(Integer id) {
		return userMapper.toUserDTO(userRepository.findById(id).orElse(null));
	}

	public List<UserDTO> getAllUsers() {
		return userMapper.toUserDTOList(userRepository.findAll());
	}

	public void addUser(UserDTO userDto) {
		userRepository.save(userMapper.toUser(userDto));
	}

	public void deleteUser(UserDTO userDto) {
		userRepository.delete(userMapper.toUser(userDto));
	}

	public Boolean changeMoney(User user, Float money) {
		if(user.getAccount() + money < 0f) {
			return false;
		}
 		user.setAccount(user.getAccount() + money);
		userRepository.save(user);
		return true;
	}

	public Boolean authenticateUser(String username, String password) {
		return userRepository.existsByLoginAndPwd(username, password);
	}
}
