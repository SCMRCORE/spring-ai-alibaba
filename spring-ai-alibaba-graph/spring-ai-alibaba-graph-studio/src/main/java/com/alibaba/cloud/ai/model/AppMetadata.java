/*
 * Copyright 2024-2025 the original author or authors.
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
package com.alibaba.cloud.ai.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * AppMetadata carries the basic information of an App
 */
@Data
@Accessors(chain = true)
public class AppMetadata {

	public static final String CHATBOT_MODE = "chatbot";

	public static final String WORKFLOW_MODE = "workflow";

	public static final String[] SUPPORT_MODES = { CHATBOT_MODE, WORKFLOW_MODE };

	private String id;

	private String name;

	private String description;

	private String mode;

}
