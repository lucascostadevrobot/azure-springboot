package com.projeto.azure.spring.springbootjwt.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter @NoArgsConstructor
public class UserData implements Serializable {

    //Variaveis da nossa classe UserData
   private String userName;
   private String password;



}
