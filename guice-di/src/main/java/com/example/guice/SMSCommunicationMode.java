package com.example.guice;

import com.example.guice.aop.MessageSentLoggable;
import com.google.inject.Inject;
import java.util.logging.Logger;

/**
 *
 * @author baeldung
 */
public class SMSCommunicationMode implements CommunicationMode {

    @Inject
    private Logger logger;

    public CommunicationModel getMode() {
        return CommunicationModel.SMS;
    }

    @MessageSentLoggable
    public boolean sendMessage(String message) {
        logger.info("SMS message sent");
        return true;
    }

}