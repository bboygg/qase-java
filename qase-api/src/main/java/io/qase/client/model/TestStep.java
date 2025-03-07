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
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * TestStep
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class TestStep {
    public static final String SERIALIZED_NAME_HASH = "hash";
    public static final String SERIALIZED_NAME_SHARED_STEP_HASH = "shared_step_hash";
    public static final String SERIALIZED_NAME_SHARED_STEP_NESTED_HASH = "shared_step_nested_hash";
    public static final String SERIALIZED_NAME_POSITION = "position";
    public static final String SERIALIZED_NAME_ACTION = "action";
    public static final String SERIALIZED_NAME_EXPECTED_RESULT = "expected_result";
    public static final String SERIALIZED_NAME_DATA = "data";
    public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
    @SerializedName(SERIALIZED_NAME_HASH)
    private String hash;
    @SerializedName(SERIALIZED_NAME_SHARED_STEP_HASH)
    private String sharedStepHash;
    @SerializedName(SERIALIZED_NAME_SHARED_STEP_NESTED_HASH)
    private String sharedStepNestedHash;
    @SerializedName(SERIALIZED_NAME_POSITION)
    private Integer position;
    @SerializedName(SERIALIZED_NAME_ACTION)
    private String action;
    @SerializedName(SERIALIZED_NAME_EXPECTED_RESULT)
    private String expectedResult;
    @SerializedName(SERIALIZED_NAME_DATA)
    private String data;
    @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
    private List<Attachment> attachments = null;

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
    }

    public TestStep hash(String hash) {

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

    public TestStep sharedStepHash(String sharedStepHash) {

        this.sharedStepHash = sharedStepHash;
        return this;
    }

    /**
     * Get sharedStepHash
     *
     * @return sharedStepHash
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getSharedStepHash() {
        return sharedStepHash;
    }

    public void setSharedStepHash(String sharedStepHash) {
        this.sharedStepHash = sharedStepHash;
    }

    public TestStep sharedStepNestedHash(String sharedStepNestedHash) {

        this.sharedStepNestedHash = sharedStepNestedHash;
        return this;
    }

    /**
     * Get sharedStepNestedHash
     *
     * @return sharedStepNestedHash
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getSharedStepNestedHash() {
        return sharedStepNestedHash;
    }

    public void setSharedStepNestedHash(String sharedStepNestedHash) {
        this.sharedStepNestedHash = sharedStepNestedHash;
    }

    public TestStep position(Integer position) {

        this.position = position;
        return this;
    }

    /**
     * Get position
     *
     * @return position
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public TestStep action(String action) {

        this.action = action;
        return this;
    }

    /**
     * Get action
     *
     * @return action
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public TestStep expectedResult(String expectedResult) {

        this.expectedResult = expectedResult;
        return this;
    }

    /**
     * Get expectedResult
     *
     * @return expectedResult
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public TestStep data(String data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TestStep attachments(List<Attachment> attachments) {

        this.attachments = attachments;
        return this;
    }

    public TestStep addAttachmentsItem(Attachment attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    /**
     * Get attachments
     *
     * @return attachments
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestStep testStep = (TestStep) o;
        return Objects.equals(this.hash, testStep.hash) &&
                Objects.equals(this.sharedStepHash, testStep.sharedStepHash) &&
                Objects.equals(this.sharedStepNestedHash, testStep.sharedStepNestedHash) &&
                Objects.equals(this.position, testStep.position) &&
                Objects.equals(this.action, testStep.action) &&
                Objects.equals(this.expectedResult, testStep.expectedResult) &&
                Objects.equals(this.data, testStep.data) &&
                Objects.equals(this.attachments, testStep.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash, sharedStepHash, sharedStepNestedHash, position, action, expectedResult, data, attachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestStep {\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    sharedStepHash: ").append(toIndentedString(sharedStepHash)).append("\n");
        sb.append("    sharedStepNestedHash: ").append(toIndentedString(sharedStepNestedHash)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    expectedResult: ").append(toIndentedString(expectedResult)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

