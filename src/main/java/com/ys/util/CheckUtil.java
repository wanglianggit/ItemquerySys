package com.ys.util;

import java.util.Arrays;

public class CheckUtil {
    private static final String token = "123qwer";
    public static boolean checkSignture(String signture, String timestamp, String nonce) {
        String[] arr = new String[]{token,timestamp,nonce};
        //排序
        Arrays.sort(arr);

        //生成字符串
        StringBuffer content = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }

        //sha1加密
        String temp = SHA1.encode(content.toString());

        return temp.equals(signture);
    }
}
