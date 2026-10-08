package com.example;

import org.apache.commons.lang3.StringUtils;

public class MavenDemo {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        String testString="";

        if(StringUtils.isEmpty(testString)){
            System.out.printf("The string is empty");
        }else{
            System.out.printf("The string is not empty");
        }
    }
}
