class Solution {
    public int consecutiveNumbersSum(int n) {
          int numberOfSequence= 0;
        int k= 1;//Intial 1 length always satisfies //Length  of sequence is represented by k
        
        while ( (2*n) > k*(k-1) ) {
            
            int numerator= n- (k* (k-1)/ 2);
            int denominator= k;
            
            if ( numerator % denominator == 0 )//because starting no "x" of the new sequence has to be Integer 
                numberOfSequence+= 1;
            
            k+= 1;//Increasing length 
        }
        
        return numberOfSequence;//Total No of valid sequeunce which sums to n
    }
}