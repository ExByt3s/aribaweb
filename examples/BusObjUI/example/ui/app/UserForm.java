package example.ui.app;

import ariba.ui.aribaweb.core.AWComponent;
import example.ui.busobj.*;

public class UserForm extends AWComponent
{
    public String op = "edit";
    public User user = User.getEffectiveUser();

    public AWComponent save ()
    {
        if (errorManager().checkErrorsAndEnableDisplay()) return null;
        // Do save...
        return null;
    }

    public boolean isStateless()
    {
        return false;
    }
}