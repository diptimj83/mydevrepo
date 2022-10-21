package com.gs.invest.camra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeBussinessImpl {


    private DataService dataService;


    public SomeBussinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int retrieveGreatestData()
    {
        int [] data=dataService.retrieveAllData();
        int greatest=Integer.MIN_VALUE;
        for(int value:data)
        {
            if(value>greatest)
            {
                greatest = value;
            }
        }
        return greatest;
    }
}
