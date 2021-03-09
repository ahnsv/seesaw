package web.backend.demo.interfaces.dtos;

import lombok.Builder;
import lombok.Getter;

public class UserDto {
    @Getter
    public static class UserCreationDto {
        private String username;
        private String password;

        @Builder
        public UserCreationDto(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
