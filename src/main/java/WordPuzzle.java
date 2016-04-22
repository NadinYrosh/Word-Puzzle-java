import static spark.Spark.*;
import java.util.HashMap;

public class WordPuzzle {

  public String replaceTheVowels(String input){
  input = input.replace("a", "-");
  input = input.replace("e", "-");
  input = input.replace("i", "-");
  input = input.replace("o", "-");
  input = input.replace("u", "-");
  input = input.replace("A", "-");
  input = input.replace("E", "-");
  input = input.replace("I", "-");
  input = input.replace("O", "-");
  input = input.replace("U", "-");
  return input;
  }
}
