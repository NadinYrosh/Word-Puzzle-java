import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;


public class WordPuzzleTest {

  @Test
  public void replaceTheVowels_ReplaceVowelAWithDash_Dash(){
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("c-t", testWordPuzzle.replaceTheVowels("cat"));
  }
}
