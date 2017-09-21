package com.yinzifan.liandisys._0921_SpringAutoWire04AutoDetect_Demo.bean;

/**
 * @author yinzf2
 * 2017/09/21	16:13:30
 */
public class Panda {
	private KungFu kungFu;

	/**
	 * 
	 */
	public Panda() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param kungFu
	 */
	public Panda(KungFu kungFu) {
		super();
		System.out.println("autowiring by constructor");
		this.kungFu = kungFu;
	}

	public KungFu getKungFu() {
		return kungFu;
	}

	public void setKungFu(KungFu kungFu) {
		System.out.println("autowiring by type");
		this.kungFu = kungFu;
	}

	@Override
	public String toString() {
		return "Panda [kungFu=" + kungFu + "]";
	}

}
