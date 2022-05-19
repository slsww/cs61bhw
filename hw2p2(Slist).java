public class SList {
    int[] list;

    public void squish() {
        int count = 0;
        int index = 0;
        for (int i = 0; i < this.list.length - 1; i++) {
            if ((this.list[i + 1] != this.list[i]) || (i == this.list.length - 2)) {
                count++;
            }
        }
        int[] squished = new int[count];
        for (int i = 0; i < this.list.length - 1; i++) {
            if ((this.list[i + 1] != this.list[i]) || (i == this.list.length - 2)) {
                squished[index] = this.list[i];
                index++;
            }
        }
        for(int j = 0;j!=squished.length;j++){
            System.out.print(squished[j]);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,3,3,4,4,4,9,9};
        SList l = new SList();
        l.list = arr;
        l.squish();
    }
}
