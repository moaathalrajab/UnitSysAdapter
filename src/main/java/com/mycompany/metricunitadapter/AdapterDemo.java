/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metricunitadapter;

/**
 *
 * @author MoaathAlrajab
 */
public class AdapterDemo {
    
    public static void main(String[] args) {

		// class adapter
		System.out.println("class adapter test");
		UnitSysClassReporter unitSys = new UnitSysClassReporter();
		
                unitSys.setDistanceInMile(14);
		System.out.println("Distance in meters:" + unitSys.getDistanceInMeter());
		System.out.println("Distance in miles:" + unitSys.getDistanceInMile());
                
    }
    
}
