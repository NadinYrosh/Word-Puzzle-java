import static spark.Spark.*;
import java.util.HashMap;

public class WordPuzzle {

  public String replaceTheVowels(String input){
  input = input.toLowerCase();
  input = input.replace("a", "-");
  input = input.replace("e", "-");
  input = input.replace("i", "-");
  input = input.replace("o", "-");
  input = input.replace("u", "-");
    return input;
  }
}
