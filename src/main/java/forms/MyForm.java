package forms;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class MyForm extends ActionForm {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset(ActionMapping mapping, javax.servlet.http.HttpServletRequest request) {
        age = 0;
        name = null;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors actionErrors = new ActionErrors();
        if (name == null || name.trim().length() == 0) {
            actionErrors.add("name", new ActionMessage("required not null name"));
        }

        if (age < 0) {
            actionErrors.add("age", new ActionMessage("required real age"));
        }

        return actionErrors;
    }
}
