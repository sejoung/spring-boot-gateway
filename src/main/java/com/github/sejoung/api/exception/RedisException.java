package com.github.sejoung.api.exception;

/**
 * @author kim se joung
 *
 */
public class RedisException extends Exception {

    private static final long serialVersionUID = 8739209668683484162L;

    private String errorCode;

    private String errorMsg;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public RedisException() {
        super();
    }

    public RedisException(String errorCode) {
        super(errorCode);
        setErrorCode(errorCode);
    }

    public RedisException(String errorCode, String errorMsg) {
        super(errorCode);
        setErrorMsg(errorMsg);
        setErrorCode(errorCode);
    }

    public RedisException(Throwable cause) {
        super(cause);
    }

    public RedisException(String message, Throwable cause) {
        super(message, cause);
    }

}