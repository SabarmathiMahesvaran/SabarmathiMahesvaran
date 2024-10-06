package com.csc.collegeServices;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class CollegeEntity {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="StudentID")
	    private Long id;
	    @Column(name="StudentFirstName")
	    private String firstName;
	    @Column(name="StudentLastName")
	    private String lastName;
	    @Column(name="StudentEmail")
	    private String email;
	    @Column(name="CollegeDepartment")
	    private String department;
	    @Column(name="CollegeDescription")
	    private String description;
	    @Column(name="CollegeSchedule")
	    private String schedule;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getSchedule() {
			return schedule;
		}
		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		
		public String getDepartment() {
			return department;
		}
		public String getDescription() {
			return description;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", department=" + department + ", description=" + description + ", schedule=" + schedule + "]";
		}
}
		
	