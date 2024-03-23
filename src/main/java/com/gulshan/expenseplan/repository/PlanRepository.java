package com.gulshan.expenseplan.repository;

import com.gulshan.expenseplan.model.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanRepository extends MongoRepository<Plan, String> {

}
