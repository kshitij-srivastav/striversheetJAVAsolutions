class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int i;
        int n = energy.length;
        // 'ans' will track minimum number of training hours
        int ans = 0;
        for(i=0;i<n;i++){
            // If initial energy is more then we simply take a portion of this
            // i.e. we decrement it by energy[i]
            if(initialEnergy > energy[i]){
                initialEnergy -= energy[i];
            }
            else{
                // (initialEnergy <= energy[i])
                // if we had less or equal initial energy, then how much more energy do we need?
                // we need (energy[i] - initialEnergy + 1) more initial energy. Because only then
                // our initial energy will be more than energy[i]
                // For example, if energy[i] = 4 and initialEnergy = 3, then we need
                // 2 more energy units i.e. (4 - 3 + 1) units more are needed in initialEnergy
                // so we add this amount in the answer
                ans += (energy[i] - initialEnergy + 1);
                // add this to initial energy because that much amount more is needed
                initialEnergy += (energy[i] - initialEnergy + 1);
                // now we consumed energy[i] so decrement it from initial energy
                initialEnergy -= energy[i];
            }
            
            if(initialExperience > experience[i]){
                // If initial experience is more then we simply add it to experience[i]
                initialExperience += experience[i];
            }
            else {
                // (initialExperience <= experience[i])
                // In case we had less than or equal experience, then how much more initial
                // experience do we need?
                // We will need (experience[i] - initialExperience) + 1.
                // Same example as given in above comments (this time for experience)
                ans += (experience[i] - initialExperience) + 1;
                // add this to initial experience because that much amount more is needed
                initialExperience += (experience[i] - initialExperience) + 1;
                // now our experience will increase because 
                // condition of -> initialExperience > experience[i] is now satisfied
                initialExperience += experience[i];
            }
        }
        
        // return minimum number of hours
        return ans;
    }
}