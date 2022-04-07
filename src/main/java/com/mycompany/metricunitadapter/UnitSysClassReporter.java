/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metricunitadapter;

/**
 *
 * @author MoaathAlrajab
 */
public class UnitSysClassReporter extends MetricSystemReporter implements MetricSysInfo{

    @Override
    public double getDistanceInMile() {
        return meterToMile(this.distanceInMeter);
    }

    @Override
    public void setDistanceInMile(double distanceInMile) {
        this.distanceInMeter=mileToMeter(distanceInMile);
    }

    @Override
    public double getDistanceInMeter() {
        return distanceInMeter;
    }

    @Override
    public void setDistanceInMeter(double distanceInMeter) {
        this.distanceInMeter=distanceInMeter;

    }
    
    private double mileToMeter(double mile) {
		return mile  * 1609.34;
	}

	private double meterToMile(double meter) {
		return meter/1609.34;
	}
    
}
