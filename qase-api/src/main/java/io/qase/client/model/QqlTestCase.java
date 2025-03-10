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
 * QqlTestCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class QqlTestCase {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_POSITION = "position";
    public static final String SERIALIZED_NAME_TITLE = "title";
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    public static final String SERIALIZED_NAME_PRECONDITIONS = "preconditions";
    public static final String SERIALIZED_NAME_POSTCONDITIONS = "postconditions";
    public static final String SERIALIZED_NAME_SEVERITY = "severity";
    public static final String SERIALIZED_NAME_PRIORITY = "priority";
    public static final String SERIALIZED_NAME_TYPE = "type";
    public static final String SERIALIZED_NAME_LAYER = "layer";
    public static final String SERIALIZED_NAME_IS_FLAKY = "is_flaky";
    public static final String SERIALIZED_NAME_BEHAVIOR = "behavior";
    public static final String SERIALIZED_NAME_AUTOMATION = "automation";
    public static final String SERIALIZED_NAME_STATUS = "status";
    public static final String SERIALIZED_NAME_MILESTONE_ID = "milestone_id";
    public static final String SERIALIZED_NAME_SUITE_ID = "suite_id";
    public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
    public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
    public static final String SERIALIZED_NAME_STEPS_TYPE = "steps_type";
    public static final String SERIALIZED_NAME_STEPS = "steps";
    public static final String SERIALIZED_NAME_PARAMS = "params";
    public static final String SERIALIZED_NAME_TAGS = "tags";
    public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
    public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_ID)
    private Long id;
    @SerializedName(SERIALIZED_NAME_POSITION)
    private Integer position;
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    @SerializedName(SERIALIZED_NAME_PRECONDITIONS)
    private String preconditions;
    @SerializedName(SERIALIZED_NAME_POSTCONDITIONS)
    private String postconditions;
    @SerializedName(SERIALIZED_NAME_SEVERITY)
    private Integer severity;
    @SerializedName(SERIALIZED_NAME_PRIORITY)
    private Integer priority;
    @SerializedName(SERIALIZED_NAME_TYPE)
    private Integer type;
    @SerializedName(SERIALIZED_NAME_LAYER)
    private Integer layer;
    @SerializedName(SERIALIZED_NAME_IS_FLAKY)
    private Integer isFlaky;
    @SerializedName(SERIALIZED_NAME_BEHAVIOR)
    private Integer behavior;
    @SerializedName(SERIALIZED_NAME_AUTOMATION)
    private Integer automation;
    @SerializedName(SERIALIZED_NAME_STATUS)
    private Integer status;
    @SerializedName(SERIALIZED_NAME_MILESTONE_ID)
    private Long milestoneId;
    @SerializedName(SERIALIZED_NAME_SUITE_ID)
    private Long suiteId;
    @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
    private List<CustomFieldValue> customFields = null;
    @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
    private List<Attachment> attachments = null;
    @SerializedName(SERIALIZED_NAME_STEPS_TYPE)
    private String stepsType;
    @SerializedName(SERIALIZED_NAME_STEPS)
    private List<TestStep> steps = null;
    @SerializedName(SERIALIZED_NAME_PARAMS)
    private Object[] params;
    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<TagValue> tags = null;
    @SerializedName(SERIALIZED_NAME_MEMBER_ID)
    private Long memberId;
    @SerializedName(SERIALIZED_NAME_PROJECT_ID)
    private Long projectId;
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
    }

    public QqlTestCase id(Long id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QqlTestCase position(Integer position) {

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

    public QqlTestCase title(String title) {

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

    public QqlTestCase description(String description) {

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

    public QqlTestCase preconditions(String preconditions) {

        this.preconditions = preconditions;
        return this;
    }

    /**
     * Get preconditions
     *
     * @return preconditions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(String preconditions) {
        this.preconditions = preconditions;
    }

    public QqlTestCase postconditions(String postconditions) {

        this.postconditions = postconditions;
        return this;
    }

    /**
     * Get postconditions
     *
     * @return postconditions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getPostconditions() {
        return postconditions;
    }

    public void setPostconditions(String postconditions) {
        this.postconditions = postconditions;
    }

    public QqlTestCase severity(Integer severity) {

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

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public QqlTestCase priority(Integer priority) {

        this.priority = priority;
        return this;
    }

    /**
     * Get priority
     *
     * @return priority
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public QqlTestCase type(Integer type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public QqlTestCase layer(Integer layer) {

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

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public QqlTestCase isFlaky(Integer isFlaky) {

        this.isFlaky = isFlaky;
        return this;
    }

    /**
     * Get isFlaky
     *
     * @return isFlaky
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getIsFlaky() {
        return isFlaky;
    }

    public void setIsFlaky(Integer isFlaky) {
        this.isFlaky = isFlaky;
    }

    public QqlTestCase behavior(Integer behavior) {

        this.behavior = behavior;
        return this;
    }

    /**
     * Get behavior
     *
     * @return behavior
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getBehavior() {
        return behavior;
    }

    public void setBehavior(Integer behavior) {
        this.behavior = behavior;
    }

    public QqlTestCase automation(Integer automation) {

        this.automation = automation;
        return this;
    }

    /**
     * Get automation
     *
     * @return automation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getAutomation() {
        return automation;
    }

    public void setAutomation(Integer automation) {
        this.automation = automation;
    }

    public QqlTestCase status(Integer status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public QqlTestCase milestoneId(Long milestoneId) {

        this.milestoneId = milestoneId;
        return this;
    }

    /**
     * Get milestoneId
     *
     * @return milestoneId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Long milestoneId) {
        this.milestoneId = milestoneId;
    }

    public QqlTestCase suiteId(Long suiteId) {

        this.suiteId = suiteId;
        return this;
    }

    /**
     * Get suiteId
     *
     * @return suiteId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(Long suiteId) {
        this.suiteId = suiteId;
    }

    public QqlTestCase customFields(List<CustomFieldValue> customFields) {

        this.customFields = customFields;
        return this;
    }

    public QqlTestCase addCustomFieldsItem(CustomFieldValue customFieldsItem) {
        if (this.customFields == null) {
            this.customFields = new ArrayList<>();
        }
        this.customFields.add(customFieldsItem);
        return this;
    }

    /**
     * Get customFields
     *
     * @return customFields
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<CustomFieldValue> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<CustomFieldValue> customFields) {
        this.customFields = customFields;
    }

    public QqlTestCase attachments(List<Attachment> attachments) {

        this.attachments = attachments;
        return this;
    }

    public QqlTestCase addAttachmentsItem(Attachment attachmentsItem) {
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

    public QqlTestCase stepsType(String stepsType) {

        this.stepsType = stepsType;
        return this;
    }

    /**
     * Get stepsType
     *
     * @return stepsType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getStepsType() {
        return stepsType;
    }

    public void setStepsType(String stepsType) {
        this.stepsType = stepsType;
    }

    public QqlTestCase steps(List<TestStep> steps) {

        this.steps = steps;
        return this;
    }

    public QqlTestCase addStepsItem(TestStep stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * Get steps
     *
     * @return steps
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<TestStep> getSteps() {
        return steps;
    }

    public void setSteps(List<TestStep> steps) {
        this.steps = steps;
    }

    public QqlTestCase params(Object[] params) {

        this.params = params;
        return this;
    }

    /**
     * Get params
     *
     * @return params
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public QqlTestCase tags(List<TagValue> tags) {

        this.tags = tags;
        return this;
    }

    public QqlTestCase addTagsItem(TagValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<TagValue> getTags() {
        return tags;
    }

    public void setTags(List<TagValue> tags) {
        this.tags = tags;
    }

    public QqlTestCase memberId(Long memberId) {

        this.memberId = memberId;
        return this;
    }

    /**
     * Get memberId
     *
     * @return memberId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public QqlTestCase projectId(Long projectId) {

        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     *
     * @return projectId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public QqlTestCase createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2021-12-30T19:23:59Z", value = "")

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public QqlTestCase updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2021-12-30T19:23:59Z", value = "")

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QqlTestCase qqlTestCase = (QqlTestCase) o;
        return Objects.equals(this.id, qqlTestCase.id) &&
                Objects.equals(this.position, qqlTestCase.position) &&
                Objects.equals(this.title, qqlTestCase.title) &&
                Objects.equals(this.description, qqlTestCase.description) &&
                Objects.equals(this.preconditions, qqlTestCase.preconditions) &&
                Objects.equals(this.postconditions, qqlTestCase.postconditions) &&
                Objects.equals(this.severity, qqlTestCase.severity) &&
                Objects.equals(this.priority, qqlTestCase.priority) &&
                Objects.equals(this.type, qqlTestCase.type) &&
                Objects.equals(this.layer, qqlTestCase.layer) &&
                Objects.equals(this.isFlaky, qqlTestCase.isFlaky) &&
                Objects.equals(this.behavior, qqlTestCase.behavior) &&
                Objects.equals(this.automation, qqlTestCase.automation) &&
                Objects.equals(this.status, qqlTestCase.status) &&
                Objects.equals(this.milestoneId, qqlTestCase.milestoneId) &&
                Objects.equals(this.suiteId, qqlTestCase.suiteId) &&
                Objects.equals(this.customFields, qqlTestCase.customFields) &&
                Objects.equals(this.attachments, qqlTestCase.attachments) &&
                Objects.equals(this.stepsType, qqlTestCase.stepsType) &&
                Objects.equals(this.steps, qqlTestCase.steps) &&
                Objects.equals(this.params, qqlTestCase.params) &&
                Objects.equals(this.tags, qqlTestCase.tags) &&
                Objects.equals(this.memberId, qqlTestCase.memberId) &&
                Objects.equals(this.projectId, qqlTestCase.projectId) &&
                Objects.equals(this.createdAt, qqlTestCase.createdAt) &&
                Objects.equals(this.updatedAt, qqlTestCase.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position, title, description, preconditions, postconditions, severity, priority, type, layer, isFlaky, behavior, automation, status, milestoneId, suiteId, customFields, attachments, stepsType, steps, params, tags, memberId, projectId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QqlTestCase {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
        sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
        sb.append("    isFlaky: ").append(toIndentedString(isFlaky)).append("\n");
        sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
        sb.append("    automation: ").append(toIndentedString(automation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
        sb.append("    suiteId: ").append(toIndentedString(suiteId)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    stepsType: ").append(toIndentedString(stepsType)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

