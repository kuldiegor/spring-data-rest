/*
 * Copyright 2013-2022 the original author or authors.
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
package org.springframework.data.rest.core.mapping;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

/**
 * A {@link ResourceMapping} that is backed by a {@link Method}.
 *
 * @author Oliver Gierke
 */
public interface MethodResourceMapping extends ResourceMapping {

	/**
	 * Returns the {@link Method} backing the resource.
	 *
	 * @return
	 */
	Method getMethod();

	/**
	 * Returns {@link ParameterMetadata} instances for all named parameters.
	 *
	 * @return
	 */
	ParametersMetadata getParametersMetadata();

	/**
	 * Returns whether the resource is sortable.
	 *
	 * @return
	 */
	boolean isSortableResource();

	/**
	 * Returns the domain type that the query method returns. This will inspect wrapper types ({@link Collection}s,
	 * {@link Map}s, {@link Optional}s etc.) for their element or value types.
	 *
	 * @return will never be {@literal null}.
	 * @since 2.3
	 */
	Class<?> getReturnedDomainType();
}
