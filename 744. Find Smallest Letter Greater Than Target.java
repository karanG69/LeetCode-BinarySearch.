class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters[0]>target || letters[letters.length-1]<=target){
            return letters[0];
        }
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if (letters[mid]==target){
                while(mid<letters.length && letters[mid]==target){
                    mid+=1;
                }
                if(letters[mid]>target){
                    return letters[mid];
                }
                else{
                    return letters[0];
                }
            }
            else if(letters[mid]>target){
                if(letters[mid-1]<=target){
                    return letters[mid];
                }
                e=mid-1;
            }
            else{
                if(letters[mid+1]>target){
                    return letters[mid+1];
                }
                s=mid+1;
            }
        }
        return '1';
    }
}
