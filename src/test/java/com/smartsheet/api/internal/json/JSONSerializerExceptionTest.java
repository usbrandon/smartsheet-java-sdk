package com.smartsheet.api.internal.json;

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

import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JSONSerializerExceptionTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testJSONSerializerExceptionString() throws JSONSerializerException {
		thrown.expect(JSONSerializerException.class);
		String message = "Test Exception";
		thrown.expectMessage(message);
		throw new JSONSerializerException(message);
	}
	
	

	@Test
	public void testJSONSerializerExceptionStringThrowable() throws JSONSerializerException {
		thrown.expect(JSONSerializerException.class);
		String message = "Test Exception1";
		thrown.expectMessage(message);
		JSONSerializerException ex = new JSONSerializerException("test");
		thrown.expectCause(is(ex));
		throw new JSONSerializerException(message,ex);
	}

	@Test
	public void testJSONSerializerExceptionException() throws JSONSerializerException {
		thrown.expect(JSONSerializerException.class);
		JSONSerializerException ex = new JSONSerializerException("test");
		thrown.expectCause(is(ex));
		throw new JSONSerializerException(ex);
	}

}
