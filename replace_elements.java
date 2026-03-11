class Solution {
    public int[] replaceElements(int[] arr) {
        int res[]=new int[arr.length];
        for(int i=0;i<res.length;i++)
        {
            int max=0;
            for(int j=i+1;j<res.length;j++)
            {
                if(arr[j]>max) max=arr[j];
            }
            if(i==res.length-1)
            {
                res[i]=-1;
                break;
            }
            res[i]=max;
        }
        return res;
    }
}