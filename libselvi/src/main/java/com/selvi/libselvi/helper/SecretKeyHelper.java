package com.selvi.libselvi.helper;

/**
 * Created by selv on 07/05/2019.
 */
public class SecretKeyHelper {

    public static String magicWord() {
        return getMagicWord();
    }

    public static String getBaseUrl() {
        return getBaseUrl1();
    }


    public static String getDefaultApiKey() {
        return getApiKey();
    }

    public static String getDefaultKey() {
        return getEncryptianKey();
    }

    public static String getDefaultCommunityId() {
        return getCommunityId();
    }


    static {
        System.loadLibrary("selvi");
    }

    public native static String getMagicWord();

    public native static String getApiKey();

    public native static String getEncryptianKey();

    public native static String getBaseUrl1();

    public native static String getCommunityId();
}
