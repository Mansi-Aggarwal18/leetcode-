class Solution {
    public int[][] imageSmoother(int[][] img) {
        int  m=img.length;
        int n=img[0].length;
        int[][] temp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=0;
                int count=0;
                for(int ni=Math.max(0,i-1);ni<=Math.min(m-1,i+1);ni++){
                    for(int nj=Math.max(0,j-1);nj<=Math.min(n-1,j+1);nj++){
                        sum+=img[ni][nj];
                     count++;
                    }
                }
                temp[i][j]=sum/count;
            }
        }
            return temp;
            }
        }
        