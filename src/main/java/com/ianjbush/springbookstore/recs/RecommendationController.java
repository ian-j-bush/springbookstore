package com.ianjbush.springbookstore.recs;

import org.springframework.stereotype.Controller;

@Controller
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController( RecommendationService recommendationService ) {
        this.recommendationService = recommendationService;
    }
}
