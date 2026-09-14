class Solution {
    public String multiply(String num1, String num2) {
        int[] arr = new int[num1.length()+num2.length()];
        int prevIdx = arr.length;
       int left = num1.length()-1;
       while(left>=0){
       int idx = prevIdx-1;
        int right = right = num2.length()-1;
        while(right>=0){
            int num_1 = num1.charAt(left)-'0';
            int num_2 = num2.charAt(right)-'0';
            int multi = num_1*num_2;
            int add = multi+arr[idx];
            if(add>=10){
                int ones = add%10;
                int hundreds = add/10;
                arr[idx]=ones;
                
                arr[idx-1] += hundreds;
                
                idx--;
            }else{
                arr[idx]=add;
                idx--;
            }
            right--;
        }
        left--;
        prevIdx--;
       }
       StringBuilder ans = new StringBuilder();
       int i = 0;
       while(i<arr.length && arr[i]==0){
        i++;
       }
       if(i==arr.length){
        return "0";
       }
       while(i<arr.length){
        ans.append(arr[i]);
        i++;
       }
       return ans.toString();
    }
}