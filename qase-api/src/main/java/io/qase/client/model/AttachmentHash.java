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

import java.net.URI;
import java.util.Objects;

/**
 * AttachmentHash
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class AttachmentHash {
    public static final String SERIALIZED_NAME_SIZE = "size";
    public static final String SERIALIZED_NAME_MIME = "mime";
    public static final String SERIALIZED_NAME_FILENAME = "filename";
    public static final String SERIALIZED_NAME_URL = "url";
    public static final String SERIALIZED_NAME_HASH = "hash";
    @SerializedName(SERIALIZED_NAME_SIZE)
    private Integer size;
    @SerializedName(SERIALIZED_NAME_MIME)
    private String mime;
    @SerializedName(SERIALIZED_NAME_FILENAME)
    private String filename;
    @SerializedName(SERIALIZED_NAME_URL)
    private URI url;
    @SerializedName(SERIALIZED_NAME_HASH)
    private String hash;


    public AttachmentHash size(Integer size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getSize() {
        return size;
    }


    public void setSize(Integer size) {
        this.size = size;
    }


    public AttachmentHash mime(String mime) {

        this.mime = mime;
        return this;
    }

    /**
     * Get mime
     *
     * @return mime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getMime() {
        return mime;
    }


    public void setMime(String mime) {
        this.mime = mime;
    }


    public AttachmentHash filename(String filename) {

        this.filename = filename;
        return this;
    }

    /**
     * Get filename
     *
     * @return filename
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getFilename() {
        return filename;
    }


    public void setFilename(String filename) {
        this.filename = filename;
    }


    public AttachmentHash url(URI url) {

        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public URI getUrl() {
        return url;
    }


    public void setUrl(URI url) {
        this.url = url;
    }


    public AttachmentHash hash(String hash) {

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
        AttachmentHash attachmentHash = (AttachmentHash) o;
        return Objects.equals(this.size, attachmentHash.size) &&
                Objects.equals(this.mime, attachmentHash.mime) &&
                Objects.equals(this.filename, attachmentHash.filename) &&
                Objects.equals(this.url, attachmentHash.url) &&
                Objects.equals(this.hash, attachmentHash.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, mime, filename, url, hash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentHash {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

