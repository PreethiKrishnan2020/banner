package excelTestData;

import com.github.javafaker.Faker;

import ReadData.TestDataImport;

public class bannerTestData {

	String[] datatest;
	String[] fakedata;
	Faker faker = new Faker();
		
	public String[] fullbannerdata() {
		datatest=new String[12];
		
		datatest[0]=TestDataImport.getValue(1, 0);//mail
		datatest[1]=TestDataImport.getValue(1, 1);//pass
		datatest[2]=TestDataImport.getValue(1, 2);//titleE
		datatest[3]=TestDataImport.getValue(1, 3);//titleA
		datatest[4]=TestDataImport.getValue(1, 4);//ImageE
		datatest[5]=TestDataImport.getValue(1, 5);//ImageA
		datatest[6]=TestDataImport.getValue(1, 6);//countries
		datatest[7]=TestDataImport.getValue(1, 7);//grade
		datatest[8]=TestDataImport.getValue(1, 8);//date
		datatest[9]=TestDataImport.getValue(1, 9);//end date
		datatest[10]=TestDataImport.getValue(1, 10);//url
		datatest[11]=TestDataImport.getValue(1, 11);//checkbox

		return datatest;
	}
	public String[] fakerdata() {
		
		fakedata= new String[2];
		
		TestDataImport.setValue(1, 2,faker.name().title());
		TestDataImport.setValue(1, 3,faker.name().title());
		
		 return fakedata;
	}
}
