/*
    Copyright 1996-2008 Ariba, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    $Id:$
*/
package ariba.ideplugin.idea.lang.structure;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.psi.PsiFile;

public class OSSStructureViewFactory implements PsiStructureViewFactory
{


    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder (final PsiFile psiFile)
    {
        return new TreeBasedStructureViewBuilder()
        {
            @NotNull
            @Override
            public com.intellij.ide.structureView.StructureViewModel
            createStructureViewModel ()
            {
                return new OSSStructureViewModel(psiFile);
            }
        };
    }
}
