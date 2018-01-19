package com.lab111.labwork6;

/**
 * @author dima_
 * Class handler for CONNECTrequests
 */
public class ConnectHandler extends Handler {
    public ConnectHandler() {
        this.type = "CONNECT";
    }

    @Override
    public void reading(Request request) {
        System.out.println("Я, CONNECT обработчик, обрабатываю запрос " + request.getType());
    }

    @Override
    public void failure(Request request) {
        System.out.println("Я, CONNECT обработчик, не могу обработать запрос " + request.getType());
    }
}
