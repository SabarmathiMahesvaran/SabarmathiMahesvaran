package com.csc.collegeServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public List<CollegeEntity> getAllCollegeEntities() {
        return collegeRepository.findAll();
    }

    public CollegeEntity getCollegeEntityById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    public CollegeEntity createCollegeEntity(CollegeEntity collegeEntity) {
        return collegeRepository.save(collegeEntity);
    }

    public CollegeEntity updateCollegeEntity(Long id, CollegeEntity collegeEntity) {
        collegeEntity.setId(id);
        return collegeRepository.save(collegeEntity);
    }

    public void deleteCollegeEntity(Long id) {
        collegeRepository.deleteById(id);
    }
}
