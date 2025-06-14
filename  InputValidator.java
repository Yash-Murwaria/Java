package utils;

public class InputValidator {
    public static boolean isValidName(String name) {
        return name.matches("^[A-Za-z\\s]{3,30}$");
    }
}