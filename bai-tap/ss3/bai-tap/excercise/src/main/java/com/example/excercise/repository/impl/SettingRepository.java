package com.example.excercise.repository.impl;

import com.example.excercise.model.Setting;
import com.example.excercise.repository.ISettingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SettingRepository implements ISettingRepository {
    private static List<Setting> settingList = new ArrayList<>();
    static {
        settingList.add(new Setting(1,"English","25",false,"Thor King,Asgard"));
        settingList.add(new Setting(2,"Vietnamese","15",true,"Thor King,Asgard"));
        settingList.add(new Setting(3,"Japanese","50",true,"Thor King,Asgard"));
    }
    @Override
    public List<Setting> findAll() {
        return settingList;
    }

    @Override
    public Setting findById(int id) {
        for (int i = 0; i < settingList.size(); i++) {
            if(settingList.get(i).getId()==id){
                return settingList.get(i);
            }
        }
        return null;
    }

    @Override
    public void edit(Setting setting) {
        for (int i = 0; i < settingList.size(); i++) {
            if (settingList.get(i).getId()==setting.getId()){
                settingList.set(i,setting);
            }
        }
    }

    @Override
    public void save(Setting setting) {
        setting.setId(settingList.size()+1);
        settingList.add(setting);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i <settingList.size() ; i++) {
            if(settingList.get(i).getId()==id){
                settingList.remove(settingList.get(i));
            }
        }
    }
}
