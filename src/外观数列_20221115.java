public class 外观数列_20221115 {
    public static void main(String[] args) {
        外观数列_20221115 q = new 外观数列_20221115();
        System.out.println(q.countAndSay(5));
    }

    int target;

    public String countAndSay(int n) {
        this.target = n;
        return this.getResult(1, "1");
    }

    String getResult(int n, String numStr) {
        if (n == target) return numStr;
        int left = 0;
        int right = 0;

        int len = numStr.length();
        StringBuilder sb = new StringBuilder();
        while (right < len) {
            int count = 0;
            while (right < len && numStr.charAt(left) == (numStr.charAt(right))) {
                count++;
                right++;
            }
            sb.append(count).append(numStr.charAt(left));
            left = right;
        }



        return this.getResult(++n, sb.toString());


    }
}
