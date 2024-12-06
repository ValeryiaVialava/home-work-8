//non-instantiable — cannot create objects of it
public final class Coder {
    private Coder() {
        throw new AssertionError("Cannot instantiate Coder class");
    }

    private static final String SOURCE = "GADERYPOLUKIgaderypoluki";
    private static final String TARGET = "AGEDYROPULIKagedyropulik";

    public static String code(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            int index = SOURCE.indexOf(c);
            if (index >= 0) {
                result.append(TARGET.charAt(index));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
