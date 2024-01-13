package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Song;

public interface SongService {

public List<Song> fetchAllSongs();

public void addSong(Song song);

public boolean songExists(String name);

public void updateSong(Song song);
}
