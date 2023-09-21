package com.talib.servletapp.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {

        JspWriter out = pageContext.getOut();

        try {
            out.println("Hello World");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }
}
