package com.apoorvbansalgloballogicnoida.protobufdemo3;

import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {

    public static SimpleMessage serializeIntoFile(SimpleMessage message,String file)
    {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream(file+".bin");
            message.writeTo(fileOutputStream);
            fileOutputStream.close();
        }
        catch (Exception e)
        {

        }
        return message;
    }
    public static void main(String[] args) {
        System.out.println("Hello protobufdemo3");
        //Simple
        SimpleMessage message=SimpleMessage.newBuilder()
                .setId(1)
                .setIsSimple(true)
                .setName("Apoorv")
                .addAllSampleList(Arrays.asList(4,6,7)).build();
        serializeIntoFile(message,"simplemessage");
        try{
            FileInputStream fileInputStream=new FileInputStream("simplemessage.bin");
            SimpleMessage actual=SimpleMessage.parseFrom(fileInputStream);
            System.out.println(actual);
            fileInputStream.close();
        }
        catch (Exception e){

        }
    }
}

