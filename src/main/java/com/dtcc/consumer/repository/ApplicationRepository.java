package com.dtcc.consumer.repository;

import com.dtcc.consumer.model.OrderRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ApplicationRepository {


    private int inputSize;
    private List<OrderRequest> inputList;

    private String dataForPaymentType[] = {"CARD", "CASH", "CHEQUE", "APP TRANSFER"};
    private Integer dataForTotalPrice[] = {2000, 12000, 7000, 35000};


    public ApplicationRepository() {
        this.inputSize = 4;
        this.inputList = new ArrayList<>();
    }

    private List<OrderRequest> generateInstances()
    {
        OrderRequest orderRequest;
        for(int i = 0; i < inputSize; i++)
        {
            orderRequest = new OrderRequest();
            orderRequest.setOrderId(i+1);
            orderRequest.setPaymentType(dataForPaymentType[getRandomValue()]);
            orderRequest.setTotalPrice(dataForTotalPrice[getRandomValue()]);
            orderRequest.setDiscount(-1);


            System.out.println("Instance created");
            inputList.add(orderRequest);
            System.out.println("Instance Added");
        }
        return inputList;
    }

    public void setInputList() {
        this.inputList = generateInstances();
    }

    public List<OrderRequest> getInputList() {
        return inputList;
    }

    private int getRandomValue()
    {
        Random rand = new Random(); //instance of random class
        int upperbound = 4;
        //generate random values from 0-3
//        double double_random=rand.nextDouble();
//        float float_random=rand.nextFloat();
//        System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
//        System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
//        System.out.println("Random double value between 0.0 and 1.0 : "+double_random);
        return rand.nextInt(upperbound);
    }

}
