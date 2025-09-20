package com.sk.InventoryMgmtSystem.services;

import com.sk.InventoryMgmtSystem.dtos.LoginRequest;
import com.sk.InventoryMgmtSystem.dtos.RegisterRequest;
import com.sk.InventoryMgmtSystem.dtos.Response;
import com.sk.InventoryMgmtSystem.dtos.UserDTO;
import com.sk.InventoryMgmtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}