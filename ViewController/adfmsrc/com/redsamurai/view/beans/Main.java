package com.redsamurai.view.beans;

import com.redsamurai.components.view.beans.ComponentBean;
import com.redsamurai.view.utils.ADFUtils;

import javax.faces.event.ActionEvent;

public class Main implements ComponentBean {
    public Main() {
        super();
    }

    @Override
    public void processSelection(ActionEvent actionEvent) {
        Integer locId = (Integer) ADFUtils.getBoundAttributeValue("LocationId");
        System.out.println("LOCATION ID: " + locId);
    }
}
