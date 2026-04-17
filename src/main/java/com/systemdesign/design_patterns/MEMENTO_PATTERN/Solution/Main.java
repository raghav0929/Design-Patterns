package com.systemdesign.design_patterns.MEMENTO_PATTERN.Solution;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor editor=new TextEditor();
		Caretaker caretaker=new Caretaker();
		editor.write("Hello");
		caretaker.saveState(editor);
		editor.write("Hello World");
		caretaker.saveState(editor);
		caretaker.undo(editor);
		//problem -Undo the last Write
		System.out.println(editor.getContent());
	}

}


/*
 * Solution:
 *
 * The Memento Pattern is used to add undo functionality
 * without breaking encapsulation.
 *
 * Here:
 * - TextEditor creates snapshots of its state
 * - Caretaker stores the history of states
 *
 * We save the state after each write operation,
 * and when undo is called, the previous state is restored.
 *
 * This allows us to revert changes safely and cleanly.
 */