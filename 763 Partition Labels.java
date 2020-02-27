class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        int[] index = new int[26];
        int start =0; 
        int end =0;
        for(int i =0; i <S.length(); i ++){
            index[S.charAt(i) - 'a'] =i;
        }
        for(int i =0; i < S.length(); i++){
            end = Math.max(end, index[S.charAt(i) -'a']);
            if(end == i){
                result.add(end - start +1);
                start = end +1;
            }
        }
        return result;
    }
}
