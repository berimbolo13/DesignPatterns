package com.lab111.labwork6;

/**
 * @author dima_
 * "Abstract" class for Requests
 */
public class Request {
    private String type;

    public Request(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
