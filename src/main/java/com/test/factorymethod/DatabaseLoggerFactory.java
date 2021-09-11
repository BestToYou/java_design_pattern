package com.test.factorymethod;

public class  DatabaseLoggerFactory implements  LoggerFactory{
    @Override
    public Logger createLogger() {
        //链接数据库
        Logger logger =new DatabaseLogger();
        return logger;
    }
}
