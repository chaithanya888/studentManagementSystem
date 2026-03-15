package com.interfacses;
import java.util.function.Function;
public class SensorDta {
	private double  temperature;
	private double  humidity;
	
	public SensorDta(double temperature,double humidity) {
		this.temperature=temperature;
		this.humidity=humidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
	public static void main(String[]args) {
		
		SensorDta sensor=new SensorDta(30.0,60.0);
		double threshold=25.0;
		Function<Double,Boolean> f2=new Function<Double,Boolean>(){
			
				public Boolean apply(Double num) {
					if(num>threshold) {
						return true;
					}else {
					return false;
					}
				}
				};
				
		Function<SensorDta,Double> f=new Function<SensorDta,Double>(){
			
		public Double apply(SensorDta e){
				double temp=e.getTemperature();
				System.out.println(f2.apply(temp)?"Temperature is above 25":"Temperatue is belwo 25");
				return temp;
		}
		};
		
		System.out.println("Temperature is "+f.apply(sensor));

	}
}
