package com.lab111.labwork6;

/**
 * @author dima_
 * abstract class for handlers
 */
public abstract class Handler {
    protected String type;
    private Handler nextHandler;

    /**
     *
     * @param nextHandler link for next handler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     *
     * @param request is processed request
     */
    public void processing(Request request){
        if (request.getType() == this.type) {
            reading(request);
        } else {
            failure(request);
        }

        if (nextHandler != null) {
            nextHandler.processing(request);
        }
    }

    public abstract void reading(Request request);

    public abstract void failure(Request request);
}
