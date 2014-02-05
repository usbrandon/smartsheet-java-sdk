package com.smartsheet.api;

/*
 * #[license]
 * Smartsheet SDK for Java
 * %%
 * Copyright (C) 2014 Smartsheet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * %[license]
 */



import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.smartsheet.api.internal.http.HttpClientException;
import com.smartsheet.api.internal.json.JSONSerializerException;
import com.smartsheet.api.models.Folder;

/**
 * This interface provides methods to access Folder resources.
 * 
 * Currently the following resources are supported, please refer to
 * http://publish.smartsheet.com/6f44714480de47c1a8cb72375864a7de for full listing of the resources, and
 * http://www.smartsheet.com/developers/api-documentation for full API documentation:
 * 
 * GET /folder/{id} PUT /folder/{id} DELETE /folder{id} GET /folder/{id}/folders POST /folder/{id}/folders
 * 
 * Thread Safety: Implementation of this interface must be thread safe.
 */
public interface FolderResources {
	/**
	 * Get a folder.
	 * 
	 * It mirrors to the following Smartsheet REST API method: GET /folder/{id}
	 * 
	 * Parameters: - folderId : the folder ID
	 * 
	 * Returns: the folder (note that if there is no such resource, this method will throw ResourceNotFoundException
	 * rather than returning null).
	 * 
	 * Exceptions: - InvalidRequestException : if there is any problem with the REST API request -
	 * AuthorizationException : if there is any problem with the REST API authorization(access token) -
	 * ResourceNotFoundException : if the resource can not be found - ServiceUnavailableException : if the REST API
	 * service is not available (possibly due to rate limiting) - SmartsheetRestException : if there is any other REST
	 * API related error occurred during the operation - SmartsheetException : if there is any other error occurred
	 * during the operation
	 * 
	 * @param folderId
	 * @return
	 * @throws SmartsheetException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IOException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws SmartsheetRestException 
	 * @throws HttpClientException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public Folder getFolder(long folderId) throws SmartsheetException;

	/**
	 * Update a folder.
	 * 
	 * It mirrors to the following Smartsheet REST API method: PUT /folder/{id}
	 * 
	 * Parameters: - folder : the folder to update
	 * 
	 * Returns: the updated folder (note that if there is no such folder, this method will throw
	 * ResourceNotFoundException rather than returning null).
	 * 
	 * Exceptions: - IllegalArgumentException : if folder is null - InvalidRequestException : if there is any problem
	 * with the REST API request - AuthorizationException : if there is any problem with the REST API
	 * authorization(access token) - ResourceNotFoundException : if the resource can not be found -
	 * ServiceUnavailableException : if the REST API service is not available (possibly due to rate limiting) -
	 * SmartsheetRestException : if there is any other REST API related error occurred during the operation -
	 * SmartsheetException : if there is any other error occurred during the operation
	 * 
	 * @param folder
	 * @return
	 * @throws SmartsheetException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IOException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws SmartsheetRestException 
	 * @throws HttpClientException 
	 * @throws JSONSerializerException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public Folder updateFolder(Folder folder) throws SmartsheetException;

	/**
	 * Delete a folder.
	 * 
	 * It mirrors to the following Smartsheet REST API method: DELETE /folder{id}
	 * 
	 * Parameters: - folderId : the folder ID
	 * 
	 * Returns: None
	 * 
	 * Exceptions: - InvalidRequestException : if there is any problem with the REST API request -
	 * AuthorizationException : if there is any problem with the REST API authorization(access token) -
	 * ResourceNotFoundException : if the resource can not be found - ServiceUnavailableException : if the REST API
	 * service is not available (possibly due to rate limiting) - SmartsheetRestException : if there is any other REST
	 * API related error occurred during the operation - SmartsheetException : if there is any other error occurred
	 * during the operation
	 * 
	 * @param folderId
	 * @throws SmartsheetException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IOException 
	 * @throws HttpClientException 
	 * @throws JSONSerializerException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws SmartsheetRestException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public void deleteFolder(long folderId) throws SmartsheetException;

	/**
	 * List child folders of a given folder.
	 * 
	 * It mirrors to the following Smartsheet REST API method: GET /folder/{id}/folders
	 * 
	 * Parameters: - parentFolderId : the parent folder ID
	 * 
	 * Returns: the child folders (note that empty list will be returned if no child folder found)
	 * 
	 * Exceptions: - InvalidRequestException : if there is any problem with the REST API request -
	 * AuthorizationException : if there is any problem with the REST API authorization(access token) -
	 * ResourceNotFoundException : if the resource can not be found - ServiceUnavailableException : if the REST API
	 * service is not available (possibly due to rate limiting) - SmartsheetRestException : if there is any other REST
	 * API related error occurred during the operation - SmartsheetException : if there is any other error occurred
	 * during the operation
	 * 
	 * @param parentFolderId
	 * @return
	 * @throws SmartsheetException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IOException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws SmartsheetRestException 
	 * @throws JSONSerializerException 
	 * @throws HttpClientException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public List<Folder> listFolders(long parentFolderId) throws SmartsheetException;

	/**
	 * Create a folder.
	 * 
	 * It mirrors to the following Smartsheet REST API method: POST /folder/{id}/folders
	 * 
	 * Parameters: - parentFolderId : the parent folder ID - folder : the folder to create
	 * 
	 * Returns: the created folder
	 * 
	 * Exceptions: - IllegalArgumentException : if folder is null - InvalidRequestException : if there is any problem
	 * with the REST API request - AuthorizationException : if there is any problem with the REST API
	 * authorization(access token) - ServiceUnavailableException : if the REST API service is not available (possibly
	 * due to rate limiting) - SmartsheetRestException : if there is any other REST API related error occurred during
	 * the operation - SmartsheetException : if there is any other error occurred during the operation
	 * 
	 * @param folder
	 * @param parentFolderId
	 * @return
	 * @throws SmartsheetException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IOException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws SmartsheetRestException 
	 * @throws HttpClientException 
	 * @throws JSONSerializerException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public Folder createFolder(long parentFolderId, Folder folder) throws SmartsheetException;
}
