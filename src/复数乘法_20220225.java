public class 复数乘法_20220225 {
    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+-1i", "0+0i"));
    }


    static String complexNumberMultiply(String num1, String num2) {
        String[] numOne = num1.split("\\+");
        String[] numTwo = num2.split("\\+");
        Integer n1zs = Integer.parseInt(numOne[0]);
        Integer n2zs = Integer.parseInt(numTwo[0]);

        Integer n1xs = Integer.parseInt(numOne[1].replace("i", ""));
        Integer n2xs = Integer.parseInt(numTwo[1].replace("i", ""));

        int zsczs = n1zs * n2zs;
        int xsczs = n1zs * n2xs + n2zs * n1xs;
        int xscxs = -(n1xs * n2xs);

        int resultZS = zsczs + xscxs;
        String result = resultZS + "+" + xsczs + "i";
        return result;
    }
}
