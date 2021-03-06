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

    $Id: //ariba/platform/ui/widgets/ariba/ui/widgets/AribaToc.java#15 $
*/

package ariba.ui.widgets;

import ariba.ui.aribaweb.util.AWPagedVector;
import ariba.ui.aribaweb.core.AWOutputRangeCheck;
import ariba.ui.aribaweb.core.AWRequestContext;

public final class AribaToc extends BrandingComponent
{
    private boolean _hasVisibleContent;
    private static final String HasTOCContent = "HasTOCContent";

    public String tocHeader ()
    {
        // Note this component is expected to be referenced from within a component
        // which itself is referenced from within a PageWrapper.
        return resolveTemplateOrComponentBasedInclude(BindingNames.tocHeader);
    }

    public String toc ()
    {
        // Note this component is expected to be referenced from within a component
        // which itself is referenced from within a PageWrapper.
        return resolveTemplateOrComponentBasedInclude(BindingNames.toc);
    }

    public boolean hasTOCContainer ()
    {
        PageWrapper pageWrapper = PageWrapper.instance(this);
        return pageWrapper.booleanValueForBinding("hasTOCContainer");
    }

    public void setIteratorForTOCContentCheck (AWPagedVector.AWPagedVectorIterator elements)
    {
        _hasVisibleContent = AWOutputRangeCheck.hasVisbibleContent(elements);
        requestContext().page().put(HasTOCContent, Boolean.valueOf(_hasVisibleContent));
    }

    public boolean hasVisibleContent ()
    {
        return _hasVisibleContent;
    }

    public static boolean hasVisibleContent (AWRequestContext requestContext)
    {
        Boolean hasVisibleContent = (Boolean)requestContext.page().get(HasTOCContent);
        return hasVisibleContent != null ? hasVisibleContent.booleanValue() : false;
    }

}
