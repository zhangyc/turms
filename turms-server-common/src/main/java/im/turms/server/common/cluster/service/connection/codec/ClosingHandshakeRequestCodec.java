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

package im.turms.server.common.cluster.service.connection.codec;

import im.turms.server.common.cluster.service.codec.codec.CodecId;
import im.turms.server.common.cluster.service.connection.request.ClosingHandshakeRequest;
import im.turms.server.common.rpc.codec.request.RpcRequestCodec;
import io.netty.buffer.ByteBuf;

/**
 * @author James Chen
 */
public class ClosingHandshakeRequestCodec extends RpcRequestCodec<ClosingHandshakeRequest> {

    @Override
    public CodecId getCodecId() {
        return CodecId.RPC_CLOSING_HANDSHAKE;
    }

    @Override
    public int initialCapacityForRequest(ClosingHandshakeRequest data) {
        return Byte.BYTES;
    }

    @Override
    protected void writeRequestData(ByteBuf output, ClosingHandshakeRequest data) {
        output.writeByte(data.getCloseStatusCode());
    }

    @Override
    public ClosingHandshakeRequest readRequestData(ByteBuf input) {
        return new ClosingHandshakeRequest(input.readByte());
    }

}
