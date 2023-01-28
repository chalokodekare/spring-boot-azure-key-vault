/**
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.keyvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/key-vault/secrets")
public class KeyVaultController {

    @Value("${dbUserName}")
    private String dbUserName;

    @Value("${dbPassword}")
    private String dbPassword;

    @GetMapping(path = "/username")
    public String loadDbUserName() {
        return dbUserName;
    }

    @GetMapping(path = "/password")
    public String loadDbPassword() {
        return dbPassword;
    }
}
