package com.gary.camunda.controller;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamundaBPMController {

    @GetMapping("/executetask")
    public String execute() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = processEngine.getRuntimeService().createProcessInstanceByKey("hello-id");//"first-javainuse");
        instance.executeWithVariablesInReturn();
        return "Execute Camunda BPMN Task Successfully";
    }

    @GetMapping("/executeOrderPaymentTask")
    public String executeOrderPayment() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = processEngine.getRuntimeService().createProcessInstanceByKey("order-payment");
        instance.executeWithVariablesInReturn();
        return "Execute Camunda BPMN Task Successfully";
    }
    @GetMapping("/executeOrderPaymentService")
    public String executeOrderPaymentService() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = processEngine.getRuntimeService().createProcessInstanceByKey("order-payment-service");
        instance.executeWithVariablesInReturn();
        return "Execute Camunda BPMN Task Successfully";
    }
    @GetMapping("/executeOrderPaymentServiceExpression")
    public String executeOrderPaymentServiceExpression() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        ProcessInstantiationBuilder instance = processEngine.getRuntimeService().createProcessInstanceByKey("order-payment-service-expression");
        instance.executeWithVariablesInReturn();
        return "Execute Camunda BPMN Task Successfully";
    }


}
