package com.gs.invest.camra;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SomeBussinessImplTest {
    @Test
    public void testRetrieveGreatestData() {
        SomeBussinessImpl bussinessImpl= new SomeBussinessImpl(new DataServiceStub());
        int result=bussinessImpl.retrieveGreatestData();
        assertEquals(32,result);
    }
    class DataServiceStub implements DataService
    {
        @Override
        public int[] retrieveAllData()
        {
            return new int[] {12,5,32};
        }
    }
}