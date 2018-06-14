package com.example.komunitasku.exceptionhandler;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceExceptionNotFound extends RuntimeException{
    public ResourceExceptionNotFound() {
    }

    public ResourceExceptionNotFound(String s) {
        super(s);
    }

    public ResourceExceptionNotFound(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ResourceExceptionNotFound(Throwable throwable) {
        super(throwable);
    }

    public ResourceExceptionNotFound(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
