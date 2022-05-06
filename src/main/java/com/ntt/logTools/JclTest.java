package com.ntt.logTools;

import org.apache.commons.logging.LogFactory;
import sun.rmi.runtime.Log;



public class Main {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(Main.class);
        log.info("start...");
        log.warn("end.");
    }
}
