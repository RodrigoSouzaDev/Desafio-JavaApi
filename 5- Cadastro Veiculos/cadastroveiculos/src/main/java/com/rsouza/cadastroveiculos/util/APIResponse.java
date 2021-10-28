package com.rsouza.cadastroveiculos.util;

import org.springframework.http.HttpStatus;

public class APIResponse {

    private int status;
    private Object payLoad;
    private Object error;

    public APIResponse (){
        this.status = HttpStatus.OK.value();
        this.payLoad = payLoad;
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(Object payLoad) {
        this.payLoad = payLoad;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
