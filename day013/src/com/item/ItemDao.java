package com.item;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
import com.vo.ItemVo;

/**
 * @author noranbear
 * @date 2022. 5. 26.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 5. 26.		noranbear			    Fisrt
 *
 * =========================================================
 */
public class ItemDao implements Dao<String, ItemVo> {

	@Override
	public void insert(ItemVo v) {
		System.out.println("Inserted: "+ v);
	}

	@Override
	public void delete(String k) {
		System.out.println("Deleted: "+ k);
	}

	@Override
	public void update(ItemVo v) {
		System.out.println("Updated: "+ v);
	}

	@Override
	public ItemVo select(String k) {
		ItemVo it = new ItemVo(k,"pants", 40000);
		return it;
	}

	@Override
	public List<ItemVo> select() {
		ArrayList<ItemVo> li = new ArrayList<ItemVo>();
		ItemVo it1 = new ItemVo("id01","t-shirt",20000);
		ItemVo it2 = new ItemVo("id02","jeans",56000);
		li.add(it1);
		li.add(it2);
		li.add(new ItemVo("id03","Bear Figure",23000));
		li.add(new ItemVo("id04","ThunderBear Keyring",12000));
		li.add(new ItemVo("id05","jaket",70000));
		
		return li;
	}

}
