package com.pract.repo;

import com.pract.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepo extends ReactiveCrudRepository<Anime,Integer> {
}
