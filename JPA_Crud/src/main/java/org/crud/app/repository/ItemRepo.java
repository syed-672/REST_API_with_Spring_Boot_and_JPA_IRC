package org.crud.app.repository;

import java.util.List;

import org.crud.app.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ItemRepo extends JpaRepository<ItemModel, Integer> {
	ItemModel findByusername(String username);
@Modifying

@Query("update ItemModel i set i.itemName=?1 where i.itemId=?2")

public int UpdateItemById(String itemName,int itemId);
@Modifying
@Query(value="select * from item_model ",nativeQuery=true)

public List<ItemModel> GetAll();

@Modifying
@Query("delete from ItemModel i where i.username=?1")

public int DeleteItemByUsername(String username);
}