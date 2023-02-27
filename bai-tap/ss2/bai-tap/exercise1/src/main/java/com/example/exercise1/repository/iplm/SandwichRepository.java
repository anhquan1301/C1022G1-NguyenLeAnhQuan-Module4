package com.example.exercise1.repository.iplm;

import com.example.exercise1.model.SandwichCondiment;
import com.example.exercise1.repository.ISandwichRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SandwichRepository implements ISandwichRepository {
  private static List<SandwichCondiment> sandwichCondimentList = new ArrayList<>();
//    static {
//        sandwichCondimentList.add(new SandwichCondiment("Lettuce"));
//        sandwichCondimentList.add(new SandwichCondiment("Tomato"));
//        sandwichCondimentList.add(new SandwichCondiment("Mustard"));
//        sandwichCondimentList.add(new SandwichCondiment("Sprouts"));
//    }
    @Override
    public List<SandwichCondiment> findAll(String condiment) {
        SandwichCondiment sandwichCondiment = new SandwichCondiment(condiment);
        sandwichCondimentList.add(sandwichCondiment);
        return sandwichCondimentList;
    }
}
