package com.liumapp.digitalsign.engine.cert.util.alias;

import org.springframework.stereotype.Component;

import java.math.BigInteger;

/**
 * @author liumapp
 * @file AliasGenerator.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/27/18
 * The alias of the certificate is saved on the basis of the serial number of the certificate to 16.
 * the password equals the keystore password .
 */
@Component
public class AliasGenerator {

    /**
     * todo
     * @param serialNumber biginteger
     * @return String
     */
    public String getAlias (BigInteger serialNumber) {
        return "todo";
    }

}