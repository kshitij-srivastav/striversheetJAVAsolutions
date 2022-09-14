class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start =0;
        int fuel=0;
        int req=0;
        for(int i=0;i<gas.length;i++){
            fuel+=gas[i]-cost[i];
            if(fuel<0)
            {
                start=i+1;
                req+=fuel;
                fuel=0;
            }
        }
        if(fuel+req>=0)return start;
        return -1;
    }
}