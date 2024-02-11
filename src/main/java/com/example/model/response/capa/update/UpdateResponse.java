package com.example.model.response.capa.update;

import com.google.gson.Gson;

public class UpdateResponse {
    private Boolean status = false;
    private String statusCode = "";
    private String data = "";

    public UpdateResponse(Boolean status, String statusCode, String data) {
        this.status = status;
        this.statusCode = statusCode;
        this.data = data;
    }
    public UpdateResponse(Boolean status, String statusCode) {
        this.status = status;
        this.statusCode = statusCode;
        this.data = null;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
