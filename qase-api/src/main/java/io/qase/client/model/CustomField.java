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
 * CustomField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class CustomField {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_TITLE = "title";
    public static final String SERIALIZED_NAME_ENTITY = "entity";
    public static final String SERIALIZED_NAME_TYPE = "type";
    public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
    public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
    public static final String SERIALIZED_NAME_VALUE = "value";
    public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
    public static final String SERIALIZED_NAME_IS_VISIBLE = "is_visible";
    public static final String SERIALIZED_NAME_IS_FILTERABLE = "is_filterable";
    public static final String SERIALIZED_NAME_CREATED = "created";
    public static final String SERIALIZED_NAME_UPDATED = "updated";
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    public static final String SERIALIZED_NAME_PROJECTS_CODES = "projects_codes";
    @SerializedName(SERIALIZED_NAME_ID)
    private Long id;
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;
    @SerializedName(SERIALIZED_NAME_ENTITY)
    private String entity;
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;
    @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
    private String placeholder;
    @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
    private String defaultValue;
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;
    @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
    private Boolean isRequired;
    @SerializedName(SERIALIZED_NAME_IS_VISIBLE)
    private Boolean isVisible;
    @SerializedName(SERIALIZED_NAME_IS_FILTERABLE)
    private Boolean isFilterable;
    @SerializedName(SERIALIZED_NAME_CREATED)
    private String created;
    @SerializedName(SERIALIZED_NAME_UPDATED)
    private String updated;
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;
    @SerializedName(SERIALIZED_NAME_PROJECTS_CODES)
    private List<String> projectsCodes = null;

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
    }

    public CustomField id(Long id) {

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

    public CustomField title(String title) {

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

    public CustomField entity(String entity) {

        this.entity = entity;
        return this;
    }

    /**
     * Get entity
     *
     * @return entity
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public CustomField type(String type) {

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomField placeholder(String placeholder) {

        this.placeholder = placeholder;
        return this;
    }

    /**
     * Get placeholder
     *
     * @return placeholder
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public CustomField defaultValue(String defaultValue) {

        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get defaultValue
     *
     * @return defaultValue
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public CustomField value(String value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CustomField isRequired(Boolean isRequired) {

        this.isRequired = isRequired;
        return this;
    }

    /**
     * Get isRequired
     *
     * @return isRequired
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public CustomField isVisible(Boolean isVisible) {

        this.isVisible = isVisible;
        return this;
    }

    /**
     * Get isVisible
     *
     * @return isVisible
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    public CustomField isFilterable(Boolean isFilterable) {

        this.isFilterable = isFilterable;
        return this;
    }

    /**
     * Get isFilterable
     *
     * @return isFilterable
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getIsFilterable() {
        return isFilterable;
    }

    public void setIsFilterable(Boolean isFilterable) {
        this.isFilterable = isFilterable;
    }

    public CustomField created(String created) {

        this.created = created;
        return this;
    }

    /**
     * Deprecated, use the &#x60;created_at&#x60; property instead.
     *
     * @return created
     * @deprecated
     **/
    @Deprecated
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2021-12-30 19:23:59", value = "Deprecated, use the `created_at` property instead.")

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CustomField updated(String updated) {

        this.updated = updated;
        return this;
    }

    /**
     * Deprecated, use the &#x60;updated_at&#x60; property instead.
     *
     * @return updated
     * @deprecated
     **/
    @Deprecated
    @javax.annotation.Nullable
    @ApiModelProperty(example = "2021-12-30 19:23:59", value = "Deprecated, use the `updated_at` property instead.")

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public CustomField createdAt(String createdAt) {

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

    public CustomField updatedAt(String updatedAt) {

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

    public CustomField projectsCodes(List<String> projectsCodes) {

        this.projectsCodes = projectsCodes;
        return this;
    }

    public CustomField addProjectsCodesItem(String projectsCodesItem) {
        if (this.projectsCodes == null) {
            this.projectsCodes = new ArrayList<>();
        }
        this.projectsCodes.add(projectsCodesItem);
        return this;
    }

    /**
     * Get projectsCodes
     *
     * @return projectsCodes
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<String> getProjectsCodes() {
        return projectsCodes;
    }

    public void setProjectsCodes(List<String> projectsCodes) {
        this.projectsCodes = projectsCodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomField customField = (CustomField) o;
        return Objects.equals(this.id, customField.id) &&
                Objects.equals(this.title, customField.title) &&
                Objects.equals(this.entity, customField.entity) &&
                Objects.equals(this.type, customField.type) &&
                Objects.equals(this.placeholder, customField.placeholder) &&
                Objects.equals(this.defaultValue, customField.defaultValue) &&
                Objects.equals(this.value, customField.value) &&
                Objects.equals(this.isRequired, customField.isRequired) &&
                Objects.equals(this.isVisible, customField.isVisible) &&
                Objects.equals(this.isFilterable, customField.isFilterable) &&
                Objects.equals(this.created, customField.created) &&
                Objects.equals(this.updated, customField.updated) &&
                Objects.equals(this.createdAt, customField.createdAt) &&
                Objects.equals(this.updatedAt, customField.updatedAt) &&
                Objects.equals(this.projectsCodes, customField.projectsCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, entity, type, placeholder, defaultValue, value, isRequired, isVisible, isFilterable, created, updated, createdAt, updatedAt, projectsCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomField {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
        sb.append("    isFilterable: ").append(toIndentedString(isFilterable)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectsCodes: ").append(toIndentedString(projectsCodes)).append("\n");
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

