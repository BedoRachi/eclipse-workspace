package generics_LYJ;

public class GenericPrinter<T extends Meterial>  { // T : 다양한 데이터 타입을 받을 수 있다.
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();

	}
	
	public void printing() {
		material.doPrinting();
	}
}
