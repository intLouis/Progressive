public class 矩形面积_20220827 {
    public static void main(String[] args) {
        computeArea(0, 0, 0, 0, -1, -1, 1, 1);
    }

    static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int awidth = Math.abs(ax1 - ax2);//0
        int aHeight = Math.abs(ay1 - ay2);//0

        int bwidth = Math.abs(bx1 - bx2);//2
        int bHeight = Math.abs(by1 - by2);//2

        int d1 = awidth * aHeight;//0
        int d2 = bwidth * bHeight;//4

        int abweight = Math.abs(ax1 - bx2);//1
        int abheight = Math.abs(ay2 - by1);//1

        System.out.println(awidth + "|" + aHeight + "|" + bwidth + "|" + bHeight + "|" + d1 + "|" + d2 + "|" + abweight + "|" + abheight);

        //有重叠面积
        if (abweight < awidth + bwidth && abheight < aHeight + bHeight) {
            int qwidth = awidth + bwidth - abweight;
            int qheight = aHeight + bHeight - abheight;
            return d1 + d2 - qheight * qwidth;
        } else if (d1 == 0 || d2 == 0) {//无重叠面积
            return d1 == 0 ? d2 : d1;
        } else {
            return d1 + d2;
        }
    }
}
