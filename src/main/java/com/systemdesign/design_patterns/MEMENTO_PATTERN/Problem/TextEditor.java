package com.systemdesign.design_patterns.MEMENTO_PATTERN.Problem;

public class TextEditor {

	private String content;
	
	public void write(String text)
	{
		this.content=text;
	}
	
	public String getContent()
	{
		return content;
	}
}


/*
 * Problem:
 *
 * The TextEditor class allows writing content,
 * but it does not maintain any history of changes.
 *
 * Once new content is written, the previous state is lost.
 *
 * This creates a problem when we want to implement features like:
 * - Undo last change
 * - Restore previous state
 *
 * In the current design, there is no way to go back
 * to the previous content ("Hello") after writing "Hello World".
 *
 * To support undo functionality, we would need to manually
 * store and manage previous states outside the class,
 * which breaks encapsulation and makes the design messy.
 *
 * This is where the Memento Design Pattern is useful,
 * as it allows storing and restoring object state
 * without exposing internal details.
 */