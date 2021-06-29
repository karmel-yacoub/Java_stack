package com.example.Events.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@NotBlank(message = "• First Name field must not be blank")
	@Size(min = 2, message = "• First name must be 2 characters or more")
	private String name;

	@NotNull
	@FutureOrPresent
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	@NotNull
	@Size(min = 5, max = 100)
	private String location;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	name="user_event",
	joinColumns=@JoinColumn(name="event_id"),
	inverseJoinColumns= @JoinColumn(name="user_id")
	)
private List<User> joinedUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="state_id")
	private State state;
	
	@OneToMany(mappedBy="event", fetch = FetchType.LAZY)
	private List<Message> message;

	public Event( String name, Date date, String location,State state) {
		this.name = name;
		this.date = date;
		this.location = location;
		this.state=state;
	}

	public Event() {
		
	}
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getJoinedUser() {
		return joinedUser;
	}

	public void setJoinedUser(List<User> joinedUser) {
		this.joinedUser = joinedUser;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
