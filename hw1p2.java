import java.io.*;
/*receive userinput, omit the index 1 char then print*/
public class Nuke2 {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String word = kb.readLine();
        char[] c_array = word.toCharArray();
        int condition = 0;
        for(char c:c_array) {
            if (c==c_array[1]&&condition<1){
                condition++;
                continue;
            }
            System.out.print(c);
        }
    }
}
