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

import java.util.Objects;

/**
 * Filed of the schema.
 *
 * @version OMS 2.0.0
 * @since OMS 2.0.0
 */
public class Field {

    /**
     * Index of a field. The index of fields in a schema should be unique and continuous。
     */
    private int index;

    /**
     * The name of a file. Should be unique in a schema.
     */
    private String name;

    /**
     * The type of the filed.
     */
    private FieldType fieldType;

    public Field(int index, String name, FieldType fieldType) {
        this.index = index;
        this.name = name;
        this.fieldType = fieldType;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    @Override public String toString() {
        return "Field{" +
            "index=" + index +
            ", name='" + name + '\'' +
            ", fieldType=" + fieldType +
            '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Field))
            return false;
        Field field = (Field) o;
        return index == field.index &&
            Objects.equals(name, field.name) &&
            fieldType == field.fieldType;
    }

    @Override public int hashCode() {
        return Objects.hash(index, name, fieldType);
    }
}
