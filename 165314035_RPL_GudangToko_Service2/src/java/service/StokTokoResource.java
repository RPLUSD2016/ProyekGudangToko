/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.StokBarangTokoHelper;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.TabelStokBarangToko;

/**
 * REST Web Service
 *
 * @author Windows
 */
@Path("StokToko")
public class StokTokoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StokTokoResource
     */
    public StokTokoResource() {
    }

    /**
     * Retrieves representation of an instance of service.StokTokoResource
     *
     * @param idtoko
     * @param idbarang
     * @param hargaBarang
     * @param namaBarang
     * @param jumlahBarang
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStokToko(
            @QueryParam("idtoko") int idtoko,
            @QueryParam("idbarang") Integer idbarang,
            @QueryParam("namaBarang") String namaBarang,
            @QueryParam("jumlahBarang") int jumlahBarang,
            @QueryParam("hargaBarang") int hargaBarang) {

        StokBarangTokoHelper helper = new StokBarangTokoHelper();
//        TabelStokBarangToko stoktk = (TabelStokBarangToko) helper.getAllBarangToko();
        List<TabelStokBarangToko> list = helper.getAllBarangToko();
        Gson gson = new Gson();
        return Response.status(200)
                .entity(gson.toJson(list))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "2")
                .header("Access-Preflight-Maxage", "2")
                .build();
    }

    /**
     * PUT method for updating or creating an instance of StokTokoResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @POST
    @Path("tambahStokToko")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response tambahStokToko(String data) {
        Gson gson = new Gson();
        TabelStokBarangToko stok = gson.fromJson(data, TabelStokBarangToko.class);
        StokBarangTokoHelper help = new StokBarangTokoHelper();
        help.tambahStokToko(stok.getIdtoko(), stok.getNamaBarang(), stok.getJumlahBarang(), stok.getHargaBarang());
        return Response.status(200).entity(stok).build();
    }
    
    @GET
    @Path("cariStokIDToko")
    @Produces(MediaType.APPLICATION_JSON)
    public Response cariStokIDToko(@QueryParam("idtoko") int idtoko){
        StokBarangTokoHelper help = new StokBarangTokoHelper();
        List<TabelStokBarangToko> list = help.cariStokToko(idtoko);
//        TabelStokBarangToko toko = help.cariStokToko(idtoko);
        Gson gson = new Gson();
        
        return Response.status(200).entity(gson.toJson(list))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "2")
                .header("Access-Preflight-Maxage", "2")
                .build();
    }
    
    @GET
    @Path("cariNamaBarang")
    @Produces(MediaType.APPLICATION_JSON)
    public Response cariNamaBarang(@QueryParam("namaBarang") String namaBarang) {
        StokBarangTokoHelper help = new StokBarangTokoHelper();
        List<TabelStokBarangToko> list = help.cariNamaBarang(namaBarang);
        Gson gson = new Gson();
        
        return Response.status(200).entity(gson.toJson(list))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "2")
                .header("Access-Preflight-Maxage", "2")
                .build(); 
    }
}
