class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> last = new ArrayList<Integer>();
        last.add(1);
        result.add(last);
        for(int i =1; i < numRows; i++){
            List<Integer> newList = new ArrayList<Integer>();
            newList.add(1);
            for(int j =1; j < i; j++){
                newList.add(last.get(j-1) + last.get(j));
            }
            newList.add(1);
            result.add(newList);
            last = newList;
        }
        return result;
    }
}
