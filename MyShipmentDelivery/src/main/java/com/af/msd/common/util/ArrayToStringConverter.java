package com.af.msd.common.util;

public class ArrayToStringConverter {

    public static String getStringFromArrayElements(Object[] objects){
        StringBuilder sb = new StringBuilder();
        for(Object obj:objects){
            sb.append(obj.toString()+" : ");
        }
        sb.replace(sb.length()-3, sb.length(), "");
        return sb.toString();
    }
}
