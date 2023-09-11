package cgg.keep.notes.model;

import java.time.LocalDateTime;

public class Note {
private int noteId;
private String noteTitle;
private String noteContent;
private String noteStatus;
private LocalDateTime createdAt;


public Note(int noteId, String noteTitle, String noteContent, String noteStatus) {
	super();
	this.noteId = noteId;
	this.noteTitle = noteTitle;
	this.noteContent = noteContent;
	this.noteStatus = noteStatus;
}
public int getNoteId() {
	return noteId;
}
public void setNoteId(int noteId) {
	this.noteId = noteId;
}
public String getNoteTitle() {
	return noteTitle;
}
public void setNoteTitle(String noteTitle) {
	this.noteTitle = noteTitle;
}
public String getNoteContent() {
	return noteContent;
}
public void setNoteContent(String noteContent) {
	this.noteContent = noteContent;
}
public String getNoteStatus() {
	return noteStatus;
}
public void setNoteStatus(String noteStatus) {
	this.noteStatus = noteStatus;
}
public LocalDateTime getCreatedAt() {
	return createdAt;
}

public void setCreatedAt() {
	this.createdAt = LocalDateTime.now();
}
public Note() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Note [noteId=" + noteId + ", noteTitle=" + noteTitle + ", noteContent=" + noteContent + ", noteStatus="
			+ noteStatus + ", createdAt=" + createdAt + "]";
}


}
