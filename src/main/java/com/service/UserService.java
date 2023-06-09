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

	public UserDTO addUser(UserDTO userDto) {
		if (userDto != null) {
			userRepository.save(userMapper.toUser(userDto));
			return userDto;
		}
		return null;
	}

	public Boolean deleteUser(UserDTO userDto) {
		if (userDto != null) {
			userRepository.delete(userMapper.toUser(userDto));
			return true;
		}
		return false;
	}

	public Boolean changeMoney(User user, Float money) {
		if(user.getAccount() + money < 0f) {
			return false;
		}
 		user.setAccount(user.getAccount() + money);
		userRepository.save(user);
		return true;
	}

	public UserDTO authenticateUser(String username, String password) {
		if (userRepository.existsByLoginAndPwd(username, password)){
			return userMapper.toUserDTO(userRepository.findByLoginAndPwd(username, password));
		}
		else {
			return null;
		}
	}
}
