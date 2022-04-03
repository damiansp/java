package countdupes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public final class Strings {
  private Strings() {
    throw new AssertionError("Cannot be instantiated");
  }

  public static Map<Character, Integer> countDuplicateCharactersV1(String str) {
    if (str == null || str.isBlank()) {
      return Collections.emptyMap();
    }
    Map<Character, Integer> result = new HashMap<>();
    for (char ch: str.toCharArray()) {
      result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
    }
    return result
  }

  public static Map<String, Integer> countDuplicateCharactersVCP1(String str) {
    /* Continue... */
  }
}
