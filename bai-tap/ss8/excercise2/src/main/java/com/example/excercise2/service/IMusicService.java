package com.example.excercise2.service;

import com.example.excercise2.dto.MusicDTO;
import com.example.excercise2.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    void create(Music music);
    Music findById(int id);
    void edit(Music music);
}
