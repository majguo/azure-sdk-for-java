/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.digitaltwins.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A more specific error description than was provided by the containing error.
 */
public class InnerError {
    /**
     * A more specific error code than was provided by the containing error.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * An object containing more specific information than the current object
     * about the error.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Get a more specific error code than was provided by the containing error.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set a more specific error code than was provided by the containing error.
     *
     * @param code the code value to set
     * @return the InnerError object itself.
     */
    public InnerError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get an object containing more specific information than the current object about the error.
     *
     * @return the innererror value
     */
    public InnerError innererror() {
        return this.innererror;
    }

    /**
     * Set an object containing more specific information than the current object about the error.
     *
     * @param innererror the innererror value to set
     * @return the InnerError object itself.
     */
    public InnerError withInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }

}
