/*
 * Copyright (C) 2017 Luke Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.klinker.floating_tutorial.examples;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import xyz.klinker.android.floating_tutorial.FloatingTutorialActivity;
import xyz.klinker.android.floating_tutorial.TutorialPage;

public class InAppPurchaseExample extends FloatingTutorialActivity {

    @NotNull
    @Override
    public List<TutorialPage> getPages() {
        return new ArrayList<>();
    }
}