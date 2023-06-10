class Solution {
public:
    int guessNumber(int n) {
        if(n==1){
            if (guess(n)==0){
                return 1;
            }
        }
        int s=0;
        int e=n;
        int mid=n/2;
        if (guess(mid)==0){
            return mid;
        }
        else if (guess(mid)==1){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        for(int i=s;i<e;i++){
            if (guess(i)==0){
                return i;
            }
        }
        return e;
    }
};
