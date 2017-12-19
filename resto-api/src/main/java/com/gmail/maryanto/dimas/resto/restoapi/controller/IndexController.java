/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.maryanto.dimas.resto.restoapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dimmaryanto93
 */
@RestController
public class IndexController {

    @RequestMapping(
            path = "/halo",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    public String haloWorld() {
        return "{ \"nana\" : \"Dimas Maryanto\", "
                + "\"aplikasi\": \"Aplikasi Web Resto\""
                + "}";
    }

    @RequestMapping(
            path = "/hello",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    public String haloWorld(
            @RequestParam(name = "nama_lengkap") String nama,
            @RequestParam(name = "aplikasi")String aplikasi) {
        return "{ \"nana\" : \"" + nama + "\", "
                + "\"aplikasi\": \""+aplikasi+"\""
                + "}";
    }
    
    @GetMapping(path = "/halo/{nama}")
    public String haloWorld(
            @PathVariable("nama") String namaLengkap ){
        return "{ \"nana\" : \"" + namaLengkap + "\", "
                + "\"aplikasi\": \"Spring WEB MVC\""
                + "}";
    }

}
