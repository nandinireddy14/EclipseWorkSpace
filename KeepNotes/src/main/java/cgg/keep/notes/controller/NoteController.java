package cgg.keep.notes.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cgg.keep.notes.model.Note;
import cgg.keep.notes.repository.NoteRepository;

@Controller
public class NoteController {
	@Autowired
	 NoteRepository repository;

	@RequestMapping(path="/",method=RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping(path="/saveNote",method=RequestMethod.POST)
	public String saveNotes(@ModelAttribute("note") Note note,Model model){
		note.setCreatedAt();
		repository.addNote(note);
		
		List<Note> notes = repository.getNotes();
		Collections.sort(notes,Comparator.comparing(Note::getCreatedAt).reversed());
		
		model.addAttribute("notes",notes);
		System.out.println(note);
		return "index";
	}
	
	@RequestMapping(path="/deleteNote",method=RequestMethod.POST)
	public String deleteNotes(@RequestParam int noteId,Model model) {
		repository.deleteNote(noteId);
		model.addAttribute("notes",repository.getAllNotes());
		System.out.println(repository.getAllNotes());
		return "index";
		
	}
}
