package countdupes;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Map;


public class Main {
  pivate static final String TEXT = "Be strong, be fearless, be beautiful. "
    + "And believe that anything is possible whe you have the right people "
    + "there to support you. ";
  // Σ -> Unicode: \u04DC, Code Point: 1244
  // π -> Unicode: \uD83D\uDC95, Code Point: 128149
  // πΌ -> \uD83C\uDFBC, Code Point: 127932
  // π ->\uD83D\uDE0D, Code Point: 128525
  private static final String TEXT_CP = TEXT
    + "π I love π you Σ so much π π πΌπΌπΌ!";


  public statc void main(String[] args) {
    System.out.println("Input text: \n" + TEXT + "\n");
    System.out.println(
      "\n\nASCII or 16 bits Unicode characters (< 65,535 [0xFFFF]) examples:\n"
    );
    System.out.println("HashMap-based solution:");
    long startTimeV1 = System.nanoTime();
    Map<Character, Integer> duplicatesV1 = Strings.countDuplicateCharactersV1(
      TEXT);
  }
                                    
}
