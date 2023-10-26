package com.hrm;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface JobRepository extends MongoRepository<JobItems, String> {
	@Query("{title:'?0'}")
    JobItems findItemByName(String title);
    
    @Query(value="{category:'?0'}", fields="{'title' : 1, 'location' : 1}")
    List<JobItems> findAll(String category);
    
    public long count();
}
