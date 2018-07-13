package actions;

import forms.MyForm;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        MyForm myForm = (MyForm) form;
        String target = "success";

        ActionErrors errors = myForm.validate(mapping, request);
        if (errors.size() != 0) {
            target = "failure";
            saveErrors(request, errors);
        }

        return (mapping.findForward(target));
    }
}
