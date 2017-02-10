package com.example.prasanth.serializable_learning;

import java.io.Serializable;

public class ModelEmployee implements Serializable {
    private String emp_name;
    private String emp_name2;
    private String emp_name3;

    public void setName(String emp_name)
    {
        this.emp_name=emp_name;
    }

    public String getName()
    {
        return emp_name;
    }

    public void setName2(String emp_name2)
    {
        this.emp_name2=emp_name2;
    }

    public String getName2()
    {
        return emp_name2;
    }

    public void setName3(String emp_name3)
    {
        this.emp_name3=emp_name3;
    }

    public String getName3()
    {
        return emp_name3;
    }
}
