package com.gg.enumDemo;

import java.util.EnumSet;
import java.util.Set;

/**
 * 对于集合中的枚举使用enumSet
 * @author shiweibo
 *
 * 2018年6月4日
 */
public class Text {

	public static void main(String[] args) {
		Text text = new Text();
		text.applyStyles(EnumSet.of(Style.BOLD));
	}
	
	public enum Style{
		BOLD,
		ITALIC,
		UNDERLINE,
		STRIKETHROUGH;
	}
	
	public void applyStyles(Set<Style> styles){
		for (Style style : styles) {
			System.out.println(style.toString());
		}
	}
	
	
}
