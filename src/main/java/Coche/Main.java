package Coche;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class Main {
	public static void main(String[] args) {

		try {
			String resource = "ConfiguracionIbatis.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);

			// Ahora insertamos con un Hashtable.

			/*
			 * Hashtable hashCoche = new Hashtable(); hashCoche.put("marca", "la marca");
			 * hashCoche.put("matricula", "x-2222-z"); hashCoche.put("fechaMatricula", new
			 * Date()); sqlMap.insert("insertCoche", hashCoche);
			 */

			// MODIFICAR

//			Integer claveCoche = new Integer(1);
//			Coche cocheModif = (Coche) sqlMap.queryForObject("getCoche", claveCoche);
//
//			cocheModif.setMarca("cambiada");
//			sqlMap.update("updateCoche", cocheModif);

			// ELIMINAR

			/*
			 * Integer claveCoche2 = new Integer(1); Coche coche2 = (Coche)
			 * sqlMap.queryForObject("getCoche", claveCoche2);
			 * 
			 * List<Coche> coches = sqlMap.queryForList("getCoches", null); for (Coche c :
			 * coches) { System.out.println(c); }
			 * 
			 * Map hashCoche2 = (Map) sqlMap.queryForObject("getHashCoche", 3);
			 * 
			 * sqlMap.delete("removeCoche", 2);
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
