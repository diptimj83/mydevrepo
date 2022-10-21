package com.gs.invest.camra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBussinessImplMockTest {

    @InjectMocks
    SomeBussinessImpl bussinessImpl;

    @Mock
    DataService dataServiceMock;


    @Test
    public void testRetrieveGreatestData_For3Value() {
        //DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,35});
        //SomeBussinessImpl bussinessImpl= new SomeBussinessImpl(dataServiceMock);
        int result=bussinessImpl.retrieveGreatestData();
        assertEquals(35,result);
    }

    @Test
    public void testRetrieveGreatestData_For1Value() {
        //DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{37});
        //SomeBussinessImpl bussinessImpl= new SomeBussinessImpl(dataServiceMock);
        int result=bussinessImpl.retrieveGreatestData();
        assertEquals(37,result);
    }
    @Test
    public void testRetrieveGreatestData_ForNoValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{ });
        int result=bussinessImpl.retrieveGreatestData();
        assertEquals(Integer.MIN_VALUE,result);
    }
    @Test
    public void testRetrieveGreatestData_ForEqualValue()
    {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{2,2});
        int result=bussinessImpl.retrieveGreatestData();
        assertEquals(2,result);
    }

}