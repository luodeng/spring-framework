/*
 * Copyright 2002-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.accept;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * Exception raised when an API version is required, but is not present.
 *
 * @author Rossen Stoyanchev
 * @since 7.0
 */
@SuppressWarnings("serial")
public class MissingApiVersionException extends ResponseStatusException {

	public MissingApiVersionException() {
		super(HttpStatus.BAD_REQUEST, "API version is required.");
	}

}
