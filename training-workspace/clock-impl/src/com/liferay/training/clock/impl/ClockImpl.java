package com.liferay.training.clock.impl;

import java.util.Date;
import org.osgi.service.component.annotations.Component;

public class ClockImpl implements ClockApi {

    @Override
    public String getTime() {
    	return new Date().toString(); 
    }
}