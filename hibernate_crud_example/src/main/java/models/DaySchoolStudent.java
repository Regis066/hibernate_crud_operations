package models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("day_school")
public class DaySchoolStudent extends Student {
	private Double busPayment;

	@Embedded
	private Address address;

	public DaySchoolStudent() {

	}

	public Double getBusPayment() {
		return busPayment;
	}

	public void setBusPayment(Double busPayment) {
		this.busPayment = busPayment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
