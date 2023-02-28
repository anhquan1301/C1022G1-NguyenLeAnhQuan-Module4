package com.example.excercise.service;

import com.example.excercise.model.Setting;

import java.util.List;

public interface ISettingService {
    List<Setting> findAll();
    Setting findById(int id);
    void edit(Setting setting);
    void save(Setting setting);
    void delete(int id);
}
