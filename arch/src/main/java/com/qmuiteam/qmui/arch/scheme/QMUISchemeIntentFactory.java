/*
 * Tencent is pleased to support the open source community by making QMUI_Android available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the MIT License (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://opensource.org/licenses/MIT
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qmuiteam.qmui.arch.scheme;

import android.app.Activity;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Map;

public interface QMUISchemeIntentFactory {
    Intent factory(@NonNull Activity activity,
                   @NonNull Class<? extends Activity> activityClass,
                   @Nullable Map<String, SchemeValue> scheme,
                   @NonNull String origin);

    void startActivity(@NonNull Activity activity,
                       @NonNull Intent intent,
                       @Nullable Map<String, SchemeValue> scheme);

    boolean shouldBlockJump(@NonNull Activity activity,
                            @NonNull Class<? extends Activity> activityClass,
                            @Nullable Map<String, SchemeValue> scheme);
}
