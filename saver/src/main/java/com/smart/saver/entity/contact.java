package com.smart.saver.entity;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class contact {

    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;
    @Column(length = 1000)
    private String description;
    private boolean favourite=false;
    private String websiteLink;
    private String linkedInLink;


   @ManyToOne 
    private User user;

 
     @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval = true)  
    private List<social_media> Links=new ArrayList<> ();
 
}
