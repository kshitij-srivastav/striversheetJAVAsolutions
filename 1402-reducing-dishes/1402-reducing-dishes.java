class Solution {
    public int maxSatisfaction(int[] satisfaction) {
         // Sort satisfaction rating in ascending order so lower ones will be in left-most positions, and highest ones will be on right-most positions
        Arrays.sort(satisfaction);
        
        // Skip over the negative satisfaction ratings
        int pos = 0;
        while(pos < satisfaction.length && satisfaction[pos] < 0){
            pos++;
        }
        
        // Now calculate the like-time coefficient
        int i = pos;
        int coefficient = 0;
        int sequence = 1;
        int sum = 0;
        while(i < satisfaction.length){
            sum += satisfaction[i];     // Used in next step
            coefficient += satisfaction[i++] * sequence++;
        }
        
        // Finally, move backwards from pos to see if the increase to the higher values gained by bumping their position will offset the hit of the negative satisfaction
        pos--;
        while(pos >= 0){
            sum += satisfaction[pos];
            int newCoefficient = coefficient + sum;
            if (newCoefficient < coefficient) break;
            coefficient = newCoefficient;
            pos--;
        }
        
        
        // Return the coefficient
        return coefficient;
    }
}