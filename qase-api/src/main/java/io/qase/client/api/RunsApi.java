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

public class RunsApi {
    private ApiClient localVarApiClient;

    public RunsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RunsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for completeRun
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call completeRunCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/run/{code}/{id}/complete"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code))
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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call completeRunValidateBeforeCall(String code, Integer id, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling completeRun(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling completeRun(Async)");
        }


        okhttp3.Call localVarCall = completeRunCall(code, id, _callback);
        return localVarCall;

    }

    /**
     * Complete a specific run.
     * This method allows to complete a specific run.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return Response
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public Response completeRun(String code, Integer id) throws QaseException {
        ApiResponse<Response> localVarResp = completeRunWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Complete a specific run.
     * This method allows to complete a specific run.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return ApiResponse&lt;Response&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<Response> completeRunWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = completeRunValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Complete a specific run. (asynchronously)
     * This method allows to complete a specific run.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call completeRunAsync(String code, Integer id, final ApiCallback<Response> _callback) throws QaseException {

        okhttp3.Call localVarCall = completeRunValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<Response>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for createRun
     *
     * @param code      Code of project, where to search entities. (required)
     * @param runCreate (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createRunCall(String code, RunCreate runCreate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = runCreate;

        // create path and map variables
        String localVarPath = "/run/{code}"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code));

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
    private okhttp3.Call createRunValidateBeforeCall(String code, RunCreate runCreate, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling createRun(Async)");
        }

        // verify the required parameter 'runCreate' is set
        if (runCreate == null) {
            throw new QaseException("Missing the required parameter 'runCreate' when calling createRun(Async)");
        }


        okhttp3.Call localVarCall = createRunCall(code, runCreate, _callback);
        return localVarCall;

    }

    /**
     * Create a new run.
     * This method allows to create a run in selected project.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param runCreate (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse createRun(String code, RunCreate runCreate) throws QaseException {
        ApiResponse<IdResponse> localVarResp = createRunWithHttpInfo(code, runCreate);
        return localVarResp.getData();
    }

    /**
     * Create a new run.
     * This method allows to create a run in selected project.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param runCreate (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<IdResponse> createRunWithHttpInfo(String code, RunCreate runCreate) throws QaseException {
        okhttp3.Call localVarCall = createRunValidateBeforeCall(code, runCreate, null);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new run. (asynchronously)
     * This method allows to create a run in selected project.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param runCreate (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createRunAsync(String code, RunCreate runCreate, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = createRunValidateBeforeCall(code, runCreate, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for deleteRun
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteRunCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/run/{code}/{id}"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code))
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
    private okhttp3.Call deleteRunValidateBeforeCall(String code, Integer id, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling deleteRun(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling deleteRun(Async)");
        }


        okhttp3.Call localVarCall = deleteRunCall(code, id, _callback);
        return localVarCall;

    }

    /**
     * Delete run.
     * This method completely deletes a run from repository.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse deleteRun(String code, Integer id) throws QaseException {
        ApiResponse<IdResponse> localVarResp = deleteRunWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Delete run.
     * This method completely deletes a run from repository.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<IdResponse> deleteRunWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = deleteRunValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete run. (asynchronously)
     * This method completely deletes a run from repository.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A Result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteRunAsync(String code, Integer id, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = deleteRunValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getRun
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param include   Add this param to include a list of test cases into response. Possible value: cases  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A run. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getRunCall(String code, Integer id, String include, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/run/{code}/{id}"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code))
                .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (include != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include", include));
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
    private okhttp3.Call getRunValidateBeforeCall(String code, Integer id, String include, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getRun(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling getRun(Async)");
        }


        okhttp3.Call localVarCall = getRunCall(code, id, include, _callback);
        return localVarCall;

    }

    /**
     * Get a specific run.
     * This method allows to retrieve a specific run.
     *
     * @param code    Code of project, where to search entities. (required)
     * @param id      Identifier. (required)
     * @param include Add this param to include a list of test cases into response. Possible value: cases  (optional)
     * @return RunResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A run. </td><td>  -  </td></tr>
     * </table>
     */
    public RunResponse getRun(String code, Integer id, String include) throws QaseException {
        ApiResponse<RunResponse> localVarResp = getRunWithHttpInfo(code, id, include);
        return localVarResp.getData();
    }

