package com.develogical;

// CMD + SHFT + T (find test file)

public class QueryProcessor {

    public String process(String query) {

        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
                    + "English poet, playwright, and actor, widely regarded as the greatest "
                    + "writer in the English language and the world's pre-eminent dramatist.";
        }

        // minimum pass did not need '.toLowerCase()'

        else if (query.toLowerCase().contains("sza")) {
            return "Solána Imani Rowe (born November 8, 1989), known professionally as SZA (/ˈsɪzə/ SIZ-ə), is an American singer and songwriter.";
        }

        else if (query.toLowerCase().contains("what is your name?")) {
            return "aymen-sophia";
        }

        else if (query.toLowerCase().contains("which of the following numbers is the largest")) {

            // extract numbers
            String noQuestionMark = query.replace("?", "");
            String[] parts = noQuestionMark.split(": ");
            String[] numbers = parts[1].split(", ");

            int first = Integer.parseInt(numbers[0]);
            int second = Integer.parseInt(numbers[1]);
            int third = Integer.parseInt(numbers[2]);

            if (first > second) {
                if (first > third) {
                    return String.valueOf(first);
                } else {
                    return String.valueOf(third);
                }
            } else if (second > third) {
                return String.valueOf(second);
            } else {
                return String.valueOf(third);
            }
        }

        else if (query.toLowerCase().contains("plus")) {

            // extract numbers
            String noQuestionMark = query.replace("?", "");
            String[] parts = noQuestionMark.split(" ");

            int first = Integer.parseInt(parts[2]);
            int second = Integer.parseInt(parts[4]);

            // return type of function is string
            return String.valueOf(first + second);
        }

        else if (query.toLowerCase().contains("multiplied")) {

            // extract numbers
            String noQuestionMark = query.replace("?", "");
            String[] parts = noQuestionMark.split(" ");

            int first = Integer.parseInt(parts[2]);
            int second = Integer.parseInt(parts[5]);

            // return type of function is string
            return String.valueOf(first * second);
        }

        return "";
    }
}
