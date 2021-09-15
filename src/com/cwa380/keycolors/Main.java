package com.cwa380.keycolors;

import com.logitech.gaming.LogiLED;

public class Main {
    public static void main(String[] args) {
        LogiLED.LogiLedInit();
        LogiLED.LogiLedSetLighting(100, 0, 0);
        LogiLED.LogiLedShutdown();
    }
}