    /**
     * Get a specific run.
     * This method allows to retrieve a specific run.
     *
     * @param code    Code of project, where to search entities. (required)
     * @param id      Identifier. (required)
     * @param include Add this param to include a list of test cases into response. Possible value: cases  (optional)
     * @return ApiResponse&lt;RunResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A run. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<RunResponse> getRunWithHttpInfo(String code, Integer id, String include) throws QaseException {
        okhttp3.Call localVarCall = getRunValidateBeforeCall(code, id, include, null);
        Type localVarReturnType = new TypeToken<RunResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a specific run. (asynchronously)
     * This method allows to retrieve a specific run.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param include   Add this param to include a list of test cases into response. Possible value: cases  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A run. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getRunAsync(String code, Integer id, String include, final ApiCallback<RunResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getRunValidateBeforeCall(code, id, include, _callback);
        Type localVarReturnType = new TypeToken<RunResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getRuns
     *
     * @param code      Code of project, where to search entities. (required)
     * @param filters   (optional)
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param include   Add this param to include a list of test cases into response. Possible value: cases  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all runs. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getRunsCall(String code, Filters5 filters, Integer limit, Integer offset, String include, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/run/{code}"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code));

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

        if (include != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include", include));
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
    private okhttp3.Call getRunsValidateBeforeCall(String code, Filters5 filters, Integer limit, Integer offset, String include, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getRuns(Async)");
        }


        okhttp3.Call localVarCall = getRunsCall(code, filters, limit, offset, include, _callback);
        return localVarCall;

    }

    /**
     * Get all runs.
     * This method allows to retrieve all runs stored in selected project.
     *
     * @param code    Code of project, where to search entities. (required)
     * @param filters (optional)
     * @param limit   A number of entities in result set. (optional, default to 10)
     * @param offset  How many entities should be skipped. (optional, default to 0)
     * @param include Add this param to include a list of test cases into response. Possible value: cases  (optional)
     * @return RunListResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all runs. </td><td>  -  </td></tr>
     * </table>
     */
    public RunListResponse getRuns(String code, Filters5 filters, Integer limit, Integer offset, String include) throws QaseException {
        ApiResponse<RunListResponse> localVarResp = getRunsWithHttpInfo(code, filters, limit, offset, include);
        return localVarResp.getData();
    }

    /**
     * Get all runs.
     * This method allows to retrieve all runs stored in selected project.
     *
     * @param code    Code of project, where to search entities. (required)
     * @param filters (optional)
     * @param limit   A number of entities in result set. (optional, default to 10)
     * @param offset  How many entities should be skipped. (optional, default to 0)
     * @param include Add this param to include a list of test cases into response. Possible value: cases  (optional)
     * @return ApiResponse&lt;RunListResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all runs. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<RunListResponse> getRunsWithHttpInfo(String code, Filters5 filters, Integer limit, Integer offset, String include) throws QaseException {
        okhttp3.Call localVarCall = getRunsValidateBeforeCall(code, filters, limit, offset, include, null);
        Type localVarReturnType = new TypeToken<RunListResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all runs. (asynchronously)
     * This method allows to retrieve all runs stored in selected project.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param filters   (optional)
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param include   Add this param to include a list of test cases into response. Possible value: cases  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all runs. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getRunsAsync(String code, Filters5 filters, Integer limit, Integer offset, String include, final ApiCallback<RunListResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getRunsValidateBeforeCall(code, filters, limit, offset, include, _callback);
        Type localVarReturnType = new TypeToken<RunListResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for updateRunPublicity
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param runPublic (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateRunPublicityCall(String code, Integer id, RunPublic runPublic, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = runPublic;

        // create path and map variables
        String localVarPath = "/run/{code}/{id}/public"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code))
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
    private okhttp3.Call updateRunPublicityValidateBeforeCall(String code, Integer id, RunPublic runPublic, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling updateRunPublicity(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling updateRunPublicity(Async)");
        }

        // verify the required parameter 'runPublic' is set
        if (runPublic == null) {
            throw new QaseException("Missing the required parameter 'runPublic' when calling updateRunPublicity(Async)");
        }


        okhttp3.Call localVarCall = updateRunPublicityCall(code, id, runPublic, _callback);
        return localVarCall;

    }

    /**
     * Update publicity of a specific run.
     * This method allows to update a publicity of specific run.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param runPublic (required)
     * @return RunPublicResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public RunPublicResponse updateRunPublicity(String code, Integer id, RunPublic runPublic) throws QaseException {
        ApiResponse<RunPublicResponse> localVarResp = updateRunPublicityWithHttpInfo(code, id, runPublic);
        return localVarResp.getData();
    }

    /**
     * Update publicity of a specific run.
     * This method allows to update a publicity of specific run.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param runPublic (required)
     * @return ApiResponse&lt;RunPublicResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<RunPublicResponse> updateRunPublicityWithHttpInfo(String code, Integer id, RunPublic runPublic) throws QaseException {
        okhttp3.Call localVarCall = updateRunPublicityValidateBeforeCall(code, id, runPublic, null);
        Type localVarReturnType = new TypeToken<RunPublicResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update publicity of a specific run. (asynchronously)
     * This method allows to update a publicity of specific run.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param runPublic (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateRunPublicityAsync(String code, Integer id, RunPublic runPublic, final ApiCallback<RunPublicResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = updateRunPublicityValidateBeforeCall(code, id, runPublic, _callback);
        Type localVarReturnType = new TypeToken<RunPublicResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
