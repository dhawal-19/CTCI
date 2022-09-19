public class RotateArray {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        RotateArray.solution(array);
    }
    public static void solution(int [][] matrix){
         //Transpose
         for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp; 
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            int l=0,r=matrix[i].length-1;
            while(l<r){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l+=1;
                r-=1;
                
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(String.format("%20s", matrix[i][j]));
            }
            System.out.println("");
        }
    } 
}
