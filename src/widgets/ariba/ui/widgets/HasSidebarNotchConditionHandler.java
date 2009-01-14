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

    $Id: //ariba/platform/ui/widgets/ariba/ui/widgets/HasSidebarNotchConditionHandler.java#10 $
*/

package ariba.ui.widgets;

import ariba.ui.aribaweb.core.AWRequestContext;
import ariba.ui.aribaweb.core.AWComponent;

public final class HasSidebarNotchConditionHandler extends ConditionHandler
{
    public boolean evaluateCondition (AWRequestContext requestContext)
    {
        // defer to binding, if one was passed on the <BasicPageWrapper>
        AWComponent parent = requestContext.getCurrentComponent().parent();
        if (parent.hasBinding(BindingNames.hasSidebarNotch)) {
            return parent.booleanValueForBinding(BindingNames.hasSidebarNotch);
        }
        if (requestContext.session(false) != null) {
            WidgetsSessionState state = WidgetsSessionState.get(requestContext);
            return state.hasSidebarNotch();
        }
        return true;
    }
}