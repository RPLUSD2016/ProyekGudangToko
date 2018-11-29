/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.TransaksiHelper;
import java.sql.Date;
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
import pojos.TabelTransaksi;

/**
 * REST Web Service
 *
 * @author Windows
 */
@Path("transaksi")
public class TransaksiResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TransaksiResource
     */
    public TransaksiResource() {
    }

    /**
     * Retrieves representation of an instance of service.TransaksiResource
     * @param idbarang
     * @param namaBarang
     * @param hargaBarang
     * @param jumlahBarang
     * @param hargaTotal
     * @param tanggal
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTransaksi(
            @QueryParam("idbarang") Integer idbarang,
            @QueryParam("idtoko") int idtoko,
            @QueryParam("namaBarang") String namaBarang, 
            @QueryParam("hargaBarang") int hargaBarang, 
            @QueryParam("jumlahBarang") int jumlahBarang, 
            @QueryParam("hargaTotal") int hargaTotal,
            @QueryParam("tanggal") Date tanggal) {
        //TODO return proper representation object
        TransaksiHelper helper = new TransaksiHelper();
//        TabelTransaksi trans = (TabelTransaksi) helper.getAllTransaksi();
        List<TabelTransaksi> list = helper.getAllTransaksi();
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
     * PUT method for updating or creating an instance of TransaksiResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Path("simpan")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response simpanTransaksi(String data) {
        Gson gson = new Gson();
        TabelTransaksi trans = gson.fromJson(data, TabelTransaksi.class);
        TransaksiHelper help = new TransaksiHelper();
        help.transaksiBaru(trans.getIdtoko(), trans.getNamaBarang(), trans.getHargaBarang(), trans.getJumlahBarang(), 
                trans.getHargaTotal(), (Date) trans.getTanggal());
        return Response.status(200).entity(trans).build();
    }
    
    @GET
    @Path("cariTransaksi")
    @Produces(MediaType.APPLICATION_JSON)
    public Response cariTransaksi(@QueryParam("idtoko") int idtoko) {
        TransaksiHelper help = new TransaksiHelper();
        List<TabelTransaksi> list = help.cariTransaksi(idtoko);
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
        TransaksiHelper help = new TransaksiHelper();
        List<TabelTransaksi> list = help.cariNamaBarang(namaBarang);
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
