package com.mozen.springbootkeycloack.service;

import com.mozen.springbootkeycloack.model.Plant;
import com.mozen.springbootkeycloack.repository.PlantRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class PlantService {

    private PlantRepository plantRepository;

    public PlantService(
            PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public Plant getPlant(long plantId) throws RuntimeException {
        Optional<Plant> plantOpt = plantRepository.findById(plantId);

        if (!plantOpt.isPresent()) {
            throw new RuntimeException("Plant could not be found with id : " + plantId);
        }

        return plantOpt.get();
    }
}
