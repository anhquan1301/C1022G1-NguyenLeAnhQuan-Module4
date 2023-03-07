package com.example.excercise2.repository;

import com.example.excercise2.dto.MusicDTO;
import com.example.excercise2.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Music,Integer> {
    Music findById(int id);
}
