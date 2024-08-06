package hng_java_boilerplate.user.service;

import hng_java_boilerplate.organisation.dto.responses.MembersResponse;
import hng_java_boilerplate.user.dto.request.GetUserDto;
import hng_java_boilerplate.user.dto.request.LoginDto;
import hng_java_boilerplate.user.dto.request.SignupDto;
import hng_java_boilerplate.user.dto.response.ApiResponse;
import hng_java_boilerplate.user.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface UserService {
    GetUserDto getUserWithDetails(String userId);
    ResponseEntity<ApiResponse> registerUser(SignupDto signupDto);
    User getLoggedInUser();

    List<MembersResponse> getAllUsers(int page, Authentication authentication);

    ResponseEntity<ApiResponse> loginUser(LoginDto loginDto);
}
