package br.com.pizzaplaza.authservice.controller;

import br.com.pizzaplaza.authservice.service.SellerService;
import br.com.pizzaplaza.entity.systemactor.Seller;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;

@ApplicationScoped
@Path("seller")
public class SellerController {

    @Inject
    SellerService sellerService;

    @GET
    public Response get() {
//        List<Seller> result = sellerService.findAll();

        return Response.ok().build();
    }
}
