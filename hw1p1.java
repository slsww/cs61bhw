import java.io.*;
import java.net.URL;

/*use bufferedreader object to read data from url objects*/

class open_commercial{
    public static void main(String args[]) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please say something");
        System.out.flush();
        String input = kb.readLine();
        String urlname = "http://www.".concat(input).concat(".com");
        URL url = new URL(urlname);
        BufferedReader webpagereader = new BufferedReader(new InputStreamReader(url.openStream()));
        System.out.println(webpagereader);
        int linecount = 0;
        String[] lines = new String[6];
        while((lines[linecount]=webpagereader.readLine())!=null && linecount<5){
                System.out.println(lines[linecount]);
                linecount++;
        }for(int i=4;i>0;i--){
            System.out.println(lines[i]);
        }
    }
}
