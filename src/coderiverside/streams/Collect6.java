package coderiverside.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Collectors. Perform Grouping or Partitioning of the Stream Content
public class Collect6 {
    public static void main(String[] args) {
        List<Food> list = Arrays.asList(
                new Food("Cake", BigDecimal.valueOf(10), LocalDate.now()),
                new Food("Pizza", BigDecimal.valueOf(20), LocalDate.now()),
                new Food("Meal", BigDecimal.valueOf(15), LocalDate.now().plusDays(10))
        );

        Map<LocalDate, List<Food>> groups = list.stream()
                .collect(
                        Collectors.groupingBy(
                                p -> p.getBestBefore()
                        )
                );

        System.out.println("groups = " + groups);
    }
}
