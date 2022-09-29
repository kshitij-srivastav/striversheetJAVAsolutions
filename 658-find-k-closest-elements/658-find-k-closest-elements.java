class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
      List<Integer> list = new ArrayList<>();
        int front = 0;
        int back = arr.length - 1;
        while (back - front >= k) {
            if (Math.abs(arr[front] - x) > Math.abs(arr[back] - x)) {
                front++;
            } else {
                back--;
            }
        }
        for (int i = front; i <= back; i++) {
            list.add(arr[i]);
        }
        return list;  
    }
}