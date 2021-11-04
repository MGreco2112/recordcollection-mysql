package com.recordcollection.collection.repositories;

import com.recordcollection.collection.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
