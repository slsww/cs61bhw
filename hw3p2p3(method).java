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

//==========

public class SList {
    int[] list;
    //{1,2,3,4} => {1,1,2,2,3,3,4,4}
    public void twin(){
        int length = this.list.length*2;
        int count = 0;
        int[] twiced = new int[length];
        for(int i=0;i<length;i+=2){
            twiced[i]=this.list[count];
            twiced[i+1]=this.list[count];
            count++;
            System.out.println(count);
        }
        for (int i=0;i<length;i++){
            System.out.print(twiced[i]+ " ");
        }
    }
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

    }
}

