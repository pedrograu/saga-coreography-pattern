package com.grau.saga.order.config;

import com.grau.saga.commons.event.PaymentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class EventConsumerConfig {

    @Autowired
    private OrderStatusUpdatedHandler handler;

    @Bean
    public Consumer<PaymentEvent> paymentEventConsumer() {
        // Listen payment-event topic
        // will check payment status
        // if payment status completed -> complete the order
        // if payment status failed -> cancel the order
        return (payment) -> handler.updatedOrder(payment.getPaymentRequestDto().getOrderId(),
                po -> po.setPaymentStatus(payment.getPaymentStatus()));
    }
}
