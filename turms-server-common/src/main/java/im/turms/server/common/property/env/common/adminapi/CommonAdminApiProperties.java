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

package im.turms.server.common.property.env.common.adminapi;

import com.fasterxml.jackson.annotation.JsonView;
import im.turms.server.common.property.env.common.AddressProperties;
import im.turms.server.common.property.metadata.annotation.Description;
import im.turms.server.common.property.metadata.annotation.GlobalProperty;
import im.turms.server.common.property.metadata.view.MutablePropertiesView;
import lombok.Data;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @author James Chen
 */
@Data
public abstract class CommonAdminApiProperties {

    @Description("Whether to enable the APIs for administrators")
    @GlobalProperty
    private boolean enabled = true;

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private AddressProperties address = new AddressProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private AdminApiRateLimitingProperties rateLimiting = new AdminApiRateLimitingProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private LogProperties log = new LogProperties();

}
