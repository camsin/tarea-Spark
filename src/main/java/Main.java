import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/suma", (req, res) -> {
            return "5 + 6 = " + (5+6);
        });
        get("/resta", (req, res) -> {
            return "5 - 6 = " + (5-6);
        });
    }
}