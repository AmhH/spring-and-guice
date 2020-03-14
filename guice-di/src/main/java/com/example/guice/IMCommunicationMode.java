package com.example.guice;


import com.example.guice.aop.MessageSentLoggable;
import com.google.inject.Inject;

import java.util.logging.Logger;

/**
 *
 * @author baeldung
 */
public class IMCommunicationMode implements CommunicationMode {

    @Inject
    private Logger logger;


    public CommunicationModel getMode() {
        return CommunicationModel.IM;
    }


    @MessageSentLoggable
    public boolean sendMessage(String message) {
        logger.info("IM Message Sent");
        return true;
    }

}