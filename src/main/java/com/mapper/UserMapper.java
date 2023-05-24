package com.mapper;

import org.mapstruct.Mapper;

import com.dto.UserDTO;
import com.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
	public UserDTO toUserDTO(User user);
	public User toUser(UserDTO userDTO);
	public List<UserDTO> toUserDTOList(List<User> userList);
}
