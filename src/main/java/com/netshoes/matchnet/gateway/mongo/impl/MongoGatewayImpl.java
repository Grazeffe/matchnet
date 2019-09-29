package com.netshoes.matchnet.gateway.mongo.impl;

import com.netshoes.matchnet.domain.SellerProducts;
import com.netshoes.matchnet.gateway.mongo.MongoGateway;
import com.netshoes.matchnet.gateway.mongo.repository.SellerProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Grazeffe on 28/09/19.
 * https://github.com/Grazeffe
 */
@Component
@RequiredArgsConstructor
public class MongoGatewayImpl implements MongoGateway {

    private final SellerProductsRepository sellerProductsRepository;

    public void cadastrarTodos(List<SellerProducts> sellerProducts) {
        sellerProductsRepository.save(sellerProducts.get(0));
    }
}