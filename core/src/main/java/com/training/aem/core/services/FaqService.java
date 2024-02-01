package com.training.aem.core.services;

import com.training.aem.core.models.Faq;

import java.util.List;

public interface FaqService {
    public void addFaq(String question, String answer);
    public List<Faq> getFaqs();
}
