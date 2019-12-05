package com.base.Republic.model;

import java.util.List;

public class ListApResponse {
	
	public Beneficiary beneficiary;
	public List<Beneficiary> getListaOgranaka() {
		return listaOgranaka;
	}
	public void setListaOgranaka(List<Beneficiary> listaOgranaka) {
		this.listaOgranaka = listaOgranaka;
	}
	public List<Beneficiary> listaOgranaka;
	public String errorDescription;
	
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
	
	
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	
	

}
