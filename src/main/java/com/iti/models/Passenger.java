package com.iti.models;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name = "PASSENGERS")
@SecondaryTable(name = "ADDRESSES",
		pkJoinColumns =@PrimaryKeyJoinColumn(name="PASSENGER_ID",referencedColumnName = "PASSENGER_ID"))
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PASSENGER_ID")
	private int id;
	private String name;
	@Column(name = "ADDRESS",columnDefinition = "varchar(50) not null",table = "ADDRESSES")
	private String address;
	
	
	
}
