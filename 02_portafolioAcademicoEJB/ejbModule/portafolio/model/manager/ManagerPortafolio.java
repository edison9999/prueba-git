package portafolio.model.manager;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import portafolio.model.dto.Estudiante;

/**
 * Session Bean implementation class ManagerPortafolio
 */
@Stateless
@LocalBean
public class ManagerPortafolio {

	/**
	 * Default constructor.
	 */
	public ManagerPortafolio() {
		// TODO Auto-generated constructor stub
	}

	public List<Estudiante> consultarListadoEstudiante() {
		List<Estudiante> listado = new ArrayList<Estudiante>();
		listado.add(new Estudiante("100", "Romel", "Encalda", 32));
		listado.add(new Estudiante("101", "Luisa", "Andrade", 19));
		listado.add(new Estudiante("102", "José", "Candelario", 20));
		listado.add(new Estudiante("103", "Susana", "Gómez", 18));
		listado.add(new Estudiante("104", "Arturo", "Suaréz", 18));
		return listado;
	}

	public int promedioEdadEstudiantes(List<Estudiante> listado) {
		if (listado == null || listado.size() == 0) {
			return 0;
		}
		int suma = 0;
		for (Estudiante e : listado) {
			suma += e.getEdad();
		}
		return suma / listado.size();

	}

}
