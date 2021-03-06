/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.openmessaging.api;

import io.openmessaging.api.exception.OMSRuntimeException;

/**
 * Exception context when a message send failed.
 *
 * @version OMS 1.2.0
 * @since OMS 1.2.0
 */
public class OnExceptionContext {

    private String messageId;

    private String topic;

    /**
     * Detailed exception stack information.
     */
    private OMSRuntimeException exception;


    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    public OMSRuntimeException getException() {
        return exception;
    }

    public void setException(OMSRuntimeException exception) {
        this.exception = exception;
    }
}
