import java.util.*;
public class StringCompress
{
    void  compressString(String S1)
    {
        StringCompression str=new StringCompression();
        String S2=S1.trim();
        System.out.println(str.Compression(S2));
    }
    public static void main(String[] args) {
        StringCompress s=new StringCompress();
        s.compressString("aabbnnnnmmmmma");
    }
}