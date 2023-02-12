class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a[]=new int[m];
        for(int i=0;i<a.length;i++)
            a[i]=nums1[i];
        int i=0,j=0,k=0;
        while(i!=m && j!=n){
            if(a[i]<=nums2[j]){
                nums1[k++]=a[i];
                i++;
            }
            else{
                nums1[k++]=nums2[j];
                j++;
            }
        }
        if(i==m){
            while(j<n){
                nums1[k++]=nums2[j++];
            }
        }
        if(j==n){
            while(i<m){
                nums1[k++]=a[i++];
            }
        }
    }
}