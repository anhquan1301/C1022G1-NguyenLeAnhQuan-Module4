package com.example.excercise2.controller;

import com.example.excercise2.dto.MusicDTO;
import com.example.excercise2.model.Music;
import com.example.excercise2.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/music")
@Controller
public class MusicController {
    @Autowired
    private IMusicService iMusicService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("musicList",iMusicService.findAll());
        return "/list";
    }
    @GetMapping("create-form")
    public String createForm(Model model){
        model.addAttribute("musicDTO",new MusicDTO());
        return "/create";
    }
    @PostMapping("create")
    public String create(@Validated @ModelAttribute MusicDTO musicDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/create";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDTO,music);
        iMusicService.create(music);
        return "redirect:/music";
    }
    @GetMapping("edit-form")
    public String editForm(@RequestParam(required = false) Integer id,Model model){
        model.addAttribute("musicDTO",iMusicService.findById(id));
        return "/edit";
    }
    @PostMapping("edit")
    public String edit(@Validated @ModelAttribute MusicDTO musicDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/edit";
        }
        Music music = new Music();
        BeanUtils.copyProperties(musicDTO,music);
        iMusicService.edit(music);
        return "redirect:/music";
    }
}
