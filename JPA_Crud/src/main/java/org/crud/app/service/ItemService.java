package org.crud.app.service;

import java.util.List;
import java.util.Optional;

import org.crud.app.model.ItemModel;
import org.crud.app.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
    ItemRepo i_repo;
	
	public ItemModel saveInfo(ItemModel i)
	{
		return i_repo.save(i);
	}
	
	public List<ItemModel> getInfo()
	{
		return i_repo.findAll();
	}
	
	
	public ItemModel updateInfo(ItemModel iu)
	{
		return i_repo.save(iu);
	}
	public void deleteInfo(int item_id)
	{
		i_repo.deleteById(item_id);
	}
	

}