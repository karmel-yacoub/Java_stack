package com.example.Lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Lookify.models.Song;

public interface SongRepositories extends CrudRepository<Song,Long> {
	List<Song>findAll();
	List<Song>findByArtistContaining(String artist);
	List<Song>findTop10ByOrderByRatingDesc();
}
