package models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("boarding_school")
public class BoardingSchoolStudent extends Student {

	@Embedded
	private Address address;

	public BoardingSchoolStudent() {

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
