package org.example.chainOfResponsibility;

public class Main {
    public static void main(String[] args){
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "Exception occured");
        logObject.log(LogProcessor.DEBUG, "Need to debug this");
        logObject.log(LogProcessor.INFO, "Just for info");
    }
}
