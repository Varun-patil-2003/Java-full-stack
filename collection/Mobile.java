package com.collection;

public class Mobile {

	private int modelNo;
	private String name,material,camera;
	
	public Mobile() {
		
	}	

	public Mobile(int modelNo, String name, String material, String camera) {
		super();
		this.modelNo = modelNo;
		this.name = name;
		this.material = material;
		this.camera = camera;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Mobile [modelNo=" + modelNo + ", name=" + name + ", material=" + material + ", camera=" + camera + "]";
	}
	
	public static void main(String[] args) {
		
	}

}
