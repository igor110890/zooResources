package com.example.zooResources.service.serviceImpl;

import com.example.zooResources.entity.Animals;
import com.example.zooResources.repository.AnimalsRepository;
import com.example.zooResources.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class AnimalsServiceImpl implements AnimalsService {

    private final AnimalsRepository animalsRepository;

    @Autowired
    public AnimalsServiceImpl(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }

    @Override
    public List<Animals> findAll() {
        return animalsRepository.findAll();
    }

    @Override
    public Animals findById(Long id) {
        return animalsRepository.getById(id);
    }
}
