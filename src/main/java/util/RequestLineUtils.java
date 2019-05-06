package util;

public class RequestLineUtils {
    public static String getPath(String input) {
        return input.split(" ")[1];
    }
}
