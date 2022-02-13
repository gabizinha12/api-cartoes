package com.teste.handson.apibancaria.exceptions;

public class ErrorHandler {
    private final String field;
    private final String error;

    public ErrorHandler(String field, String error) {
        super();
        this.field = field;
        this.error = error;
    }

    public String getField() {
        return field;
    }

    public String getError() {
        return error;
    }
}
