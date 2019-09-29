package com.netshoes.matchnet.modulos.separator.gateway.feign.json;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Grazeffe on 29/09/19.
 * https://github.com/Grazeffe
 */
@Data
@Document
public class ClusteredProducts {

    @Id
    private String clusterId;
    private List<Products> products;
}