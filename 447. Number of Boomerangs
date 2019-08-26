class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < points.length; i ++){
            for(int j =0; j < points.length; j++){
                if(i == j ) continue;
                int distance = getDis(points[i], points[j]);
                map.put(distance, map.getOrDefault(distance,0) +1);
            }
            for(int val :map.values()){
                result += val*(val - 1);
            }
            map.clear();
        }
        return result;
    }
    public int getDis(int[] p1, int[] p2){
        int x = p1[0] - p2[0];
        int y = p1[1] - p2[1];
        return x*x + y*y;
    }
}
