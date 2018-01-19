package com.lab111.labwork6;

/**
 * @author dima_
 * Class handler for POSTrequests
 */
public class PostHandler extends Handler {
    public PostHandler() {
        this.type = "POST";
    }

    @Override
    public void reading(Request request) {
        System.out.println("Я, POST обработчик, обрабатываю запрос " + request.getType());
    }

    @Override
    public void failure(Request request) {
        System.out.println("Я, POST обработчик, не могу обработать запрос " + request.getType());
    }
}
