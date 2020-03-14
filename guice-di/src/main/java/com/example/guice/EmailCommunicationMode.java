package com.example.guice;


import com.example.guice.aop.MessageSentLoggable;

/**
 *
 * @author baeldung
 */
public class EmailCommunicationMode implements CommunicationMode {

    public CommunicationModel getMode() {
        return CommunicationModel.EMAIL;
    }


    @MessageSentLoggable
    public boolean sendMessage(String Message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}