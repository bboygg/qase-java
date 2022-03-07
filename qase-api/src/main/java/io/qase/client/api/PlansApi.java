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

public class PlansApi {
    private ApiClient localVarApiClient;

    public PlansApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlansApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createPlan
     *
     * @param code       Code of project, where to search entities. (required)
     * @param planCreate (required)
     * @param _callback  Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createPlanCall(String code, PlanCreate planCreate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = planCreate;

        // create path and map variables
        String localVarPath = "/plan/{code}"
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
    private okhttp3.Call createPlanValidateBeforeCall(String code, PlanCreate planCreate, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling createPlan(Async)");
        }

        // verify the required parameter 'planCreate' is set
        if (planCreate == null) {
            throw new QaseException("Missing the required parameter 'planCreate' when calling createPlan(Async)");
        }


        okhttp3.Call localVarCall = createPlanCall(code, planCreate, _callback);
        return localVarCall;

    }

    /**
     * Create a new plan.
     * This method allows to create a plan in selected project.
     *
     * @param code       Code of project, where to search entities. (required)
     * @param planCreate (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse createPlan(String code, PlanCreate planCreate) throws QaseException {
        ApiResponse<IdResponse> localVarResp = createPlanWithHttpInfo(code, planCreate);
        return localVarResp.getData();
    }

    /**
     * Create a new plan.
     * This method allows to create a plan in selected project.
     *
     * @param code       Code of project, where to search entities. (required)
     * @param planCreate (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<IdResponse> createPlanWithHttpInfo(String code, PlanCreate planCreate) throws QaseException {
        okhttp3.Call localVarCall = createPlanValidateBeforeCall(code, planCreate, null);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new plan. (asynchronously)
     * This method allows to create a plan in selected project.
     *
     * @param code       Code of project, where to search entities. (required)
     * @param planCreate (required)
     * @param _callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createPlanAsync(String code, PlanCreate planCreate, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = createPlanValidateBeforeCall(code, planCreate, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for deletePlan
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
    public okhttp3.Call deletePlanCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/plan/{code}/{id}"
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
    private okhttp3.Call deletePlanValidateBeforeCall(String code, Integer id, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling deletePlan(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling deletePlan(Async)");
        }


        okhttp3.Call localVarCall = deletePlanCall(code, id, _callback);
        return localVarCall;

    }

    /**
     * Delete plan.
     * This method completely deletes a plan from repository.
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
    public IdResponse deletePlan(String code, Integer id) throws QaseException {
        ApiResponse<IdResponse> localVarResp = deletePlanWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Delete plan.
     * This method completely deletes a plan from repository.
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
    public ApiResponse<IdResponse> deletePlanWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = deletePlanValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete plan. (asynchronously)
     * This method completely deletes a plan from repository.
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
    public okhttp3.Call deletePlanAsync(String code, Integer id, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = deletePlanValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getPlan
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A plan. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getPlanCall(String code, Integer id, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/plan/{code}/{id}"
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
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPlanValidateBeforeCall(String code, Integer id, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getPlan(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling getPlan(Async)");
        }


        okhttp3.Call localVarCall = getPlanCall(code, id, _callback);
        return localVarCall;

    }

    /**
     * Get a specific plan.
     * This method allows to retrieve a specific plan.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return PlanResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A plan. </td><td>  -  </td></tr>
     * </table>
     */
    public PlanResponse getPlan(String code, Integer id) throws QaseException {
        ApiResponse<PlanResponse> localVarResp = getPlanWithHttpInfo(code, id);
        return localVarResp.getData();
    }

    /**
     * Get a specific plan.
     * This method allows to retrieve a specific plan.
     *
     * @param code Code of project, where to search entities. (required)
     * @param id   Identifier. (required)
     * @return ApiResponse&lt;PlanResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A plan. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<PlanResponse> getPlanWithHttpInfo(String code, Integer id) throws QaseException {
        okhttp3.Call localVarCall = getPlanValidateBeforeCall(code, id, null);
        Type localVarReturnType = new TypeToken<PlanResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a specific plan. (asynchronously)
     * This method allows to retrieve a specific plan.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param id        Identifier. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A plan. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getPlanAsync(String code, Integer id, final ApiCallback<PlanResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getPlanValidateBeforeCall(code, id, _callback);
        Type localVarReturnType = new TypeToken<PlanResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for getPlans
     *
     * @param code      Code of project, where to search entities. (required)
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all plans. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getPlansCall(String code, Integer limit, Integer offset, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/plan/{code}"
                .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getPlansValidateBeforeCall(String code, Integer limit, Integer offset, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling getPlans(Async)");
        }


        okhttp3.Call localVarCall = getPlansCall(code, limit, offset, _callback);
        return localVarCall;

    }

    /**
     * Get all plans.
     * This method allows to retrieve all plans stored in selected project.
     *
     * @param code   Code of project, where to search entities. (required)
     * @param limit  A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @return PlanListResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all plans. </td><td>  -  </td></tr>
     * </table>
     */
    public PlanListResponse getPlans(String code, Integer limit, Integer offset) throws QaseException {
        ApiResponse<PlanListResponse> localVarResp = getPlansWithHttpInfo(code, limit, offset);
        return localVarResp.getData();
    }

