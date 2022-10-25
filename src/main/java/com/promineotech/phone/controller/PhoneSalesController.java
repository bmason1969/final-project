package com.promineotech.phone.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.phone.entity.Phone;
import com.promineotech.phone.entity.PhoneModel;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;


@RequestMapping("/phones")
  @OpenAPIDefinition(info = @Info(title = "phone Sales Service"),
servers = {@Server(url = "http://localhost: 8080", description = "Local server.")})

public interface PhoneSalesController {
  
 // List<Phone> fetchPhones(Phone model);
  
//@formatter: off
 @Operation(
     summary = "Returns a list of Phones",
     description = "Returns a list of Phones given an optional model",
     responses = {
         @ApiResponse(
             responseCode = "200", 
             description = "A list of Phones is returned",
             content = @Content(
             mediaType = "application/json",
             schema = @Schema(implementation = Phone.class ))),
         @ApiResponse(
             responseCode = "400", 
             description = "The request parameters are invalid",
             content = @Content(mediaType = "application/json")),
         @ApiResponse(
             responseCode = "404",
             description = "No Phones were found with the input criteria",
             content = @Content(mediaType = "application/json")),
         @ApiResponse(
             responseCode = "500", 
             description = "An unplanned error occurred",
             content = @Content(mediaType = "application/json"))
     },
         
     parameters = {
         
         @Parameter(
             name = "model",
             allowEmptyValue = false,
             required = false,
             description = "The model name (i.e., 'IPhone 14')")})

@GetMapping
@ResponseStatus(code = HttpStatus.OK)
List<Phone> fetchPhones( 
    @RequestParam (required = false)
    PhoneModel model); 
// @formatter: on
}
    
     


