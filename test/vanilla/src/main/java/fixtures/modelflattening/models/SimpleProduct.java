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
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The product documentation.
 */
@JsonFlatten
public class SimpleProduct extends BaseProduct {
    /**
     * Display name of product.
     */
    @JsonProperty(value = "details.max_product_display_name", required = true)
    private String maxProductDisplayName;

    /**
     * Capacity of product. For example, 4 people.
     */
    @JsonProperty(value = "details.max_product_capacity", required = true)
    private String capacity;

    /**
     * Generic URL value.
     */
    @JsonProperty(value = "details.max_product_image.generic_value")
    private String genericValue;

    /**
     * URL value.
     */
    @JsonProperty(value = "details.max_product_image.@odata\\.value")
    private String odatavalue;

    /**
     * Creates an instance of SimpleProduct class.
     * @param maxProductDisplayName display name of product.
     */
    public SimpleProduct() {
        capacity = "Large";
    }

    /**
     * Get display name of product.
     *
     * @return the maxProductDisplayName value
     */
    public String maxProductDisplayName() {
        return this.maxProductDisplayName;
    }

    /**
     * Set display name of product.
     *
     * @param maxProductDisplayName the maxProductDisplayName value to set
     * @return the SimpleProduct object itself.
     */
    public SimpleProduct withMaxProductDisplayName(String maxProductDisplayName) {
        this.maxProductDisplayName = maxProductDisplayName;
        return this;
    }

    /**
     * Get capacity of product. For example, 4 people.
     *
     * @return the capacity value
     */
    public String capacity() {
        return this.capacity;
    }

    /**
     * Set capacity of product. For example, 4 people.
     *
     * @param capacity the capacity value to set
     * @return the SimpleProduct object itself.
     */
    public SimpleProduct withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

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
     * @return the SimpleProduct object itself.
     */
    public SimpleProduct withGenericValue(String genericValue) {
        this.genericValue = genericValue;
        return this;
    }

    /**
     * Get uRL value.
     *
     * @return the odatavalue value
     */
    public String odatavalue() {
        return this.odatavalue;
    }

    /**
     * Set uRL value.
     *
     * @param odatavalue the odatavalue value to set
     * @return the SimpleProduct object itself.
     */
    public SimpleProduct withOdatavalue(String odatavalue) {
        this.odatavalue = odatavalue;
        return this;
    }

}
