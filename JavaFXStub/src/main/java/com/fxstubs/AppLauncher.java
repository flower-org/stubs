package com.fxstubs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppLauncher {
    final static Logger LOGGER = LoggerFactory.getLogger(AppLauncher.class);

    public static void main(String[] args) {
        LOGGER.info("Starting JavaFX stub");
        App.main(args);
    }
}
