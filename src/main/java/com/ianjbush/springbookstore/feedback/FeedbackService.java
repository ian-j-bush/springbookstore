package com.ianjbush.springbookstore.feedback;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public FeedbackService( FeedbackRepository feedbackRepository ) {
        this.feedbackRepository = feedbackRepository;
    }

    @Transactional
    public void saveFeedback(Feedback feedback ) {
        feedback.setSubmissionDate(LocalDateTime.now());
        feedbackRepository.save(feedback);
    }
}
