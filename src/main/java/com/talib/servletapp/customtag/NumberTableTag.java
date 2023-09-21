package com.talib.servletapp.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class NumberTableTag extends TagSupport {

    public int number;

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int doStartTag() throws JspException {

        JspWriter out = pageContext.getOut();

        try {
            out.println("<br>");
            for (int i = 1; i <= 10; i++) {
                out.println(number * i + "<br>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SKIP_BODY;
    }
}
