package com.mozen.springbootkeycloack.repository;

import com.mozen.springbootkeycloack.model.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Long> {
}
