/*
 * Copyright 2013-2017 the original author or authors.
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

package org.cloudfoundry.client.v2.routes;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.cloudfoundry.Nullable;
import org.cloudfoundry.QueryParameter;
import org.immutables.value.Value;

/**
 * The request payload for the Creating a Route operation
 */
@Value.Immutable
abstract class _CreateRouteRequest {

    /**
     * The domain id
     */
    @JsonProperty("domain_guid")
    abstract String getDomainId();

    /**
     * The generate port
     */
    @Nullable
    @QueryParameter("generate_port")
    abstract Boolean getGeneratePort();

    /**
     * The host
     */
    @JsonProperty("host")
    @Nullable
    abstract String getHost();

    /**
     * The path
     */
    @JsonProperty("path")
    @Nullable
    abstract String getPath();

    /**
     * The port
     */
    @JsonProperty("port")
    @Nullable
    abstract Integer getPort();

    /**
     * The space id
     */
    @JsonProperty("space_guid")
    abstract String getSpaceId();

}
