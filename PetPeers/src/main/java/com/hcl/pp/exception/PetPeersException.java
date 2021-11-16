package com.hcl.pp.exception;

public class PetPeersException extends Exception {

	private static final long serialVersionUID = -2413389843675856698L;

	private String petPeersMessage;

	public PetPeersException(String customMessage) {
		super();
		this.petPeersMessage = customMessage;
	}

	public String getCustomMessage() {
		return petPeersMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.petPeersMessage = customMessage;
	}

	@Override
	public String getMessage() {
		return petPeersMessage;
	}

}
