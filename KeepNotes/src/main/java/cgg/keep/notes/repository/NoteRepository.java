package cgg.keep.notes.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import cgg.keep.notes.model.Note;
@Repository
public class NoteRepository {

	List<Note> notes=null;

	public NoteRepository() {
		super();
		notes=new ArrayList<>();
	}
	

	public List<Note> getNotes() {
		return notes;
	}


	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}


	public void addNote(Note note) {
		this.notes.add(note);
	}
	public List<Note> getAllNotes(){
		return this.notes;
	}
	
	public boolean deleteNote(int noteId) {
		boolean isRemoved=false;
		Iterator<Note> iterator = notes.iterator();
		while(iterator.hasNext()) {
			if(noteId==iterator.next().getNoteId()) {
				iterator.remove();
				isRemoved=true;
			}
		}
		
		return isRemoved;
	}
	
}
