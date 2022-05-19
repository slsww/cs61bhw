public class homework3 {
    public static void smoosh(int[] ints) {
        int index = 0;
        for (int i = 0; i < ints.length-1; i++) {
            if ((ints[i + 1] != ints[i])||(i == ints.length-2)) {
                ints[index] = ints[i];
                index++;
            }
        }for(int j = index;j!=ints.length;j++){
            ints[j] = -1;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,1,3,3,9,4,4,9,9};
        smoosh(arr);
    }
}
