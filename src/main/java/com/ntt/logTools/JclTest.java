package com.ntt.logTools;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// kat 底层是对loginfo的封装，log写日志到磁盘，
//问题的原因包导错了

public class JclTest {
    private static final Log log = LogFactory.getLog(JclTest.class);

    public static void main(String[] args) {
        String msg = "print log, current level: ";
        log.trace(msg + "trace");
        log.debug(msg + "debug");
        log.info(msg + "info");
        log.warn(msg + "warn");
        log.error(msg + "error");
        log.fatal(msg + "fatal");
        System.out.println("打印成功");
    }
}
