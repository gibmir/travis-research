package org.example.travis.java.starter;

import org.example.travis.java.service.Service;

import java.util.Arrays;

public class Starter {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Service.toUpperCase(args)));
    }
}
