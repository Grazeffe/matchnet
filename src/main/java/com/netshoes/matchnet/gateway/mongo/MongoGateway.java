package com.netshoes.matchnet.gateway.mongo;

import com.netshoes.matchnet.domain.SellerProducts;

import java.util.List;

/**
 * Created by Grazeffe on 28/09/19.
 * https://github.com/Grazeffe
 */

public interface MongoGateway {

    void cadastrarTodos(List<SellerProducts> sellerProducts);
}