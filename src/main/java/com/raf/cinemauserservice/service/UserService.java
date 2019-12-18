package com.raf.cinemauserservice.service;


import com.raf.cinemauserservice.dto.TokenRequestDto;
import com.raf.cinemauserservice.dto.TokenResponseDto;
import com.raf.cinemauserservice.dto.UserCreateDto;
import com.raf.cinemauserservice.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<UserDto> findAll(Pageable pageable);

    UserDto add(UserCreateDto userCreateDto);

    TokenResponseDto login(TokenRequestDto tokenRequestDto);
}
