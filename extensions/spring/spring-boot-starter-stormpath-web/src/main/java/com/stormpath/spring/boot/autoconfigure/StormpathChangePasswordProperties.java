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

/**
 * @since 1.0.RC4
 */
@ConfigurationProperties(prefix = "stormpath.web.change")
public class StormpathChangePasswordProperties {

    private boolean enabled = true;
    private String uri = "/change";
    private String nextUri = "/login?status=changed";

    /**
     * The view name of the change view to be rendered. Note that for filename-based view resolvers, this view name is
     * usually relative to a view resolver prefix and suffix.  For example:
     *
     * <pre>
     * prefix: classpath:/templates/
     * suffix: .html
     * </pre>
     *
     * With a {@code view} value of {@code stormpath/change}, the page template then is expected to be at
     * {@code classpath:/templates/stormpath/change.html}.
     *
     */
    private String view = "stormpath/change";

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getNextUri() {
        return nextUri;
    }

    public void setNextUri(String nextUri) {
        this.nextUri = nextUri;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
