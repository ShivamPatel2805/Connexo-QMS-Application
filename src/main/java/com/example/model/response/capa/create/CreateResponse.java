package com.example.model.response.capa.create;

import com.google.gson.Gson;

public class CreateResponse<T> {
    private Boolean status = false;
    private String statusCode = "";
    private String message = "";
    private T data = null;

    public CreateResponse(Boolean status, String statusCode, T data) {
        this.status = status;
        this.statusCode = statusCode;
        this.data = data;
    }

    public CreateResponse(Boolean status, String statusCode, String message, T data) {
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public CreateResponse(Boolean status, String statusCode) {
        this.status = status;
        this.statusCode = statusCode;
        this.data = null;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
