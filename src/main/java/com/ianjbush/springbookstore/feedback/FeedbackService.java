package com.ianjbush.springbookstore.feedback;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public FeedbackService( FeedbackRepository feedbackRepository ) {
        this.feedbackRepository = feedbackRepository;
    }

    @Transactional
    public void saveFeedback(Feedback feedback ) {
        feedbackRepository.save(feedback);
    }
}
