/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
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

package im.turms.server.common.property.env.common.cluster;

import com.fasterxml.jackson.annotation.JsonView;
import im.turms.server.common.property.env.common.cluster.connection.ConnectionProperties;
import im.turms.server.common.property.metadata.view.MutablePropertiesView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class ClusterProperties {

    private String id = "turms";

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private NodeProperties node = new NodeProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private ConnectionProperties connection = new ConnectionProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private DiscoveryProperties discovery = new DiscoveryProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private SharedConfigProperties sharedConfig = new SharedConfigProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private RpcProperties rpc = new RpcProperties();

}