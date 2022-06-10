package com.example.code.stringg;

import java.util.*;

public class e937 {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs,(a,b)->{
            int lena = a.length();
            int lenb = b.length();
            char aLast = a.charAt(lena-1);
            char bLast = b.charAt(lenb-1);
            boolean adigit = Character.isDigit(aLast);
            boolean bdigit = Character.isDigit(bLast);
            if(adigit && bdigit){
                return 0;
            }else if(adigit && !bdigit){
                return 1;
            }else if(!adigit && bdigit){
                return -1;
            }else {
                int ai = a.indexOf(' ');
                int bi = b.indexOf(' ');

                String aflag = a.substring(0,ai+1);
                String bflag = b.substring(0,bi+1);
                String acontent = a.substring(ai + 1);
                String bcontent = b.substring(bi + 1);

                if(acontent.equals(bcontent)){
                    return aflag.compareTo(bflag);
                }else {
                    return acontent.compareTo(bcontent);
                }
            }

        });

        return logs;




    }
}
