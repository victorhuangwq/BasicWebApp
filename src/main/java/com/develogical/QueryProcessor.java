package com.develogical;

import java.util.*;
public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if(query.toLowerCase().contains("what is your name")) {
            return "Vinuda";
        }

        if(query.toLowerCase().contains("largest number")){
            String[] numArray = query.split(":")[1].split(",");
            int result = 0;
            for(String num : numArray){
                result = Integer.max(result, Integer.parseInt(num));
            }

            return String.valueOf(result);
        }
        return "";
    }
}
