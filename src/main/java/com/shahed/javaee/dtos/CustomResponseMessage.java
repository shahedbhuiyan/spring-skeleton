package com.shahed.javaee.dtos;

import org.springframework.stereotype.Component;

@Component
public class CustomResponseMessage {
    private ResponseMessage responseMessage;

    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }

}
