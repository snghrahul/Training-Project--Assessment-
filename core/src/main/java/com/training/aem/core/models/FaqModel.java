package com.training.aem.core.models;


import com.training.aem.core.services.FaqService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

@Model(adaptables = Resource.class)
public class FaqModel {

    @OSGiService
    private FaqService faqService;

    public void addFaq(String question , String answer){
        faqService.addFaq(question,answer);
    }
}
