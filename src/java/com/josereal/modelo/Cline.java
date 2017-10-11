package com.josereal.modelo;

import com.josereal.utilidades.Fecha;


public class Cline {
	
	private String server;
	private String port;
	private String usuario;
	private String pass;
	private Fecha fechCreacion;
	
	public Cline() {
		super();
	}

        public Cline(String server, String port, String usuario, String pass) {
            this.server = server;
            this.port = port;
            this.usuario = usuario;
            this.pass = pass;
        }

        
        
	public Cline(String server, String port, String usuario, String pass, Fecha fechCreacion) {
		super();
		this.server = server;
		this.port = port;
		this.usuario = usuario;
		this.pass = pass;
		this.fechCreacion = fechCreacion;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Fecha getFechCreacion() {
		return fechCreacion;
	}

	public void setFechCreacion(Fecha fechCreacion) {
		this.fechCreacion = fechCreacion;
	}

	@Override
	public String toString() {
		return server + ";" + port + ";" + usuario + ";" + pass + ";" + fechCreacion;
	}
	
	public String toGeneral() {
		return "C: "+server+" "+port+" "+usuario+" "+pass;
	}
	
	public String toHadu() {
		return "server=CCCam:"+server+":"+port+":0:"+usuario+":"+pass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((port == null) ? 0 : port.hashCode());
		result = prime * result + ((server == null) ? 0 : server.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cline other = (Cline) obj;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (port == null) {
			if (other.port != null)
				return false;
		} else if (!port.equals(other.port))
			return false;
		if (server == null) {
			if (other.server != null)
				return false;
		} else if (!server.equals(other.server))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	

}
