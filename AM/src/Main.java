public class Main{

    public static void main(String[] args) {
        //recursivefunction(10);

        int[] values = {2, 6, 8, -1, 9, 3, 10, 4};
        int arraySize = values.length;

        minimax mm = new minimax();

        int level = mm.calculateLevel(arraySize);
        System.out.println(mm.minimax(0, true, values,0, level));

    }

    public static void recursivefunction(int n){
        if (n > 5){
            recursivefunction(n-1);
        }
        System.out.println(n);
    }
}   