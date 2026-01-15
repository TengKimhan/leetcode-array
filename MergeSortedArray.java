// 88. Merge Sorted Array

public class MergeSortedArray {
    public static void main(String[] args) {
        // write the testcase here and run the program
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // [1,2,3,0,0,0], m = 3
        // [2,5,6], n = 3
        int i = m - 1; // Pointer for nums1 // 2
        int j = n - 1; // Pointer for nums2 // 2
        int k = m + n - 1; // Pointer for merged array // 5

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
