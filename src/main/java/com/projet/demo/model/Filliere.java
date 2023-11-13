package com.projet.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Filliere {
 @Id
@GeneratedValue(strategy =GenerationType.AUTO)
  private Long id;
  @Column(nullable = false,name ="designation")
  private String libelleFilliere;
 @OneToOne
 Departement idDepart;
}
