package com.example.excercise.repository;

import com.example.excercise.model.Setting;

import java.util.List;

public interface ISettingRepository {
    List<Setting> findAll();
    Setting findById(int id);
    void edit(Setting setting);
}
