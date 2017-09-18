package com.yinzifan.liandisys._0911_DI;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's";
	private String artist = "THe Beatles";

	@Override
	public void play() {
		System.out.println("SgtPeppers [title=" + title + ", artist=" + artist + "]");
	}

}
