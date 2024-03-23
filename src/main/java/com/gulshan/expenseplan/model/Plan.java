package com.gulshan.expenseplan.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "plan")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Plan {

     @Id
     private String  id;
     private String name;
     private String description;
     private double amount;
     private LocalDate startDate;
     private LocalDate emdDate;

}
