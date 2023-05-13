package com.sep6.backend.repository;

import com.sep6.backend.jpa.GenresJpaRepository;
import com.sep6.backend.models.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenresRepositoryImpl implements GenresRepository {
    private GenresJpaRepository jpaRepository;

    @Autowired
    public GenresRepositoryImpl(GenresJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<Genre> getAllGenres() {
        return jpaRepository.findAll();
    }
}
