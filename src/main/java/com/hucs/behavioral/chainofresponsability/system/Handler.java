package com.hucs.behavioral.chainofresponsability.system;

interface Handler {
    void setNextHandler(Handler nextHandler);
    void handle(Alert alert);
}
