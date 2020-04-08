package com.spring.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Driver {

	public static void main(String[] args) {
		
		try {
			
			//create object mapper
			ObjectMapper mapper=new ObjectMapper();
			
			//read JSON file and convert it into Java POJO : data/sample-lite.json
			Student theStudent=mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print firstName and lastName
			System.out.println("First Name:"+theStudent.getFirstName());
			System.out.println("First Name:"+theStudent.getLastName());
			
			//getting address 
			Address theAddress=theStudent.getAddress();
			
			System.out.println("City:"+theAddress.getCity());
			
			//getting language
			System.out.print("Languages:");
			for(String tempLang:theStudent.getLanguages()) {
				System.out.print(tempLang+",");
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
