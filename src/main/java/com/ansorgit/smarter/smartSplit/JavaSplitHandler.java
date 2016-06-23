/*
 * Copyright 2010 Joachim Ansorg, mail@ansorg-it.com
 * File: JavaSplitHandler.java, Class: JavaSplitHandler
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

package com.ansorgit.smarter.smartSplit;

import com.intellij.psi.JavaTokenType;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiJavaToken;
import org.jetbrains.annotations.NotNull;

/**
 * User: jansorg
 * Date: Mar 28, 2010
 * Time: 2:14:28 PM
 */
public class JavaSplitHandler implements LanguageSplitHandler {
    public boolean supportsElement(@NotNull PsiElement element) {
        return element instanceof PsiJavaToken && ((PsiJavaToken) element).getTokenType() == JavaTokenType.STRING_LITERAL;
    }

    public String getConcatOperator(@NotNull PsiElement element) {
        return "+";
    }

    public String getStringStart(@NotNull PsiElement element) {
        return "\"";
    }

    public String getStringEnd(@NotNull PsiElement element) {
        return "\"";
    }

    @Override
    public String getDummyPlaceholder(@NotNull PsiElement element) {
        return getStringStart(element) + getStringEnd(element);
    }
}
