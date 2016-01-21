public class MedianTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    }

    public static double getkth(int[] A,int aStart,int[] B,int bStart,int k){
    	if(aStart>A.length-1) return B[bStart+k-1];
    	if(bStart>B.length-1) return A[aStart+k-1];
    	if(k==1) return Math.min(A[aStart],B[bStart]);

    }
}