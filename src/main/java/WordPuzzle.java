import static spark.Spark.*;
import java.util.HashMap;

public class WordPuzzle {
  public String replaceTheVowels(String input){
  input = input.replace("a", "-");
    return input;
  }
}
