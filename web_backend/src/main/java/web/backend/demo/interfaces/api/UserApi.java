package web.backend.demo.interfaces.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import web.backend.demo.application.facades.UserFacade;
import web.backend.demo.common.CommonResponse;
import web.backend.demo.interfaces.dtos.UserDto;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserApi {

    private final UserFacade userFacade;

    @PostMapping("/register")
    public CommonResponse registerUser(@RequestBody UserDto.UserCreationDto userCreation) {
        final var response = userFacade.register(userCreation.getUsername(), userCreation.getPassword());
        return CommonResponse.builder().message("well done").build();
    }
}
