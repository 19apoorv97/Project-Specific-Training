package com.apoorvbansalgloballogicnoida.protobufdemo3;

import example.simple.Simple.SimpleMessage;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SimpleMainTest {
    @Test
    public void serializeIntoFile_storeNewMessage_returnStoredMessage()
    {
        SimpleMessage message=SimpleMessage.newBuilder()
                .setId(2)
                .setIsSimple(true)
                .setName("Bansal")
                .addAllSampleList(Arrays.asList(1,2,3)).build();
        SimpleMessage expected=SimpleMain.serializeIntoFile(message,"testmessage");
        try{
            FileInputStream fileInputStream=new FileInputStream("testmessage.bin");
            SimpleMessage actual=SimpleMessage.parseFrom(fileInputStream);
            assertEquals(expected,actual);
            fileInputStream.close();
        }
        catch (Exception e){

        }
    }
}