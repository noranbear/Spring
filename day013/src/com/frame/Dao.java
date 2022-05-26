/**
 * 
 */
package com.frame;

import java.util.List;

/**
 * @author noranbear
 * @date 2022. 5. 26.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			AUTHOR				   NOTE
 * ---------------------------------------------------------
 *  2022. 5. 26.		noranbear			    Fisrt
 *
 * =========================================================
 */
public interface Dao<K, V> {

	public void insert(V v);
	public void delete(K k);
	public void update(V v);
	public V select(K k);
	public List<V> select();
}
