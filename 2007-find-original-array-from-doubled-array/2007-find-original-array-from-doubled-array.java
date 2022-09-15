class Solution {
   public int[] findOriginalArray(int[] changed) {
        if (changed.length == 0 || changed.length % 2 == 1) {
            return new int[0];
        }

        // Using TreeMap ensures O(logn) time complexity for the get and put methods.
        // We use a Hash Table to count the frequency of the integers in the "changed" array.
        Map<Integer, Integer> integerCount = new TreeMap<>();
        for (int integer : changed) {
            integerCount.put(integer, integerCount.getOrDefault(integer, 0) + 1);
        }

        // Set up the originalArray (result) and index to keep track of integers matched.
        int[] originalArray = new int[changed.length / 2];
        int index = 0;

        for (int integer : integerCount.keySet()) {
            // Check if the integer * 2 is available to be matched (frequency > 0).
            // If not available to match, then changed does not contain the doubled array.
            if (integerCount.get(integer) > integerCount.getOrDefault(integer * 2, 0)) {
                return new int[0];
            }
            for (int j = 0; j < integerCount.get(integer); j++) {
                originalArray[index++] = integer;
                integerCount.put(integer * 2, integerCount.get(integer * 2) - 1);
            }
        }
        return originalArray;
    }
}