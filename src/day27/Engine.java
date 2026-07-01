package day27;

public class Engine {

	private int engineCC;
	private double engineLiter;   
	private String engineMfg;
	private String engineType;
	
	public Engine() {}
	public Engine(int engineCC, double engineLiter, String engineMfg, String engineType) {
		this.engineCC = engineCC;
		this.engineLiter = engineLiter;
		this.engineMfg = engineMfg;
		this.engineType = engineType;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public double getEngineLiter() {
		return engineLiter;
	}
	public void setEngineLiter(double engineLiter) {
		this.engineLiter = engineLiter;
	}
	public String getEngineMfg() {
		return engineMfg;
	}
	public void setEngineMfg(String engineMfg) {
		this.engineMfg = engineMfg;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Engine [engineCC=" + engineCC + ", engineLiter=" + engineLiter + ", engineMfg=" + engineMfg
				+ ", engineType=" + engineType + "]";
	}
	
	
}
