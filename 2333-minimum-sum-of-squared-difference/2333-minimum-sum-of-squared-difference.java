import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        int[] diff = new int[n];

        int max = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            sum += diff[i];
        }

        if (sum <= k) {
            return 0;
        }

        int left = 0;
        int right = max;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long required = 0;

            for (int d : diff) {
                if (d > mid) {
                    required += d - mid;
                }
            }

            if (required <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int limit = left;
        long remaining = k;
        long result = 0;

        for (int d : diff) {
            if (d > limit) {
                remaining -= d - limit;
                d = limit;
            }
            result += (long) d * d;
        }

        // Use any leftover operations to reduce differences at the limit.
        // Each such operation reduces one limit to limit - 1.
        long extra = Math.max(0, remaining);

        // Recalculate directly using the optimal threshold.
        result = 0;
        for (int d : diff) {
            int reduced = Math.min(d, limit);
            result += (long) reduced * reduced;
        }

        // The binary search finds the smallest feasible threshold.
        // Remaining operations reduce some values equal to that threshold.
        long countAtLimit = 0;
        for (int d : diff) {
            if (d >= limit) {
                countAtLimit++;
            }
        }

        extra = Math.min(extra, countAtLimit);

        result -= extra * (2L * limit - 1);

        return result;
    }
}