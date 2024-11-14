package zajecia6;

public class zadanie12 {
    public static void main(String[] args) {
        int array[]= {1,30,10,4,6,1};
        int temp;
        for(int i =0;i<array.length-1;i++){
            for(int j = 0; j< array.length-1;j++){
                if (array[j]>array[j+1]){
                   temp = array[j];
                   array[j] = array[j+1];
                   array[j+1]=temp;
                }
            }
        }
//        System.out.println(array.toString());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        };
    }
}
