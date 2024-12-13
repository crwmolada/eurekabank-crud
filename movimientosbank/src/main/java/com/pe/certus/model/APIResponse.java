package com.pe.certus.model;

import java.util.List;

public class APIResponse {
    private String codeResponse;
    private String messageResponse;
    private List<MovimientoResponse> data;

    public APIResponse() {
        super();
    }

    public APIResponse(String codeResponse, String messageResponse, List<MovimientoResponse> data) {
        this.codeResponse = codeResponse;
        this.messageResponse = messageResponse;
        this.data = data;
    }

    public String getCodeResponse() {
        return codeResponse;
    }

    public void setCodeResponse(String codeResponse) {
        this.codeResponse = codeResponse;
    }

    public String getMessageResponse() {
        return messageResponse;
    }

    public void setMessageResponse(String messageResponse) {
        this.messageResponse = messageResponse;
    }

    public List<MovimientoResponse> getData() {
        return data;
    }

    public void setData(List<MovimientoResponse> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "APIResponse [codeResponse=" + codeResponse + ", messageResponse=" + messageResponse + ", data=" + data
                + "]";
    }

}
