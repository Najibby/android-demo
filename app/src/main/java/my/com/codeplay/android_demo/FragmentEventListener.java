/*
 * Copyright 2017 (C) CodePlay Studio. All rights reserved.
 *
 * All source code within this app is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package my.com.codeplay.android_demo;

import androidx.annotation.LayoutRes;
import android.view.View;

/**
 * Created by Tham on 05/08/2017.
 */

public interface FragmentEventListener {
    void onFragmentButtonClick(View view);
    void onFragmentListItemClick(Class targetComponent, @LayoutRes int resId);
}
