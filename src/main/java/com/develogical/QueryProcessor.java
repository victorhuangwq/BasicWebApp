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

        if(query.toLowerCase().contains("largest")){
            String[] numArray = query.split(":")[1].split(",");
            int result = 0;
            for(String num : numArray){
                result = Integer.max(result, Integer.parseInt(num.trim()));
            }

            return String.valueOf(result);
        }

        if(query.toLowerCase().contains("plus")){
            String[] numArray = query.split("is")[1].split("plus");
            int result = 0;
            for(String num : numArray){
                result += Integer.parseInt(num.trim());
            }

            return String.valueOf(result);
        }

        if(query.toLowerCase().contains("multiplied")){
            String[] numArray = query.split("is")[1].split("multiplied");
            int result = 1;
            for(String num : numArray){
                result *= Integer.parseInt(num.trim());
            }

            return String.valueOf(result);
        }


        return "";
    }
}
