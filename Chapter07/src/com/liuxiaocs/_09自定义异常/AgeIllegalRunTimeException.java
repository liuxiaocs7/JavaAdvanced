package com.liuxiaocs._09自定义异常;

/**
 * 自定义运行时异常类：
 *      1.继承Exception
 *      2.重写构造器
 */
public class AgeIllegalRunTimeException extends RuntimeException {

    public AgeIllegalRunTimeException() {
        super();
    }

    public AgeIllegalRunTimeException(String message) {
        super(message);
    }

    public AgeIllegalRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeIllegalRunTimeException(Throwable cause) {
        super(cause);
    }

    protected AgeIllegalRunTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
