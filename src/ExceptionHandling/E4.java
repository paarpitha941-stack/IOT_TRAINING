package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args)throws IOException {
        String i;
//        Scanner sc=new Scanner(System.in);
//        i=sc.nextInt();
//        System.out.println(i);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=br.readLine();
        System.out.println(i);
//

    }
}
