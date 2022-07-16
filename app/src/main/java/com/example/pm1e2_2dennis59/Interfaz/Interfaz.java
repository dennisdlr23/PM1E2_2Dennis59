package com.example.pm1e2_2dennis59.Interfaz;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Path;
public class Interfaz {
    String Ruta0  = "/posts";
    String Ruta1 = "/posts/{valor}";

    @GET(Ruta0)
    public Call<List<Usuarios>> getUsuarios();

    @GET(Ruta1)
    public Call<Usuarios> getUsuario(@Path("valor") String valor);
}

