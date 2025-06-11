class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<String, Long> ratioCount = new HashMap<>();
        long totalPairs = 0;
        for (int[] rect : rectangles) {
            int width = rect[0];
            int height = rect[1];
            int gcd = gcd(width, height);
            int reducedWidth = width / gcd;
            int reducedHeight = height / gcd;
             String key = reducedWidth + ":" + reducedHeight;
            long count = ratioCount.getOrDefault(key, 0L);
            totalPairs += count;
            ratioCount.put(key, count + 1);
        }
        return totalPairs;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}