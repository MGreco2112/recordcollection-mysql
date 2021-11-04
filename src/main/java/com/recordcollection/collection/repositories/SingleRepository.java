package com.recordcollection.collection.repositories;

import com.recordcollection.collection.models.Single;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingleRepository extends JpaRepository<Single, Long> {
}
