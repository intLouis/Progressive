import java.util.Arrays;
import java.util.Random;

public class quickSort {
    public static void main(String[] args) {
        int[] ints = {5, 1, 1, 2, 0, 0};
        sortArray(ints);
        System.out.println(Arrays.toString(ints));
    }

    static int[] sortArray(int[] nums) {
        int len = nums.length;
        quickSort1(nums, 0, len - 1);
        return nums;
    }

    static void quickSort(int[] nums, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;

        int randomPivotIndex = startIndex + new Random().nextInt(endIndex - startIndex + 1);//获取基准值下标
        swap(nums, startIndex, randomPivotIndex);
        int pivot = nums[startIndex];
        int l = startIndex;
        int r = endIndex;
        while (l < r) {
            while (l < r && nums[r] >= pivot) {
                r--;
            }
            if (l < r) {
                nums[l] = nums[r]; //右边的数字换到左边指针处
            }
            while (l < r && nums[l] <= pivot) {
                l++;
            }
            if (l < r) {
                nums[r] = nums[l];
            }
        }
        //此时，左右指针重合了， l与r是相等的。
        nums[l] = pivot;
        quickSort(nums, startIndex, l - 1);
        quickSort(nums, l + 1, endIndex);

    }

    /**
     * 数组交换元素
     *
     * @param nums
     * @param startIndex
     * @param randomPivotIndex
     */
    static void swap(int[] nums, int startIndex, int randomPivotIndex) {
        int temp = nums[startIndex];
        nums[startIndex] = nums[randomPivotIndex];
        nums[randomPivotIndex] = temp;
    }

    public static void quickSort1(int[] nums, int startIndex, int endIndex) {
        if (startIndex >= endIndex) return;
        int pivot = nums[startIndex];
        int l = startIndex;
        int r = endIndex;
        while (l < r) {
            while (l < r && nums[r] > pivot) {//从右往左找比基准值小的元素
                r--;
            }
            // if(l < r) nums[l] = nums[r];//找到后，放到l指针所在的下标位置。
            while (l < r && nums[l] <= pivot) {//从左往右找比基准值大的元素
                l++;
            }
            // if(l < r) nums[r] = nums[l];//找到后，放到r指针所在的下标位置。
            if (l < r) {
                swap(nums, r, l);
            }

        }
        swap(nums, startIndex, l);
        quickSort(nums, startIndex, l - 1);
        quickSort(nums, l + 1, endIndex);
    }


    public int quickSort2(int[] nums, int startIndex, int endIndex, int k) {
        if (startIndex >= endIndex) return 0;
        int kIndex = nums.length - 1 - (k - 1);

        int randomPivotIndex = startIndex + new Random().nextInt(endIndex - startIndex + 1);//获取基准值下标
        swap(nums, startIndex, randomPivotIndex);

        int pivot = nums[startIndex];
        int l = startIndex;
        int r = endIndex;
        while (l < r) {
            while (l < r && nums[r] >= pivot) {
                r--;
            }
            while (l < r && nums[l] <= pivot) {
                l++;
            }
            if (l < r) {
                swap(nums, l, r);
            }
        }
        swap(nums, startIndex, l);
        if (l - 1 == kIndex) {
            return nums[l];
        } else if (l - 1 >= kIndex) {
            quickSort(nums, startIndex, l - 1);
            return nums[kIndex];
        } else {
            quickSort(nums, l + 1, endIndex);
            return nums[kIndex];
        }
    }
}
