
package bs2d;

public class BS2D {


    public static void main(String[] args) {
     int [][] a = {
         {10,20,30,40},
         {11,25,35,45}
     };
     int target = 36;
     System.out.println(Search(a,target));
    }
   static int Search(int[][] a,int target){
       int row=0;int column=a[0].length-1;
       for(int i=0;i<a.length;i++){
           for(int j=column;j>=0;j--){
               if(a[i][j] == target){
                   return a[i][j];
               }
               if(a[i][j] > target){
                   column = column -1;
               }else{
                   break;
               }
           }
       }
       return -1;
   }
}
