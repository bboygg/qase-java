/*
 * Qase.io API
 * # Introduction  You can use our API to access [Qase.io](https://qase.io) API endpoints, which allows to retrieve information about entities stored in database and perform actions with them. The API is organized around [REST](http://en.wikipedia.org/wiki/Representational_State_Transfer).  # API Rate limits  Your application can make up to 200 API requests per minute.  Once the limit is exceeded, clients receive an HTTP 429 with a Retry-After: X header to indicate how long their timeout period is before they will be able to send requests again. The timeout period is set to 60 seconds once the limit is exceeded.  # Authentication  To authorize, use this code:  ```shell # With shell, you can just pass the correct header with each request curl \"https://api.qase.io/v1/api_endpoint\"   -H \"Token: api_token\"   -H \"Content-Type: application/json\" ```  Make sure to replace `api_token` with your API key.  Qase.io uses API tokens to authenticate requests. You can view an manage your API keys in [API tokens pages](https://app.qase.io/user/api/token).  Your API keys has the same access rights as your role in the app, so be sure to keep them secure! Do not share your secret API keys in publicly accessible areas such as GitHub, client-side code, and so forth.  Qase API expects for the API key to be included in all API requests to the server in a header that looks like the following:  `Token: api_token`  You must replace `api_token` with your personal API key.  All API requests must be made over [HTTPS](http://en.wikipedia.org/wiki/HTTP_Secure). Calls made over plain HTTP will fail. API requests without authentication will also fail.  # Access rights  Qase.io is using Role-based Access Control system to restrict some features usage in Web interface and the same rules are applied to API methods. In description for each method you will find a rule name, that is required to perform an action through API. If you don't have enough access rights, you will receive an error with `403` status code.  # Errors  Qase API uses the following error codes:  Code | Meaning ---------- | ------- 400 | Bad Request - Your request is invalid. 401 | Unauthorized - Your API key is wrong. 403 | Forbidden - Your role doesn't have enough permissions to perform this action 404 | Not Found - The resource could not be found. 405 | Method Not Allowed - You tried to access a resource with an invalid method. 406 | Not Acceptable - You requested a format that isn't json. 410 | Gone - The resource requested has been removed from our servers. 429 | Too Many Requests - You're performing too many requests! Slow down! 500 | Internal Server Error - We had a problem with our server. Try again later. 503 | Service Unavailable - We're temporarily offline for maintenance. Please try again later. 
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
 * RunStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-15T23:17:33.666847+03:00[Europe/Moscow]")
public class RunStats {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_UNTESTED = "untested";
  @SerializedName(SERIALIZED_NAME_UNTESTED)
  private Integer untested;

  public static final String SERIALIZED_NAME_PASSED = "passed";
  @SerializedName(SERIALIZED_NAME_PASSED)
  private Integer passed;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;

  public static final String SERIALIZED_NAME_BLOCKED = "blocked";
  @SerializedName(SERIALIZED_NAME_BLOCKED)
  private Integer blocked;

  public static final String SERIALIZED_NAME_SKIPPED = "skipped";
  @SerializedName(SERIALIZED_NAME_SKIPPED)
  private Integer skipped;

  public static final String SERIALIZED_NAME_RETEST = "retest";
  @SerializedName(SERIALIZED_NAME_RETEST)
  private Integer retest;

  public static final String SERIALIZED_NAME_IN_PROGRESS = "in_progress";
  @SerializedName(SERIALIZED_NAME_IN_PROGRESS)
  private Integer inProgress;

  public static final String SERIALIZED_NAME_INVALID = "invalid";
  @SerializedName(SERIALIZED_NAME_INVALID)
  private Integer invalid;


  public RunStats total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public RunStats untested(Integer untested) {
    
    this.untested = untested;
    return this;
  }

   /**
   * Get untested
   * @return untested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUntested() {
    return untested;
  }


  public void setUntested(Integer untested) {
    this.untested = untested;
  }


  public RunStats passed(Integer passed) {
    
    this.passed = passed;
    return this;
  }

   /**
   * Get passed
   * @return passed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPassed() {
    return passed;
  }


  public void setPassed(Integer passed) {
    this.passed = passed;
  }


  public RunStats failed(Integer failed) {
    
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailed() {
    return failed;
  }


  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  public RunStats blocked(Integer blocked) {
    
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBlocked() {
    return blocked;
  }


  public void setBlocked(Integer blocked) {
    this.blocked = blocked;
  }


  public RunStats skipped(Integer skipped) {
    
    this.skipped = skipped;
    return this;
  }

   /**
   * Get skipped
   * @return skipped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSkipped() {
    return skipped;
  }


  public void setSkipped(Integer skipped) {
    this.skipped = skipped;
  }


  public RunStats retest(Integer retest) {
    
    this.retest = retest;
    return this;
  }

   /**
   * Get retest
   * @return retest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRetest() {
    return retest;
  }


  public void setRetest(Integer retest) {
    this.retest = retest;
  }


  public RunStats inProgress(Integer inProgress) {
    
    this.inProgress = inProgress;
    return this;
  }

   /**
   * Get inProgress
   * @return inProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInProgress() {
    return inProgress;
  }


  public void setInProgress(Integer inProgress) {
    this.inProgress = inProgress;
  }


  public RunStats invalid(Integer invalid) {
    
    this.invalid = invalid;
    return this;
  }

   /**
   * Get invalid
   * @return invalid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInvalid() {
    return invalid;
  }


  public void setInvalid(Integer invalid) {
    this.invalid = invalid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStats runStats = (RunStats) o;
    return Objects.equals(this.total, runStats.total) &&
        Objects.equals(this.untested, runStats.untested) &&
        Objects.equals(this.passed, runStats.passed) &&
        Objects.equals(this.failed, runStats.failed) &&
        Objects.equals(this.blocked, runStats.blocked) &&
        Objects.equals(this.skipped, runStats.skipped) &&
        Objects.equals(this.retest, runStats.retest) &&
        Objects.equals(this.inProgress, runStats.inProgress) &&
        Objects.equals(this.invalid, runStats.invalid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, untested, passed, failed, blocked, skipped, retest, inProgress, invalid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStats {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    untested: ").append(toIndentedString(untested)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    retest: ").append(toIndentedString(retest)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
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

