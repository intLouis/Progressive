public class 寻找两个正序数组的中位数_20220325 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{100001}, new int[]{10000}));
    }


    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int flag1 = 0;
        int flag2 = 0;
        int i = 0;
        double res = 0;
        boolean q = (nums1.length + nums2.length) % 2 == 0;
        if (nums1.length == 0) {
            if (q) return ((double) nums2[nums2.length - 1] + (double) nums2[0]) / 2;
            else return (double) nums2[(nums2.length - 1) / 2];
        } else if (nums2.length == 0) {
            if (q) return ((double) nums1[nums1.length - 1] + (double) nums1[0]) / 2;
            else return (double) nums1[(nums1.length - 1) / 2];
        }
        int[] num = new int[nums1.length + nums2.length];
        while (flag1 + flag2 <= nums1.length + nums2.length - 1) {
            if (flag1 < nums1.length && nums1[flag1] <= nums2[flag2]) {
                num[i] = nums1[flag1];
                flag1 = flag1 == nums1.length - 1 ? flag1 : flag1 + 1;
            } else {
                num[i] = nums2[flag2];
                flag2 = flag2 == nums2.length - 1 ? flag2 : flag2 + 1;
            }
            if (q) {
                if (i == (int) ((nums1.length + nums2.length - 1) / 2) + 1) {
                    res = ((double) num[i] + (double) num[i - 1]) / 2;
                    break;
                }
            } else {
                if (i == (nums1.length + nums2.length - 1) / 2) {
                    res = num[i];
                    break;
                }
            }
            i++;

        }
        return res;
    }
}
