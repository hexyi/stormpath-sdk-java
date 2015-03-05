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

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @since 1.0.RC4
 */
@ConfigurationProperties(prefix = "stormpath.web.request.client")
public class StormpathRequestClientProperties {

    private Set<String> attributeNames = new HashSet<String>(Arrays.asList(new String[]{ "client" } ));

    public Set<String> getAttributeNames() {
        return attributeNames;
    }

    public void setAttributeNames(Set<String> attributeNames) {
        this.attributeNames = attributeNames;
    }
}
