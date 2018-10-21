package com.comcast.ucAppAutomation.utils;

public class CapabalityFactory {
    private static final ThreadLocal<String> CURRENT = new ThreadLocal<String>();

    public static String getCapability() {
        return CURRENT.get();
    }

    public static void setCapability(String capability) {
        CURRENT.set(capability);
    }
}