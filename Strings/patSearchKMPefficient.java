//theta (n) time complexity
//works by keeping idea of repeating literals

import java.util.*;
import java.io.*;
import java.lang.*;

class patSearchKMPefficient {

    static void fillLPS(String str, int lps[]) {
        int n = str.length(), len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    i++;
                } else {
                    len = lps[len - 1];
                }
            }
        }
    }

    public static void main(String args[]) {
        String txt = "abacabad";
        int[] lps = new int[txt.length()];
        fillLPS(txt, lps);
        for (int i = 0; i < txt.length(); i++) {
            System.out.print(lps[i] + " ");
        }
    }
}