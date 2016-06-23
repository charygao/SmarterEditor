/*
 * Copyright 2010 Joachim Ansorg, mail@ansorg-it.com
 * File: FormatElementAction.java, Class: FormatElementAction
 * Last modified: 2010-03-28
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.smarter.formatFavourite;

import com.intellij.openapi.editor.actionSystem.EditorAction;

/**
 * User: jansorg
 * Date: Mar 5, 2010
 * Time: 9:37:32 PM
 */
public class FormatElementAction extends EditorAction {
    public FormatElementAction() {
        super(new FormatElementHandler());
    }
}
