/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
    int [] arr = {5, 5, 9, 8, 8, 3, 8, 8};
    
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]);
    }
    int dupeCheck=8;
    for(int i = 0; i < arr.length; i++){
        if (dupecheck == arr[i]){
            System.out.println(i);
        }
    }
    for(int i = 0; i < arr.length; i++){
       if(Math.abs(arr[i] - arr[i+1]) == 3){
       System.out.print(i);

       }
    }
	}
}