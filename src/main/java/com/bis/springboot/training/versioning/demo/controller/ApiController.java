package com.bis.springboot.training.versioning.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "/api" , produces="application/apiversion-v1+json")
    public String apiWithContentTypeV1() {
        return "called API with the content type with V1!";
    }

    @GetMapping(value = "/api" , produces="application/apiversion-v2+json")
    public String apiWithContentTypeV2() {
        return "called API with the content type V2!";
    }

    @GetMapping(value = "/api" , headers="version=1")
    public String apiWithHeadersV1() {
        return "called API with the apiWithHeadersV1!";
    }

    @GetMapping(value = "/api" , headers="version=2")
    public String apiWithHeadersV2() {
        return "called API with the apiWithHeadersV2!";
    }

    @GetMapping(value = "/api" , params="version=1")
    public String apiWithParameterV1() {
        return "called API with the apiWithParameterV1!";
    }

    @GetMapping(value = "/api" , params="version=2")
    public String apiWithParamsV2() {
        return "called API with the apiWithParamsV2!";
    }

    @GetMapping(value = "/api/v1")
    public String apiV1() {
        return "called API with /v1/api!";
    }

    @GetMapping("/api/v2")
    public String apiV2() {
        return "called API with /v2/api!";
    }

  }
