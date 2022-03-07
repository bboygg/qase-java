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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Arrays;
import java.util.Objects;

/**
 * Could be used instead of &#x60;case_id&#x60;.
 */
@ApiModel(description = "Could be used instead of `case_id`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class ResultCreateCase {
    public static final String SERIALIZED_NAME_TITLE = "title";
    public static final String SERIALIZED_NAME_SUITE_TITLE = "suite_title";
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    public static final String SERIALIZED_NAME_LAYER = "layer";
    public static final String SERIALIZED_NAME_SEVERITY = "severity";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;
    @SerializedName(SERIALIZED_NAME_SUITE_TITLE)
    private String suiteTitle;
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    @SerializedName(SERIALIZED_NAME_LAYER)
    private String layer;
    @SerializedName(SERIALIZED_NAME_SEVERITY)
    private String severity;

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
    }

    public ResultCreateCase title(String title) {

        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ResultCreateCase suiteTitle(String suiteTitle) {

        this.suiteTitle = suiteTitle;
        return this;
    }

    /**
     * Nested suites should be separated with &#x60;TAB&#x60; symbol.
     *
     * @return suiteTitle
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Nested suites should be separated with `TAB` symbol.")

    public String getSuiteTitle() {
        return suiteTitle;
    }

    public void setSuiteTitle(String suiteTitle) {
        this.suiteTitle = suiteTitle;
    }

    public ResultCreateCase description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ResultCreateCase layer(String layer) {

        this.layer = layer;
        return this;
    }

    /**
     * Get layer
     *
     * @return layer
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public ResultCreateCase severity(String severity) {

        this.severity = severity;
        return this;
    }

    /**
     * Get severity
     *
     * @return severity
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResultCreateCase resultCreateCase = (ResultCreateCase) o;
        return Objects.equals(this.title, resultCreateCase.title) &&
                Objects.equals(this.suiteTitle, resultCreateCase.suiteTitle) &&
                Objects.equals(this.description, resultCreateCase.description) &&
                Objects.equals(this.layer, resultCreateCase.layer) &&
                Objects.equals(this.severity, resultCreateCase.severity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, suiteTitle, description, layer, severity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultCreateCase {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    suiteTitle: ").append(toIndentedString(suiteTitle)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

