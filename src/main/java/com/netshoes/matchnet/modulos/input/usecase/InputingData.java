package com.netshoes.matchnet.modulos.input.usecase;

import com.netshoes.matchnet.domain.SellerProducts;
import com.netshoes.matchnet.gateway.mongo.MongoGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Grazeffe on 28/09/19.
 * https://github.com/Grazeffe
 */

@Component
@RequiredArgsConstructor
public class InputingData {

    private final MongoGateway mongoGateway;

    public void execute(List<SellerProducts> sellerProducts) {
        mongoGateway.cadastrarTodos(sellerProducts);
    }
}