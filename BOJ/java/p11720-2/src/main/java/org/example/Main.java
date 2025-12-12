package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String n =  br.readLine();
        int r = 0;

        for (char c : n.toCharArray()) {
            r += Integer.parseInt(String.valueOf(c));
        }

        bw.write(String.valueOf(r));
        bw.flush();
    }
}