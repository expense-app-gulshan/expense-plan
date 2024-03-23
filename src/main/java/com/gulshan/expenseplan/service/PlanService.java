package com.gulshan.expenseplan.service;

import com.gulshan.expenseplan.dto.PlanRequest;
import com.gulshan.expenseplan.dto.PlanResponse;
import com.gulshan.expenseplan.model.Plan;
import com.gulshan.expenseplan.repository.PlanRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlanService {

    private final PlanRepository planRepository;
    public void createPlan(PlanRequest planRequest){
        Plan plan = Plan.builder().name(planRequest.getName())
                .description(planRequest.getDescription())
                .amount(planRequest.getAmount())
                .startDate(planRequest.getStartDate())
                .emdDate(planRequest.getEmdDate()).
                build();

        planRepository.save(plan);
        log.info("Plan {} is saved", plan.getId());
    }

    public List<PlanResponse> getAllPlans() {
        List<Plan> allPlan = planRepository.findAll();
         return allPlan.stream().map(this::mapToPlan).toList();
    }

    private PlanResponse mapToPlan(Plan plan) {
        return PlanResponse.builder()
                .id(plan.getId())
                .name(plan.getName())
                .description(plan.getDescription())
                .amount(plan.getAmount())
                .startDate(plan.getStartDate())
                .emdDate(plan.getEmdDate())
                .build();
    }
}
