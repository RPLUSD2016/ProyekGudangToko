/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.KirimBarangHelper;
import java.sql.Date;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.TabelKirimBarang;

/**
 * REST Web Service
 *
 * @author Windows
 */
@Path("KirimBarang")
public class KirimBarangResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of KirimBarangResource
     */
    public KirimBarangResource() {
    }

    /**
     * Retrieves representation of an instance of service.KirimBarangResource
     *
     * @param idbarang
     * @param namaBarang
     * @param jumlahBarang
     * @param tanggal
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getKirimBarang(
            @QueryParam("idbarang") Integer idbarang,
            @QueryParam("namaBarang") String namaBarang,
            @QueryParam("jumlahBarang") Integer jumlahBarang,
            @QueryParam("tanggal") Date tanggal) {
        //TODO return proper representation object
        KirimBarangHelper helper = new KirimBarangHelper();
//        TabelKirimBarang kirim = (TabelKirimBarang) helper.getAllKirimBarang();
        List<TabelKirimBarang> list = helper.getAllKirimBarang();
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
     * PUT method for updating or creating an instance of KirimBarangResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @POST
    @Path("simpan")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response simpanKirimBarang(String data) {
        Gson gson = new Gson();
        TabelKirimBarang kirim = gson.fromJson(data, TabelKirimBarang.class);
        KirimBarangHelper help = new KirimBarangHelper();
        help.kirimBarang(kirim.getIdtoko(), kirim.getNamaBarang(), kirim.getJumlahBarang(), (Date) kirim.getTanggal());
        return Response.status(200).entity(kirim).build();
    }
}
