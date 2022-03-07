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


package io.qase.client.api;

import com.google.gson.reflect.TypeToken;
import io.qase.api.exceptions.QaseException;
import io.qase.client.*;
import io.qase.client.model.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomFieldsApi {
    private ApiClient localVarApiClient;

    public CustomFieldsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomFieldsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createCustomField
     *
     * @param customFieldCreate (required)
     * @param _callback         Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Created Custom Field id. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createCustomFieldCall(CustomFieldCreate customFieldCreate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = customFieldCreate;

        // create path and map variables
        String localVarPath = "/custom_field";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCustomFieldValidateBeforeCall(CustomFieldCreate customFieldCreate, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'customFieldCreate' is set
        if (customFieldCreate == null) {
            throw new QaseException("Missing the required parameter 'customFieldCreate' when calling createCustomField(Async)");
        }


        okhttp3.Call localVarCall = createCustomFieldCall(customFieldCreate, _callback);
        return localVarCall;

    }

    /**
     * Create new Custom Field.
     * This method allows to create custom field.
     *
     * @param customFieldCreate (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Created Custom Field id. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse createCustomField(CustomFieldCreate customFieldCreate) throws QaseException {
        ApiResponse<IdResponse> localVarResp = createCustomFieldWithHttpInfo(customFieldCreate);
        return localVarResp.getData();
    }

    /**
     * Create new Custom Field.
     * This method allows to create custom field.
     *
     * @param customFieldCreate (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Created Custom Field id. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<IdResponse> createCustomFieldWithHttpInfo(CustomFieldCreate customFieldCreate) throws QaseException {
        okhttp3.Call localVarCall = createCustomFieldValidateBeforeCall(customFieldCreate, null);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create new Custom Field. (asynchronously)
     * This method allows to create custom field.
     *
     * @param customFieldCreate (required)
     * @param _callback         The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Created Custom Field id. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createCustomFieldAsync(CustomFieldCreate customFieldCreate, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = createCustomFieldValidateBeforeCall(customFieldCreate, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for deleteCustomField
     *
     * @param id        Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field removal result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteCustomFieldCall(Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/custom_field/{id}"
                .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCustomFieldValidateBeforeCall(Integer id, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling deleteCustomField(Async)");
        }


        okhttp3.Call localVarCall = deleteCustomFieldCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete Custom Field by id.
     * This method allows to delete custom field.
     *
     * @param id Identifier. (required)
     * @return Response
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field removal result. </td><td>  -  </td></tr>
     * </table>
     */
    public Response deleteCustomField(Integer id) throws QaseException {
        ApiResponse<Response> localVarResp = deleteCustomFieldWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Delete Custom Field by id.
     * This method allows to delete custom field.
     *
     * @param id Identifier. (required)
     * @return ApiResponse&lt;Response&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field removal result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Response> deleteCustomFieldWithHttpInfo(Integer id) throws QaseException {
        okhttp3.Call localVarCall = deleteCustomFieldValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete Custom Field by id. (asynchronously)
     * This method allows to delete custom field.
     *
     * @param id        Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field removal result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteCustomFieldAsync(Integer id, final ApiCallback<Response> _callback) throws QaseException {

        okhttp3.Call localVarCall = deleteCustomFieldValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getCustomField
     *
     * @param id        Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Custom Field. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCustomFieldCall(Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/custom_field/{id}"
                .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomFieldValidateBeforeCall(Integer id, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling getCustomField(Async)");
        }


        okhttp3.Call localVarCall = getCustomFieldCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get Custom Field by id.
     * This method allows to retrieve custom field.
     *
     * @param id Identifier. (required)
     * @return CustomFieldResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Custom Field. </td><td>  -  </td></tr>
     * </table>
     */
    public CustomFieldResponse getCustomField(Integer id) throws QaseException {
        ApiResponse<CustomFieldResponse> localVarResp = getCustomFieldWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get Custom Field by id.
     * This method allows to retrieve custom field.
     *
     * @param id Identifier. (required)
     * @return ApiResponse&lt;CustomFieldResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Custom Field. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CustomFieldResponse> getCustomFieldWithHttpInfo(Integer id) throws QaseException {
        okhttp3.Call localVarCall = getCustomFieldValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<CustomFieldResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Custom Field by id. (asynchronously)
     * This method allows to retrieve custom field.
     *
     * @param id        Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Custom Field. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCustomFieldAsync(Integer id, final ApiCallback<CustomFieldResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getCustomFieldValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<CustomFieldResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getCustomFields
     *
     * @param filters   (optional)
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field list. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCustomFieldsCall(Filters1 filters, Integer limit, Integer offset, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/custom_field";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filters != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filters", filters));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomFieldsValidateBeforeCall(Filters1 filters, Integer limit, Integer offset, final ApiCallback _callback) throws QaseException {


        okhttp3.Call localVarCall = getCustomFieldsCall(filters, limit, offset, _callback);
        return localVarCall;

    }

    /**
     * Get all Custom Fields.
     * This method allows to retrieve and filter custom fields.
     *
     * @param filters (optional)
     * @param limit   A number of entities in result set. (optional, default to 10)
     * @param offset  How many entities should be skipped. (optional, default to 0)
     * @return CustomFieldsResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field list. </td><td>  -  </td></tr>
     * </table>
     */
    public CustomFieldsResponse getCustomFields(Filters1 filters, Integer limit, Integer offset) throws QaseException {
        ApiResponse<CustomFieldsResponse> localVarResp = getCustomFieldsWithHttpInfo(filters, limit, offset);
        return localVarResp.getData();
    }

    /**
     * Get all Custom Fields.
     * This method allows to retrieve and filter custom fields.
     *
     * @param filters (optional)
     * @param limit   A number of entities in result set. (optional, default to 10)
     * @param offset  How many entities should be skipped. (optional, default to 0)
     * @return ApiResponse&lt;CustomFieldsResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field list. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CustomFieldsResponse> getCustomFieldsWithHttpInfo(Filters1 filters, Integer limit, Integer offset) throws QaseException {
        okhttp3.Call localVarCall = getCustomFieldsValidateBeforeCall(filters, limit, offset, null);
        Type localVarReturnType = new TypeToken<CustomFieldsResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all Custom Fields. (asynchronously)
     * This method allows to retrieve and filter custom fields.
     *
     * @param filters   (optional)
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field list. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getCustomFieldsAsync(Filters1 filters, Integer limit, Integer offset, final ApiCallback<CustomFieldsResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getCustomFieldsValidateBeforeCall(filters, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<CustomFieldsResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for updateCustomField
     *
     * @param id                Identifier. (required)
     * @param customFieldUpdate (required)
     * @param _callback         Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field update result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateCustomFieldCall(Integer id, CustomFieldUpdate customFieldUpdate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = customFieldUpdate;

        // create path and map variables
        String localVarPath = "/custom_field/{id}"
                .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[]{"TokenAuth"};
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateCustomFieldValidateBeforeCall(Integer id, CustomFieldUpdate customFieldUpdate, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling updateCustomField(Async)");
        }

        // verify the required parameter 'customFieldUpdate' is set
        if (customFieldUpdate == null) {
            throw new QaseException("Missing the required parameter 'customFieldUpdate' when calling updateCustomField(Async)");
        }


        okhttp3.Call localVarCall = updateCustomFieldCall(id, customFieldUpdate, _callback);
        return localVarCall;

    }

    /**
     * Update Custom Field by id.
     * This method allows to update custom field.
     *
     * @param id                Identifier. (required)
     * @param customFieldUpdate (required)
     * @return Response
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field update result. </td><td>  -  </td></tr>
     * </table>
     */
    public Response updateCustomField(Integer id, CustomFieldUpdate customFieldUpdate) throws QaseException {
        ApiResponse<Response> localVarResp = updateCustomFieldWithHttpInfo(id, customFieldUpdate);
        return localVarResp.getData();
    }

    /**
     * Update Custom Field by id.
     * This method allows to update custom field.
     *
     * @param id                Identifier. (required)
     * @param customFieldUpdate (required)
     * @return ApiResponse&lt;Response&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field update result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Response> updateCustomFieldWithHttpInfo(Integer id, CustomFieldUpdate customFieldUpdate) throws QaseException {
        okhttp3.Call localVarCall = updateCustomFieldValidateBeforeCall(id, customFieldUpdate, null);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Custom Field by id. (asynchronously)
     * This method allows to update custom field.
     *
     * @param id                Identifier. (required)
     * @param customFieldUpdate (required)
     * @param _callback         The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Custom Field update result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateCustomFieldAsync(Integer id, CustomFieldUpdate customFieldUpdate, final ApiCallback<Response> _callback) throws QaseException {

        okhttp3.Call localVarCall = updateCustomFieldValidateBeforeCall(id, customFieldUpdate, _callback);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
