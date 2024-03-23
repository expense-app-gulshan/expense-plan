package com.gulshan.expenseplan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlanResponse {

    private String  id;
    private String name;
    private String description;
    private double amount;
    private LocalDate startDate;
    private LocalDate emdDate;
}
