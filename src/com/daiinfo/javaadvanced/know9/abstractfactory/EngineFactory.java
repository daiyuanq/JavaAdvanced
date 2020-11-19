package com.daiinfo.javaadvanced.know9.abstractfactory;

public class EngineFactory extends AbstractFactory{
	
	@Override
	public Engine manufactureEngine(String EngineType) {
		if (EngineType == null) {
			return null;
		}
		if (EngineType.equalsIgnoreCase("ToyotaEngine")) {
			return new ToyotaEngine();
		}
		if (EngineType.equalsIgnoreCase("HondaEngine")) {
			return new HondaEngine();
		}
		if (EngineType.equalsIgnoreCase("MitsubishiEngine")) {
			return new MitsubishiEngine();
		}
		return null;
	}

	@Override
	public Car manufactureCar(String carName) {
		// TODO Auto-generated method stub
		return null;
	}
}
