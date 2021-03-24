package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
    }

    @Test
    void printSalariesTestEmpty()
    {
        ArrayList<employee> employess = new ArrayList<employee>();
        app.printSalaries(employess);
    }

    @Test
    void printSalariesTestContainsNull()
    {
        ArrayList<employee> employess = new ArrayList<employee>();
        employess.add(null);
        app.printSalaries(employess);
    }

    @Test
    void printSalaries()
    {
        ArrayList<employee> employees = new ArrayList<employee>();
        employee emp = new employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }


}