
    class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        int i =0, j =0;
        int p = 0, q =0;
        while (i>=0 && i<n && j>=0 && j<m){
            if (grid[i][j] == '#'){
                return new int[]{p, q};
            }
            else if (grid[i][j] == 'R'){
                p = i;
                q = j;
                j++;
                
            }
            else if (grid[i][j] == 'L'){
                p = i;
                q = j;
                j--;

            }
            else if (grid[i][j] == 'U'){
                p = i;
                q = j;
                i--;

            }
            else if (grid[i][j] == 'D'){
                p = i;
                q = j;
                i++;

            }
            grid[p][q] = '#';
        }
        return new int[]{p, q};
    }
}