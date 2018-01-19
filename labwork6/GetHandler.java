package com.lab111.labwork6;

/**
 * @author dima_
 * Class handler for GETrequests
 */
public class GetHandler extends Handler {
    public GetHandler() {
        this.type = "GET";
    }

    @Override
    public void reading(Request request) {
        System.out.println("Я, GET обработчик, обрабатываю запрос " + request.getType());
    }

    @Override
    public void failure(Request request) {
        System.out.println("Я, GET обработчик, не могу обработать запрос " + request.getType());
    }
}
