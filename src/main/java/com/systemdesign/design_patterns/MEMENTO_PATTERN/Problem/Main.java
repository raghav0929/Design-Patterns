package com.systemdesign.design_patterns.MEMENTO_PATTERN.Problem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor editor=new TextEditor();
		editor.write("Hello");
		editor.write("Hello World");
		
		//problem -Undo the last Write
		System.out.println(editor.getContent());
	}

}
