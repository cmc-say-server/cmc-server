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

    // User
    USER_NOT_FOUND(404, "U001", "해당 유저가 존재하지 않습니다."),
    DUPLICATED_BLOCK(400,"U002" , "중복된 차단입니다."),
    DUPLICATED_REPORT(400, "U003", "중복된 신고입니다."),
    SELF_BLOCK_OR_REPORT(400, "U004", "신고/차단하는 유저와 당하는 유저가 같습니다."),
    REPORT_TYPE_ERROR(400, "U005", "신고 타입이 잘못되었습니다."),

    // Jwt
    TOKEN_INVALID_EXCEPTION(401, "J001", "유효하지 않은 토큰입니다."),

    // s3
    FILE_SIZE_EXCEED(400, "S001" , "파일이 제한 크기를 초과하였습니다."),
    FILE_UPLOAD_ERROR(400, "S002", "파일 업로드에 실패하였습니다."),

    // world
    ORDER_TYPE_ERROR(400, "W001" , "정렬 타입이 잘못되었습니다." ),
    WORLD_NOT_FOUND(400, "W002", "존재하지 않는 세계관입니다."),
    WORLD_USER_LIMIT_ERROR(400, "W003", "설정하려는 user limit 가 현재의 세계관 인원보다 작습니다."),

    // avatar
    AVATAR_NOT_FOUND(400, "A001", "해당 아이디의 캐릭터가 존재하지 않습니다." ),
    WORLD_AVATAR_NOT_FOUND(400, "A002", "해당 캐릭터는 해당 세계관에 참여하고 있지 않습니다."),
    DUPLICATED_AVATAR_WORLD_ENTER(400, "A003", "해당 캐릭터는 이미 세계관에 참여하고 있습니다."),

    // todo
    TODO_NOT_FOUND(400, "T001", "해당 todo 가 존재하지 않습니다."),
    TODO_CHECKED_NOT_FOUND(400, "T002", "체크되어 있지 않은 todo 입니다.");

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
