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
 * Filters4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class Filters4 {
    public static final String SERIALIZED_NAME_STATUS = "status";
    public static final String SERIALIZED_NAME_RUN = "run";
    public static final String SERIALIZED_NAME_CASE_ID = "case_id";
    public static final String SERIALIZED_NAME_MEMBER = "member";
    public static final String SERIALIZED_NAME_API = "api";
    public static final String SERIALIZED_NAME_FROM_END_TIME = "from_end_time";
    public static final String SERIALIZED_NAME_TO_END_TIME = "to_end_time";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private String status;
    @SerializedName(SERIALIZED_NAME_RUN)
    private String run;
    @SerializedName(SERIALIZED_NAME_CASE_ID)
    private String caseId;
    @SerializedName(SERIALIZED_NAME_MEMBER)
    private String member;
    @SerializedName(SERIALIZED_NAME_API)
    private Boolean api;
    @SerializedName(SERIALIZED_NAME_FROM_END_TIME)
    private String fromEndTime;
    @SerializedName(SERIALIZED_NAME_TO_END_TIME)
    private String toEndTime;


    public Filters4 status(String status) {

        this.status = status;
        return this;
    }

    /**
     * A single test run result status. Possible values: in_progress, passed, failed, blocked, skipped, invalid.
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A single test run result status. Possible values: in_progress, passed, failed, blocked, skipped, invalid. ")

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Filters4 run(String run) {

        this.run = run;
        return this;
    }

    /**
     * A list of run IDs separated by comma.
     *
     * @return run
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of run IDs separated by comma.")

    public String getRun() {
        return run;
    }


    public void setRun(String run) {
        this.run = run;
    }


    public Filters4 caseId(String caseId) {

        this.caseId = caseId;
        return this;
    }

    /**
     * A list of case IDs separated by comma.
     *
     * @return caseId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of case IDs separated by comma.")

    public String getCaseId() {
        return caseId;
    }


    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }


    public Filters4 member(String member) {

        this.member = member;
        return this;
    }

    /**
     * A list of member IDs separated by comma.
     *
     * @return member
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of member IDs separated by comma.")

    public String getMember() {
        return member;
    }


    public void setMember(String member) {
        this.member = member;
    }


    public Filters4 api(Boolean api) {

        this.api = api;
        return this;
    }

    /**
     * Get api
     *
     * @return api
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getApi() {
        return api;
    }


    public void setApi(Boolean api) {
        this.api = api;
    }


    public Filters4 fromEndTime(String fromEndTime) {

        this.fromEndTime = fromEndTime;
        return this;
    }

    /**
     * Will return all results created after provided datetime. Allowed format: &#x60;Y-m-d H:i:s&#x60;.
     *
     * @return fromEndTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Will return all results created after provided datetime. Allowed format: `Y-m-d H:i:s`. ")

    public String getFromEndTime() {
        return fromEndTime;
    }


    public void setFromEndTime(String fromEndTime) {
        this.fromEndTime = fromEndTime;
    }


    public Filters4 toEndTime(String toEndTime) {

        this.toEndTime = toEndTime;
        return this;
    }

    /**
     * Will return all results created before provided datetime. Allowed format: &#x60;Y-m-d H:i:s&#x60;.
     *
     * @return toEndTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Will return all results created before provided datetime. Allowed format: `Y-m-d H:i:s`. ")

    public String getToEndTime() {
        return toEndTime;
    }


    public void setToEndTime(String toEndTime) {
        this.toEndTime = toEndTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Filters4 filters4 = (Filters4) o;
        return Objects.equals(this.status, filters4.status) &&
                Objects.equals(this.run, filters4.run) &&
                Objects.equals(this.caseId, filters4.caseId) &&
                Objects.equals(this.member, filters4.member) &&
                Objects.equals(this.api, filters4.api) &&
                Objects.equals(this.fromEndTime, filters4.fromEndTime) &&
                Objects.equals(this.toEndTime, filters4.toEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, run, caseId, member, api, fromEndTime, toEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Filters4 {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    run: ").append(toIndentedString(run)).append("\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
        sb.append("    api: ").append(toIndentedString(api)).append("\n");
        sb.append("    fromEndTime: ").append(toIndentedString(fromEndTime)).append("\n");
        sb.append("    toEndTime: ").append(toIndentedString(toEndTime)).append("\n");
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

