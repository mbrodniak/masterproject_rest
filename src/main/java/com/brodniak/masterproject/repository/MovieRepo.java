package com.brodniak.masterproject.repository;

import com.brodniak.masterproject.entity.Movie;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface MovieRepo extends JpaRepository<Movie, String> {

    Optional<Movie> findByImdbId(String id);

    @Query(
            value = "select * from movie order by imdb_id",
            countQuery = "select count(*) from movie",
            nativeQuery = true
    )
    List<Movie> findMovies(Pageable page);
}
