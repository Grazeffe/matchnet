package com.netshoes.matchnet.modulos.separator.gateway.feign;

import com.netshoes.matchnet.modulos.separator.gateway.feign.json.ClusteredProducts;
import com.netshoes.matchnet.modulos.separator.gateway.feign.json.SeparatorRequestBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by Grazeffe on 29/09/19.
 * https://github.com/Grazeffe
 */
@FeignClient(name = "ProductSpliteratorFeignClient",
        url = "http://10.0.64.255:5001")
public interface ProductSpliteratorFeignClient {

    @PostMapping(value = "/sellerProducts",
            produces = APPLICATION_JSON_VALUE)
    List<ClusteredProducts> startSeparatorEngine(@RequestBody final SeparatorRequestBody requestBody);
}