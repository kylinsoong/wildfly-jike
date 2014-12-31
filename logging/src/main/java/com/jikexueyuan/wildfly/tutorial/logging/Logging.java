package com.jikexueyuan.wildfly.tutorial.logging;

import org.jboss.logging.Logger;

public class Logging {

    private static Logger log = Logger.getLogger(Logging.class.getName());

    public static void log() {
        log.fatal("Fatal message");
        log.error("Error message");
        log.warn("Warning message");
        log.info("Information message");
        log.debug("Debug message");
        log.trace("Trace message");
    }
}
