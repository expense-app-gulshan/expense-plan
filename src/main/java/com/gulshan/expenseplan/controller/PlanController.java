package com.gulshan.expenseplan.controller;

import com.gulshan.expenseplan.dto.PlanRequest;
import com.gulshan.expenseplan.dto.PlanResponse;
import com.gulshan.expenseplan.service.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plan")
@RequiredArgsConstructor
public class PlanController {


    private final PlanService planService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPlan(@RequestBody PlanRequest planRequest){

        planService.createPlan(planRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PlanResponse> getAllPlans(){

        return planService.getAllPlans();
    }
}
