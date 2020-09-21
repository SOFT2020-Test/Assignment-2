public class Converter {

    //This could have been done in a oneliner using StringBuilders built-in reverse() method, but where is the fun in that.
    public static String ReverseString(String input) {
        if(input == null || input.isEmpty()) {
            return input;
        }

        String inputReversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            inputReversed = inputReversed + input.charAt(i);
        }
        return inputReversed;
    }

    public static String CapitaliseString(String input) {
        return input.toUpperCase();
    }

    public static String LowercaseString(String input) {
        return input.toLowerCase();
    }


}
