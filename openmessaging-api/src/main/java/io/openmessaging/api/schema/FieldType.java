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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging.api.schema;

/**
 * Define the field type.
 *
 * @version OMS 2.0.0
 * @since OMS 2.0.0
 */
public enum FieldType {

    /**  16-bit signed integer */
    INT16,

    /**  32-bit signed integer */
    INT32,

    /** 64-bit signed integer */
    INT64,

    /**  32-bit IEEE 754 floating point number */
    FLOAT32,

    /** 64-bit IEEE 754 floating point number */
    FLOAT64,

    /** Boolean */
    BOOLEAN,

    /** String */
    STRING,

    /** Byte */
    BYTES,

    /** List */
    ARRAY,

    /** Map */
    MAP,

    /** Date */
    DATETIME,

    /** Struct */
    STRUCT;
}
