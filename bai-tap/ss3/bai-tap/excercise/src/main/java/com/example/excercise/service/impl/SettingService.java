package com.example.excercise.service.impl;

import com.example.excercise.model.Setting;
import com.example.excercise.repository.ISettingRepository;
import com.example.excercise.repository.impl.SettingRepository;
import com.example.excercise.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SettingService implements ISettingService {
    @Autowired
    ISettingRepository iSettingRepository;
    @Override
    public List<Setting> findAll() {
        return iSettingRepository.findAll();
    }

    @Override
    public Setting findById(int id) {
        return iSettingRepository.findById(id);
    }

    @Override
    public void edit(Setting setting) {
        iSettingRepository.edit(setting);
    }
}
