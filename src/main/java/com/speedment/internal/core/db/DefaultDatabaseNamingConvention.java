/*
 * Copyright 2016 Speedment, Inc..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.speedment.internal.core.db;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author  Emil Forslund
 */
public final class DefaultDatabaseNamingConvention extends AbstractDatabaseNamingConvention {
    
    private final static String 
        DEFAULT_ENCLOSER = "`",
        DEFAULT_QUOTE    = "'";

    @Override
    public Set<String> getSchemaExcludeSet() {
        return Collections.unmodifiableSet(new HashSet<>());
    }

    @Override
    protected String getFieldQuoteStart() {
        return DEFAULT_QUOTE;
    }

    @Override
    protected String getFieldQuoteEnd() {
        return DEFAULT_QUOTE;
    }

    @Override
    protected String getFieldEncloserStart() {
        return DEFAULT_ENCLOSER;
    }

    @Override
    protected String getFieldEncloserEnd() {
        return DEFAULT_ENCLOSER;
    }
}