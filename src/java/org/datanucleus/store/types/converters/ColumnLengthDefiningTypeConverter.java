/**********************************************************************
Copyright (c) 2014 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.store.types.converters;

/**
 * Interface implemented by a TypeConverter if it has default length values for any of its datastore columns.
 * Typically used by a column stored as a String.
 */
public interface ColumnLengthDefiningTypeConverter
{
    /**
     * Accessor for the default column length to use for the datastore column at the specified position.
     * @param columnPosition Position of the column being enquired about (0 = first)
     * @return The column length (-1 if no preference)
     */
    int getDefaultColumnLength(int columnPosition);
}