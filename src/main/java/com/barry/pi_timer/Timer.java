package com.barry.pi_timer;

import org.python.core.PyFunction;
import org.python.core.PyString;
import org.python.core.PySystemState;
import org.python.util.PythonInterpreter;

public class Timer{

    private static final PythonInterpreter python = new PythonInterpreter();

    public void callDisplay(String value) {
        PySystemState state = python.getSystemState();
        System.out.println("Py path=" + state.path.toString());
        python.exec("from display_7segment import displaySomething as display");
        System.out.println("exec to do import");
        PyFunction py_add = (PyFunction)python.get("display");
        System.out.println("Got method Add");
        py_add.__call__(new PyString(value));
    }


}