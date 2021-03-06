/*
 * Copyright 2013 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.openbidder.api.match;

import com.google.openbidder.api.interceptor.StandardInterceptorController;

import com.codahale.metrics.MetricRegistry;

import java.util.List;

/**
 * Pixel matching controller.
 */
public class MatchController
extends StandardInterceptorController<MatchRequest, MatchResponse> {

  public MatchController(List<? extends MatchInterceptor> interceptors,
    MetricRegistry metricRegistry) {
    super(interceptors, metricRegistry);
  }
}
