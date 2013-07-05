/*
 * Copyright 2013 Stormpath, Inc.
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
package com.stormpath.sdk.impl.account;

import com.stormpath.sdk.account.AccountOptions;
import com.stormpath.sdk.account.Accounts;
import com.stormpath.sdk.impl.query.DefaultOptions;

/**
 * @since 0.8
 */
public class DefaultAccountOptions extends DefaultOptions<AccountOptions> implements AccountOptions<AccountOptions> {

    @Override
    public AccountOptions expandDirectory() {
        return expand(Accounts.DIRECTORY);
    }

    @Override
    public AccountOptions expandTenant() {
        return expand(Accounts.TENANT);
    }

    @Override
    public AccountOptions expandGroups() {
        return expand(Accounts.GROUPS);
    }

    @Override
    public AccountOptions expandGroups(int limit) {
        return expand(Accounts.GROUPS, limit);
    }

    @Override
    public AccountOptions expandGroups(int limit, int offset) {
        return expand(Accounts.GROUPS, limit, offset);
    }

    @Override
    public AccountOptions expandGroupMemberships() {
        return expand(Accounts.GROUP_MEMBERSHIPS);
    }

    @Override
    public AccountOptions expandGroupMemberships(int limit) {
        return expand(Accounts.GROUP_MEMBERSHIPS, limit);
    }

    @Override
    public AccountOptions expandGroupMemberships(int limit, int offset) {
        return expand(Accounts.GROUP_MEMBERSHIPS, limit, offset);
    }
}
