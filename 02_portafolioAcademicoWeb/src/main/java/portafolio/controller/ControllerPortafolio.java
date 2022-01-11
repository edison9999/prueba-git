package portafolio.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import portafolio.model.dto.Estudiante;
import portafolio.model.manager.ManagerPortafolio;

@Named
@SessionScoped
public class ControllerPortafolio implements Serializable{

	private static final long serialVersionUID = 1L;
	@EJB
	private ManagerPortafolio managerPortafolio;
	private List<Estudiante>listado;
	private int promedioEdad;
	
	
	public void actionListenerConsultar() {
		listado=managerPortafolio.consultarListadoEstudiante();
		promedioEdad = managerPortafolio.promedioEdadEstudiantes(listado);
	}

	public List<Estudiante> getListado() {
		return listado;
	}

	public void setListado(List<Estudiante> listado) {
		this.listado = listado;
	}

	public int getPromedioEdad() {
		return promedioEdad;
	}

	public void setPromedioEdad(int promedioEdad) {
		this.promedioEdad = promedioEdad;
	}
	
	
	
}
