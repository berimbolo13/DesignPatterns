package com.lab111.labwork6;

/**
 * @author dima_
 * Client class
 */
public class Client {
    public static void main(String[] args) {
        Handler gethandler = new GetHandler();
        Handler posthandler = new PostHandler();
        Handler connecthandler = new ConnectHandler();

        gethandler.setNextHandler(posthandler);
        posthandler.setNextHandler(connecthandler);

        Request getrequest = new Request("GET");
        Request connectrequest = new Request("CONNECT");

        gethandler.processing(getrequest);
        System.out.println();
        gethandler.processing(connectrequest);
    }
}
