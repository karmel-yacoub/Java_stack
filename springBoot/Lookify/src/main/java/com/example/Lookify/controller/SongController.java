package com.example.Lookify.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Lookify.models.Song;
import com.example.Lookify.services.SongServices;

@Controller
public class SongController {
	private final SongServices songserve;
	
public SongController(SongServices songserve) {
		this.songserve = songserve;
	}


@RequestMapping("/")
public String welcome() {
	return "welcome.jsp";
}
@RequestMapping("/dashboard")
public String dashboard(Model model) {
	List<Song>songs = songserve.allSong();
	model.addAttribute("songs",songs);
	return"dashboard.jsp";
}
@RequestMapping("/songs/new")
public String add(@ModelAttribute("song") Song song) {
	return"new.jsp";
}
@RequestMapping(value="/songs/new", method=RequestMethod.POST)
public String add(@Valid@ModelAttribute("song") Song song,BindingResult result,Model model) {
	if (result.hasErrors()) {
		return "new.jsp";
	}
	else {
		songserve.createsong(song);
		return "redirect:/dashboard";
		
	}
}
@RequestMapping(value="/delete/{id}")
public String destroy(@PathVariable("id")Long id) {
	songserve.deletesong(id);
	return"redirect:/dashboard";
}
@RequestMapping("/show/{id}")
public String show(@PathVariable("id")Long id,Model model) {
	Song song = songserve.findsong(id);
	model.addAttribute("song",song);
	return"show.jsp";
}
@RequestMapping("/search/topten")
public String topten(Model model) {
	List<Song>top = songserve.topten();
	model.addAttribute("top",top);
	return"topten.jsp";
}

@RequestMapping(value="/search", method=RequestMethod.POST)
public String result(@RequestParam(value="search") String search,Model model) {
	List<Song> result=songserve.search(search);
	model.addAttribute("search",search);
	model.addAttribute("result",result);
	return "search.jsp";
			
}

//@RequestMapping("/search")
//public String search() {
//	return"redirect:/search/"+Song.getArtist();
//}
}
