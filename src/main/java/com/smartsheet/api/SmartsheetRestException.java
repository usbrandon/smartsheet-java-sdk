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



import com.smartsheet.api.models.Error;

/**
 * This is the exception to indicate errors (Error objects of Smartsheet REST API) returned from Smartsheet REST API.
 * 
 * Several specific exceptions are defined to indicate the following HTTP responses: 400 BAD REQUEST 401 NOT AUTHORIZED
 * 403 FORBIDDEN 404 NOT FOUND 503 SERVICE UNAVAILABLE
 * 
 * Thread safety: Exceptions are not thread safe.
 */
public class SmartsheetRestException extends SmartsheetException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Represents the error code.
	 * 
	 * It will be initialized in constructor and will not change afterwards.
	 */
	private final int errorCode;

	/**
	 * Constructor.
	 * 
	 * Parameters: - error : the Error object from Smartsheet REST API
	 * 
	 * Implementation: super(error.getMessage()); this.errorCode = error.getErrorCode();
	 * 
	 * @param error
	 */
	public SmartsheetRestException(Error error) {
		super(error.getMessage());
		errorCode = error.getErrorCode();
	}
	
	

	/**
	 * Returns the error code.
	 * 
	 * Returns: the error code.
	 * 
	 * Implementation: return this.errorCode;
	 * 
	 * @return
	 */
	public int getErrorCode() {
		return 0;
	}
}
