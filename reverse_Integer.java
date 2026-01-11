class Solution {
    public int reverse(int x) {
        long ans=0;
        int nw;
        while(x!=0){
            ans=(ans*10)+(x%10);
            x=x/10;
        }

        if(Math.pow(-2,31)<=ans && ans<=(Math.pow(2,31)-1)){
            nw=(int)ans;
            return nw;
        }
        else{
            return 0;
        }
    }
}