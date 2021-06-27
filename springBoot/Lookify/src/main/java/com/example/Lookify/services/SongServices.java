package com.example.Lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Lookify.models.Song;
import com.example.Lookify.repositories.SongRepositories;

@Service
public class SongServices {
	private final SongRepositories songrepo;

	public SongServices(SongRepositories songrepo) {
		this.songrepo = songrepo;
	}
public List<Song>allSong(){
	return songrepo.findAll();
}
public Song createsong(Song s) {
	return songrepo.save(s);
}
public Song findsong(Long id) {
	Optional <Song> optionalsong=songrepo.findById(id);
	if(optionalsong.isPresent()) {
		return optionalsong.get();
	}else {
		return null;
	}
}
public void deletesong(Long id) {
	songrepo.deleteById(id);
}
public List<Song>topten(){
	return songrepo.findTop10ByOrderByRatingDesc();
}
public List<Song>search(String search){
	return songrepo.findByArtistContaining(search);
}
}
