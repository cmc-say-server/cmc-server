package cmc.error.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    // Common
    INVALID_INPUT_VALUE(400, "C001", " Invalid Input Value"),
    METHOD_NOT_ALLOWED(405, "C002", " Invalid Input Value"),
    ENTITY_NOT_FOUND(400, "C003", " Entity Not Found"),
    INTERNAL_SERVER_ERROR(500, "C004", "Server Error"),
    INVALID_TYPE_VALUE(400, "C005", " Invalid Type Value"),
    ACCESS_DENIED(403, "C006", "Access is Denied"),

    // Auth
    EMAIL_DUPLICATION(400, "M001", "Email is Duplication"),
    LOGIN_INPUT_INVALID(400, "M002", "Login input is invalid"),

    // User
    USER_NOT_FOUND(404, "U001", "User not found"),

    // Jwt
    TOKEN_INVALID_EXCEPTION(401, "J001", "유효하지 않은 토큰입니다."),

    // s3
    FILE_SIZE_EXCEED(400, "S001" , "파일이 제한 크기를 초과하였습니다."),
    FILE_UPLOAD_ERROR(400, "S002", "파일 업로드에 실패하였습니다.");

    private final String code;
    private final String message;
    private int status;

    ErrorCode(final int status, final String code, final String message) {
        this.status = status;
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getCode() {
        return code;
    }

    public int getStatus() {
        return status;
    }


}