    /**
     * Get all plans.
     * This method allows to retrieve all plans stored in selected project.
     *
     * @param code   Code of project, where to search entities. (required)
     * @param limit  A number of entities in result set. (optional, default to 10)
     * @param offset How many entities should be skipped. (optional, default to 0)
     * @return ApiResponse&lt;PlanListResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all plans. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<PlanListResponse> getPlansWithHttpInfo(String code, Integer limit, Integer offset) throws QaseException {
        okhttp3.Call localVarCall = getPlansValidateBeforeCall(code, limit, offset, null);
        Type localVarReturnType = new TypeToken<PlanListResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all plans. (asynchronously)
     * This method allows to retrieve all plans stored in selected project.
     *
     * @param code      Code of project, where to search entities. (required)
     * @param limit     A number of entities in result set. (optional, default to 10)
     * @param offset    How many entities should be skipped. (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A list of all plans. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getPlansAsync(String code, Integer limit, Integer offset, final ApiCallback<PlanListResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = getPlansValidateBeforeCall(code, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<PlanListResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     * Build call for updatePlan
     *
     * @param code       Code of project, where to search entities. (required)
     * @param id         Identifier. (required)
     * @param planUpdate (required)
     * @param _callback  Callback for upload/download progress
     * @return Call to execute
     * @throws QaseException If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updatePlanCall(String code, Integer id, PlanUpdate planUpdate, final ApiCallback _callback) throws QaseException {
        Object localVarPostBody = planUpdate;

        // create path and map variables
        String localVarPath = "/plan/{code}/{id}"
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
    private okhttp3.Call updatePlanValidateBeforeCall(String code, Integer id, PlanUpdate planUpdate, final ApiCallback _callback) throws QaseException {

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new QaseException("Missing the required parameter 'code' when calling updatePlan(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new QaseException("Missing the required parameter 'id' when calling updatePlan(Async)");
        }

        // verify the required parameter 'planUpdate' is set
        if (planUpdate == null) {
            throw new QaseException("Missing the required parameter 'planUpdate' when calling updatePlan(Async)");
        }


        okhttp3.Call localVarCall = updatePlanCall(code, id, planUpdate, _callback);
        return localVarCall;

    }

    /**
     * Update plan.
     * This method updates a plan.
     *
     * @param code       Code of project, where to search entities. (required)
     * @param id         Identifier. (required)
     * @param planUpdate (required)
     * @return IdResponse
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public IdResponse updatePlan(String code, Integer id, PlanUpdate planUpdate) throws QaseException {
        ApiResponse<IdResponse> localVarResp = updatePlanWithHttpInfo(code, id, planUpdate);
        return localVarResp.getData();
    }

    /**
     * Update plan.
     * This method updates a plan.
     *
     * @param code       Code of project, where to search entities. (required)
     * @param id         Identifier. (required)
     * @param planUpdate (required)
     * @return ApiResponse&lt;IdResponse&gt;
     * @throws QaseException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<IdResponse> updatePlanWithHttpInfo(String code, Integer id, PlanUpdate planUpdate) throws QaseException {
        okhttp3.Call localVarCall = updatePlanValidateBeforeCall(code, id, planUpdate, null);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update plan. (asynchronously)
     * This method updates a plan.
     *
     * @param code       Code of project, where to search entities. (required)
     * @param id         Identifier. (required)
     * @param planUpdate (required)
     * @param _callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws QaseException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> A result. </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updatePlanAsync(String code, Integer id, PlanUpdate planUpdate, final ApiCallback<IdResponse> _callback) throws QaseException {

        okhttp3.Call localVarCall = updatePlanValidateBeforeCall(code, id, planUpdate, _callback);
        Type localVarReturnType = new TypeToken<IdResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
