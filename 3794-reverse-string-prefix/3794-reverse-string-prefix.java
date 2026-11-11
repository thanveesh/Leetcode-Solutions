class Solution {
    public String reversePrefix(String s, int k) {
        char[] a=s.toCharArray();
        int l=0;
        int r=k-1;
        while(l<r){
            char t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
        return new String(a);
    }
}