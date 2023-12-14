package org.sid.ebankingbackend.exceptions;

import org.aspectj.bridge.IMessage;

public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String message) {
        super(message);

    }
}
