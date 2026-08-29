class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freqJ = new int[256];
        for(int i=0; i<jewels.length(); i++){
            freqJ[jewels.charAt(i)-0]++;
        }
        int count = 0;
        for(int i=0; i<stones.length(); i++){
            if(freqJ[stones.charAt(i)-0]!=0){
                count++;
            }
        }

        return count;
    }
}