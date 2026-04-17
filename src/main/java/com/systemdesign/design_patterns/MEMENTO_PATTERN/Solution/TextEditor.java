package com.systemdesign.design_patterns.MEMENTO_PATTERN.Solution;

public class TextEditor {

	private String content;
	
	public void write(String text)
	{
		this.content=text;
	}
	
	public EditorMemento save()
	{
		return new EditorMemento(content);
	}
	
	public void restore(EditorMemento memento)
	{
		content=memento.getContent();
	}
	
	public String getContent()
	{
		return content;
	}
	
	
}
/*
 * This class acts as the Originator in the Memento Pattern.
 *
 * It represents the main object whose state needs to be saved and restored.
 *
 * - save() creates a snapshot (memento) of the current state
 * - restore() restores the state from a given memento
 *
 * The internal state (content) is not exposed directly,
 * preserving encapsulation.
 */