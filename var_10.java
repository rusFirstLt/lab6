import java.io.*;

public class var_10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter out = null;
        try{
        br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\MyFile1.txt")));
        out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("E:\\MyFile2.txt")));
        String s;

        while ((s = br.readLine()) != null) {
            for (String word : s.split(" ")) {
                if (word.length() % 2 == 1) {
                    out.print(word + " ");
                }
            }
        }

        } catch (IOException e) {
        System.out.print("Error!");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}