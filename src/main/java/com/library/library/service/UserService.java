package com.library.library.service;

import com.library.library.dto.UserDTO;
import com.library.library.dto.UserSaveDTO;
import com.library.library.dto.UserUpdateDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();

    String updateUser(UserUpdateDTO userUpdateDTO);

    String deleteUser(int id);
}
