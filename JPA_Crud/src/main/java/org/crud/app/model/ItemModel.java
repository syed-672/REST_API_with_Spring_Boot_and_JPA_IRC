package org.crud.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ItemModel")
public class ItemModel {
	public ItemModel() {
		super();
	}
	
	@Id
	@Column(name = "item_id")
	private int itemId;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "quantity")
	private int quantity;

	@Column(name = "password")
	private String password;
	
	@Column(name = "username")
	private String username;
	
	public ItemModel(int itemId, String itemName, int quantity,String password,String username) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.password = password;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}

	@Override
	public String toString() {
		return "ItemModel [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + "]";
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn()
	private UserModel user;
	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

		
}