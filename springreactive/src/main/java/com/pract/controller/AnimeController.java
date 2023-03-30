package com.pract.controller;

import com.pract.domain.Anime;
import com.pract.repo.AnimeRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("anime")
@Slf4j
@RequiredArgsConstructor
public class AnimeController {

    private  final AnimeRepo animeRepo;


    @GetMapping("/all")
    public Flux<Anime> listAll(){
        return animeRepo.findAll();
    }
}
