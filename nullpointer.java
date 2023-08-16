public class nullpointer {
    public static void main(String[] args) {
        String text = null;

        try {
            int length = text.length();
            System.out.println("Length of text: " + length);
        } catch (NullPointerException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
