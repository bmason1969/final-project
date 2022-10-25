package com.promineotech.phone;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import com.promineotech.ComponentScanMarker;
@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class})

public class PhoneSales implements CommandLineRunner{

  public static void main(String[] args) {
    SpringApplication.run(PhoneSales.class, args);
    
    }

  @Override
  public void run(String... args) throws Exception {
   }
    

    
  }

