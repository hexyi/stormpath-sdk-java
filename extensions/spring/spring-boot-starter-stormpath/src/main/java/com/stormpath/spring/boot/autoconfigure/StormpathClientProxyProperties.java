/*
 * Copyright 2015 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.spring.boot.autoconfigure;

import com.stormpath.sdk.client.Proxy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.StringUtils;

/**
 * @since 1.0.RC4
 */
@ConfigurationProperties(prefix = "stormpath.proxy")
public class StormpathClientProxyProperties {

    private String host;

    private int port = 80;

    private String username;

    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Proxy resolveProxy() {

        String proxyHost = getHost();

        if (!StringUtils.hasText(proxyHost)) {
            return null;
        }

        int proxyPort = getPort();
        String proxyUsername = getUsername();
        String proxyPassword = getPassword();

        Proxy proxy;

        if (StringUtils.hasText(proxyUsername) || StringUtils.hasText(proxyPassword)) {
            proxy = new Proxy(proxyHost, proxyPort, proxyUsername, proxyPassword);
        } else {
            proxy = new Proxy(proxyHost, proxyPort);
        }

        return proxy;
    }
}
