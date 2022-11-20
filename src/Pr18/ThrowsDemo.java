package Pr18;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            throwsDemo.printMessage("beer");
            throwsDemo.printMessage(null);
        } catch (NullPointerException exception) {
            System.out.println("U've got an error");
        }
    }
}

