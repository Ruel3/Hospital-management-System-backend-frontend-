// backend/src/main/java/com/example/hospital/dto/ApiResponse.java
package com.example.hospital.dto;

public class ApiResponse<T> {
    private boolean ok;
    private String message;
    private T data;

    public ApiResponse() {}
    public ApiResponse(boolean ok, String message, T data) {
        this.ok = ok; this.message = message; this.data = data;
    }
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(true, "success", data);
    }
    public static <T> ApiResponse<T> error(String msg) {
        return new ApiResponse<>(false, msg, null);
    }
    public boolean isOk() { return ok; }
    public String getMessage() { return message; }
    public T getData() { return data; }
}
