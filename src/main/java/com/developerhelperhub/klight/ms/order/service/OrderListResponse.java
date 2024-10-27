package com.developerhelperhub.klight.ms.order.service;

import lombok.Builder;

import java.util.List;


public record OrderListResponse(List<OrderResponse> items) {
    @Builder
    public OrderListResponse {}
}
