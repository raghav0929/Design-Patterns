package com.systemdesign.design_patterns.MEMENTO_PATTERN.Solution;

import java.util.Stack;

public class Caretaker {

	private final Stack<EditorMemento> history=new Stack<>();
	
	public void saveState(TextEditor editor)
	{
		history.push(editor.save());
	}
	
	public void undo(TextEditor editor)
	{
		if(!history.isEmpty())
		{
			history.pop();
			editor.restore(history.peek());
		}
	}
}
/*
 * This class acts as the Caretaker in the Memento Pattern.
 *
 * It is responsible for storing and managing the history of states
 * (mementos) without modifying their content.
 *
 * - saveState() stores the current state of the editor
 * - undo() restores the previous state
 *
 * It does not know the internal details of the state,
 * only manages the snapshots.
 */