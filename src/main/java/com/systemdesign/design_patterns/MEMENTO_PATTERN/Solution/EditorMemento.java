package com.systemdesign.design_patterns.MEMENTO_PATTERN.Solution;

public class EditorMemento {

	private final String content;

	public EditorMemento(String content) {
		super();
		this.content = content;
	}
	
	public String getContent()
	{
		return content;
	}
	 
}
/*
 * This class represents the Memento.
 *
 * It stores the state of the TextEditor at a specific point in time.
 *
 * The state is immutable and cannot be modified once created,
 * ensuring data integrity.
 *
 * It does not expose any business logic,
 * only the stored state required for restoration.
 */