package com.codedancing.designpattern.structural.flyweight.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 计算文件内容的Hash工具类
 */
public class HashUtil {

    /**
     * 传入Bytes格式文件内容
     */
    public static String computeHashId(byte[] contentBytes) {
        String cacheKey = "";

        try {
            final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(contentBytes);
            cacheKey = bytesToHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return cacheKey;
    }

    private static String bytesToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();

        for (Byte b : bytes) {
            String hex = Integer.toHexString(0xFF & b);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }

        return sb.toString();
    }

}
