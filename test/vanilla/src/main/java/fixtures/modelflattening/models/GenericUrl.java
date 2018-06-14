/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.modelflattening.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Generic URL.
 */
public class GenericUrl {
    /**
     * Generic URL value.
     */
    @JsonProperty(value = "generic_value")
    private String genericValue;

    /**
     * Get generic URL value.
     *
     * @return the genericValue value
     */
    public String genericValue() {
        return this.genericValue;
    }

    /**
     * Set generic URL value.
     *
     * @param genericValue the genericValue value to set
     * @return the GenericUrl object itself.
     */
    public GenericUrl withGenericValue(String genericValue) {
        this.genericValue = genericValue;
        return this;
    }

}
