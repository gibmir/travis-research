package org.example.travis.java.service;

public class Service {

    private Service() {
    }

    public static String[] toUpperCase(String[] args) {
        String[] result = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            result[i] = args[i].toUpperCase();
        }
        return result;
    }
}
