import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/index.vtl" );
        return new ModelAndView(model, "templates/layout.vtl");
      }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/results.vtl" );

        String input = request.queryParams("input");
        WordPuzzle testWordPuzzle = new WordPuzzle();
        input = testWordPuzzle.replaceTheVowels(input);

        model.put("input", input);
        return new ModelAndView(model, "templates/layout.vtl");
      }, new VelocityTemplateEngine());

  }
}
