package com.Hospital.Management.System;

import java.util.Arrays;

public class Patient {

	int patienId;
	String name;
	int [] arr=new int[5];
	int ele=0;
	
	
	public Patient(int patienId, String name, int[] arr) {
		super();
		this.patienId = patienId;
		this.name = name;
		this.arr = arr;
	}
	public double getAverageResult() {
		for(int i=0;i<arr.length;i++) {
			 ele+=arr[i];
			}
		return ele/5;
		}
	public boolean hasCriticalValues() {
		if(getAverageResult()<=50){
			return true;
		}else {
			return false;
		}
	}
	public void displayPatientReport() {
		
		System.out.println("Patient Name: "+this.name);
		System.out.println("Patient Id: "+this.patienId);
		System.out.println("Reports :"+Arrays.toString(arr));
		System.out.println("");
	}


	public static void main(String[] args) {
		
		Patient [] p=new Patient[5];
		p[0]=new Patient(101,"venila",new int[] {60,70,40,30,20});
        p[1]=new Patient(102,"pradeep",new int[] {20,40,100,40,60});
        p[2]=new Patient(103,"vinay",new int[] {120,70,90,110,95});
        p[3]=new Patient(104,"neelima",new int[] {10,20,10,40,20});
        p[4]=new Patient(105,"vishnu",new int[] {40,50,10,40,30});
        
        
        for (Patient patient:p) {
        	if(patient.hasCriticalValues()) {
        		patient.displayPatientReport();
        	}
        }
	}

}
