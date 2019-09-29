package com.netshoes.matchnet.modulos.separator.gateway;

import com.netshoes.matchnet.domain.sellerProducts.SellerProducts;
import com.netshoes.matchnet.modulos.separator.gateway.feign.json.ClusteredProducts;

import java.util.List;

/**
 * Created by Grazeffe on 29/09/19.
 * https://github.com/Grazeffe
 */

public interface SmartSeparatorGateway {

    List<ClusteredProducts> startSeparatorEngine(List<SellerProducts> sellerProducts);
}