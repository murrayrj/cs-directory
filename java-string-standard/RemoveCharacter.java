import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveCharacter {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] pair = line.split("\\|", -1);
                char characterToRemove = pair[0].charAt(0);
                String originalString = pair[1];
                removeChar(originalString, characterToRemove);
            }
        }
    }

    private static void removeChar(String s, char c) {
        int stringLength = s.length();
        StringBuffer sb = new StringBuffer();
        sb.setLength(stringLength);
        int index = 0;
        for (int i = 0; i < stringLength; i++) {
            char current = s.charAt(i);
            if (c != current) {
                sb.setCharAt(index++, current);
            }
        }
        System.out.println(sb.toString());
    }
}