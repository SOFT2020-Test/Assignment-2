public class Converter {
    public static String ReverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String CapitaliseString(String input) {
        return input.toUpperCase();
    }

    public static String LowercaseString(String input) {
        return input.toLowerCase();
    }


}
