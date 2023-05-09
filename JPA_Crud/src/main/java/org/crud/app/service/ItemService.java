package org.crud.app.service;

import java.util.List;
import java.util.Optional;

import org.crud.app.model.ItemModel;
import org.crud.app.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
public class ItemService {
	
	@Autowired
	public ItemRepo repo;
	
	public ItemModel saveData(ItemModel i){
		return repo.save(i);
	}

	public String updateData(ItemModel i, int id){
		ItemModel item = repo.findById(id).orElse(null);
		if(item != null){
			
			item.setItemName(i.getItemName());
			item.setQuantity(i.getQuantity());
			repo.saveAndFlush(item);
			
			return "The details of the item was updated";
		}
		else{
			return "The item is not present in the database to update the value";
		}
	}
	
	public List<ItemModel> getAllData(){
		return repo.findAll();
	}
	
	public Optional<ItemModel> getDataById( int id){
		return repo.findById(id);
	}
	
	public String deleteData(int id){
		ItemModel item = repo.findById(id).orElse(null);
		if(item != null) {
			repo.deleteById(id);
			return "The item " + item.toString() + " is deleted successfully";
		}
		else {
			return "The item " + item.toString() + "  is not present in the database to delete";
		}
	}
	
	public String deleteAllData()
	{
		repo.deleteAll();
		return "All the items in the database was deleted";
	}
	
	public List<ItemModel> sortDescending(String field){	
		return repo.findAll(Sort.by(Direction.DESC, field));
	}
	
	public List<ItemModel> sortAscending(String field){	
		return repo.findAll(Sort.by(Direction.ASC, field));
	}

	public List<ItemModel> pagination(int pageNumber, int pageSize){
		Page<ItemModel> i = repo.findAll(PageRequest.of(pageNumber, pageSize));
		return i.getContent();
	}
	
	public List<ItemModel> paginationAndSorting(int pageNumber, int pageSize, String column_name){
		Page<ItemModel> i = repo.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(column_name).ascending()));
		return i.getContent();
	}public String logincheckData(String username,String password)

	{

		ItemModel user=repo.findByusername(username);

		if(user == null)

		{

			return "No User Found/nPlease Try Again!!!!";

		}
		else

		{

			if(user.getPassword().equals(password))

			{

				return "Login Succesful";

			}

			else

			{

				return "Login Failed";

			}

		}

	}
	@Transactional

	 public int update(String name,int id)

	 {

		 return repo.UpdateItemById(name,id);

	 }
	@Transactional
	public List<ItemModel> get()
	{
		return repo.GetAll();
	}
	
	@Transactional
	public int delete(String username)
	{
		return repo.DeleteItemByUsername(username);
	}


	
}