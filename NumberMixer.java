public class NumberMixer {

    public static int mixIntegers(int num1, int num2) {
        StringBuilder result = new StringBuilder();

        char[] digits1 = String.valueOf(num1).toCharArray();
        char[] digits2 = String.valueOf(num2).toCharArray();

        int maxLength = Math.max(digits1.length, digits2.length);

        for (int i = 0; i < maxLength; i++) {
            if (digits1.length > i) {
                result.append(digits1[i]);
            }
            if (digits2.length > i) {
                result.append(digits2[i]);
            }
        }

        try {
            if (Integer.parseInt(result.toString()) > 1000000) {
                return -1;
            }
            return Integer.parseInt(result.toString());
        } catch (Exception e) {
            return 0;
        }
    }

}
