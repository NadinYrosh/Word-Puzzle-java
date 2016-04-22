import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


// public class App {
//   public static void main(String[] args) {
//     staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//         HashMap model = new HashMap();
//         model.put("template", "templates/index.vtl" );
//         return new ModelAndView(model, "templates/layout.vtl");
//       }, new VelocityTemplateEngine());
//
//     get("/results", (request, response) -> {
//         HashMap model = new HashMap();
//         model.put("template", "templates/results.vtl" );
//
//         Integer number = Integer.parseInt(request.queryParams("input"));
//         CoinCombo myCombo = new CoinCombo();
//         HashMap<String, Integer> coins = myCombo.comboOfCoins(number);
//         String outputString = String.format("Ypur change is - %d quaters and %d dimes and %d nickes with %d pennies", coins.get("quarters"), coins.get("dimes"), coins.get("nikels"), coins.get("pennies"));
//         model.put("results", outputString);
//         return new ModelAndView(model, "templates/layout.vtl");
//       }, new VelocityTemplateEngine());
//
//   }
// }
