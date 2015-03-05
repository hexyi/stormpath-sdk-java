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

import com.stormpath.sdk.lang.Strings;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Collections;
import java.util.Set;

/**
 * @since 1.0.RC4
 */
@ConfigurationProperties(prefix = "stormpath.web.accessToken.origin.authorizer")
public class StormpathAccessTokenOriginAuthorizerProperties {

    private String originUris;

    public String getOriginUris() {
        return originUris;
    }

    public void setOriginUris(String originUris) {
        this.originUris = originUris;
    }

    public Set<String> getOriginUrisSet() {

        if (Strings.hasText(originUris)) {
            return Strings.commaDelimitedListToSet(originUris);
        }

        return Collections.emptySet();
    }

}
