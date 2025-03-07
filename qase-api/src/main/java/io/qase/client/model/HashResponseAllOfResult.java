/*
 * Qase.io API
 * Qase API Specification.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@qase.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.qase.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * HashResponseAllOfResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class HashResponseAllOfResult {
    public static final String SERIALIZED_NAME_HASH = "hash";
    @SerializedName(SERIALIZED_NAME_HASH)
    private String hash;


    public HashResponseAllOfResult hash(String hash) {

        this.hash = hash;
        return this;
    }

    /**
     * Get hash
     *
     * @return hash
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getHash() {
        return hash;
    }


    public void setHash(String hash) {
        this.hash = hash;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HashResponseAllOfResult hashResponseAllOfResult = (HashResponseAllOfResult) o;
        return Objects.equals(this.hash, hashResponseAllOfResult.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HashResponseAllOfResult {\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

