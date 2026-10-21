class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
    int n = mat.length, m = mat[0].length;
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    int[] ans = new int[n*m];
    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){
            ArrayList<Integer> arr = map.getOrDefault(i+j, new ArrayList<Integer>());
            arr.add(mat[i][j]);
            map.put(i+j, arr);
            
        }
    }    
    int idx = 0;
    for(int i=0; i<n+m-1; i++)
        if(i%2!=0){
        for(int j=0; j<map.get(i).size(); j++){
            ans[idx] = map.get(i).get(j);
            idx++;
        }
        }
        else{
            for(int j=map.get(i).size()-1; j>=0; j--){
                ans[idx] = map.get(i).get(j);
                idx++;
        }
        }
    
    return ans;
    
    }
        
    
}