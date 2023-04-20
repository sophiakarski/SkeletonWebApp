package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsAboutSza() throws Exception {
    assertThat(queryProcessor.process("Sza"), containsString("singer"));
  }

  @Test
  public void knowsYourName() throws Exception {
    assertThat(queryProcessor.process("What is your name?"), containsString("aymen-sophia"));
  }

  @Test
  public void knowsLargestNumberOfThree() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 23, 77, 89?"), containsString("89"));
  }

  @Test
  public void knowsTwoAddedNumbers() throws Exception {
    assertThat(queryProcessor.process("What is 14 plus 81?"), containsString("95"));
  }

  @Test
  public void knowsTwoMultipliedNumbers() throws Exception {
    assertThat(queryProcessor.process("What is 2 multiplied by 4?"), containsString("8"));
  }

}
