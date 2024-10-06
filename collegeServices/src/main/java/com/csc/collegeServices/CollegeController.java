package com.csc.collegeServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/college")
public class CollegeController {
    
    @Autowired
    private CollegeService collegeService;

    @GetMapping
    public List<CollegeEntity> getAllCollegeEntities() {
        return collegeService.getAllCollegeEntities();
    }

    @GetMapping("/{id}")
    public CollegeEntity getCollegeEntityById(@PathVariable Long id) {
        return collegeService.getCollegeEntityById(id);
    }

    @PostMapping
    public CollegeEntity createCollegeEntity(@RequestBody CollegeEntity collegeEntity) {
        return collegeService.createCollegeEntity(collegeEntity);
    }

    @PutMapping("/{id}")
    public CollegeEntity updateCollegeEntity(@PathVariable Long id, @RequestBody CollegeEntity collegeEntity) {
        return collegeService.updateCollegeEntity(id, collegeEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteCollegeEntity(@PathVariable Long id) {
        collegeService.deleteCollegeEntity(id);
    }
}
