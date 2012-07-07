/*
 * Copyright 2012 Stormpath, Inc.
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
package com.stormpath.sdk.impl.authc;

import com.stormpath.sdk.account.Account;
import com.stormpath.sdk.authc.AuthenticationResult;
import com.stormpath.sdk.ds.DataStore;
import com.stormpath.sdk.impl.resource.AbstractResource;

import java.util.Map;

/**
 * @since 0.2
 */
public class DefaultAuthenticationResult extends AbstractResource implements AuthenticationResult {

    private static final String ACCOUNT = "account";

    public DefaultAuthenticationResult(DataStore dataStore) {
        super(dataStore);
    }

    public DefaultAuthenticationResult(DataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Account getAccount() {
        return getResourceProperty(ACCOUNT, Account.class);
    }
}