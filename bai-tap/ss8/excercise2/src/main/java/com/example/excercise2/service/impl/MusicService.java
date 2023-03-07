package com.example.excercise2.service.impl;

import com.example.excercise2.model.Music;
import com.example.excercise2.repository.IMusicRepository;
import com.example.excercise2.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;
    @Override
    public List<Music> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void create(Music music) {
        iMusicRepository.save(music);
    }
}
