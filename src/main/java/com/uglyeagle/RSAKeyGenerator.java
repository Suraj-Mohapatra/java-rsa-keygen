package com.uglyeagle;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class RSAKeyGenerator {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            KeyPair pair = keyGen.generateKeyPair();

            String publicKey = Base64.getEncoder().encodeToString(pair.getPublic().getEncoded());
            String privateKey = Base64.getEncoder().encodeToString(pair.getPrivate().getEncoded());
            
            System.out.println("----- BEGIN RSA PUBLIC KEY -----");
            System.out.println(publicKey);
            System.out.println("----- END RSA PUBLIC KEY -----");
            System.out.println();
            System.out.println("----- BEGIN RSA PRIVATE KEY -----");
            System.out.println(privateKey);
            System.out.println("----- END RSA PRIVATE KEY -----");
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}