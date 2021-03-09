package web.backend.demo.common;

import lombok.Builder;

import java.util.Optional;

public class CommonResponse {
    private String message;
    private int code;
    private Optional<String> traceback;

    @Builder
    public CommonResponse(String message, int code, Optional<String> traceback) {
        this.message = message;
        this.code = code;
        this.traceback = traceback;
    }
}
