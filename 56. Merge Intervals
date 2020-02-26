class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return new int[0][0];
        }
        //sort each sub array by each curstart
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] < b[0]){
                    return -1;
                }else if(a[0] > b[0]){
                    return 1;
                }else{
                    return Integer.compare(a[1], b[1]);
                }
            }
        });
        List<int[]> result = new ArrayList<>();
        //set initial bound for each sub array
        int curstart = intervals[0][0];
        int curend = intervals[0][1];
        //compare each sub array start with curend
        for(int i =1; i < intervals.length; i++){
            if(intervals[i][0] > curend){
                result.add(new int[]{curstart,curend});
                curstart = intervals[i][0];
                curend = intervals[i][1];
            }else{
                //update bound
                curend = Math.max(curend, intervals[i][1]);
            }
        }
        //add the last sub array
        result.add(new int[]{curstart, curend});
        return result.toArray(new int[result.size()][2]);
    }
}