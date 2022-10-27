public class 替换空格_20220224 {
    public 替换空格_20220224() {
    }
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals(' ')) {
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
