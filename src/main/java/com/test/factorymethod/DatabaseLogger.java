package com.test.factorymethod;

public class DatabaseLogger  implements Logger{

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }

}
