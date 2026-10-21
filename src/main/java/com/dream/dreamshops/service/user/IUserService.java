package com.dream.dreamshops.service.user;

import com.dream.dreamshops.dto.UserDto;
import com.dream.dreamshops.model.User;
import com.dream.dreamshops.request.CreateUserRequest;
import com.dream.dreamshops.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
