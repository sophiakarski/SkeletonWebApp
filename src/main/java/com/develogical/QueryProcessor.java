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

    return "";
  }
}
