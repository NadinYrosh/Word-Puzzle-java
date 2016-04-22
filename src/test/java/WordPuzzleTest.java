import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;


public class WordPuzzleTest {

  @Test
  public void replaceTheVowels_ReplaceVowelAWithDash_Dash(){
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("c-t", testWordPuzzle.replaceTheVowels("cat"));
  }
  @Test
  public void replaceTheVowels_ReplaceAllVowelsWithDash_Dash(){
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("-d-c-t--n", testWordPuzzle.replaceTheVowels("education"));
  }
  @Test
  public void replaceTheVowels_ReplaceAllVowelsForMixedCaseWord_Dash(){
    WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("-d-c-t--n", testWordPuzzle.replaceTheVowels("EducatIon"));
  }
}
