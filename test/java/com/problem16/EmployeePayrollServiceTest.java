package com.problem16;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import com.problem16.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEnteries() {
		EmployeePayrollData[] arrayOfEmps= {
				new EmployeePayrollData(1,"Sippora Toppo", 350000.0),
				new EmployeePayrollData(2,"Asher David", 400000.0),
				new EmployeePayrollData(3,"Akshay Nikam", 500000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService=new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
		employeePayrollService.printData(IOService.FILE_IO);
		long entries=employeePayrollService.countEntries(IOService.FILE_IO);
		Assert.assertEquals(3,entries);	
	}
}
