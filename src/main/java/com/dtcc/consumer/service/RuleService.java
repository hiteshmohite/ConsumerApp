package com.dtcc.consumer.service;

import com.dtcc.consumer.model.OrderRequest;
import com.dtcc.consumer.repository.ApplicationRepository;
import com.dtcc.ruleengine.engine.RuleExecutorEngine;
import com.dtcc.ruleengine.model.Metadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RuleService {

    @Autowired
    private ApplicationRepository repository;

    private RuleExecutorEngine<OrderRequest> engine;
    private Metadata metadata;

    public RuleService() {

        engine = new RuleExecutorEngine();
        metadata  = new Metadata();
    }

    public void executeRules()
    {
        repository.setInputList();
        List<OrderRequest> orderRequests = repository.getInputList();
        metadata.setKieSessionName("TradingRules");
        metadata.setFileName("No File");

        for (OrderRequest orderRequest : orderRequests) {
            System.out.println(orderRequest);
        }

        engine.execute(orderRequests, metadata);

        for (OrderRequest orderRequest : orderRequests) {
            System.out.println(orderRequest);
        }
    }
}
