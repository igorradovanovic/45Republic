package com.base.Republic.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "beneficiary")

public class Beneficiary implements Serializable {

	@Id
	/*
	@SequenceGenerator(name="beneficiary_ben_id_seq",
	sequenceName="beneficiary_ben_id_seq",
	allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator="beneficiary_ben_id_seq")*/
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ben_id")
	private Long benId;
	
				@Column(name = "ben_code")
		private String benCode;

			@Column(name = "ben_type")
		private String benType;

			@Column(name = "ben_registration_number")
		private String benRegistrationNumber;

			@Column(name = "ben_vat_id")
		private String benVatId;

			@Column(name = "ben_name_short")
		private String benNameShort;

			@Column(name = "ben_name_long")
		private String benNameLong;

			@Column(name = "ben_phone")
		private String benPhone;

			@Column(name = "ben_email")
		private String benEmail;

			@Column(name = "ben_name_short_legal")
		private String benNameShortLegal;

			@Column(name = "ben_name_long_legal")
		private String benNameLongLegal;

			@Column(name = "ben_name_short_legal_lat")
		private String benNameShortLegalLat;

			@Column(name = "ben_name_long_legal_lat")
		private String benNameLongLegalLat;

			@Column(name = "ben_status_legal")
		private String benStatusLegal;

			@Column(name = "ben_city_legal")
		private String benCityLegal;

			@Column(name = "ben_address_legal")
		private String benAddressLegal;

			@Column(name = "ben_phone_legal")
		private String benPhoneLegal;

			@Column(name = "ben_email_legal")
		private String benEmailLegal;

		@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ben_sys_create_date")
		private Date benSysCreateDate;

		@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ben_sys_update_date")
		private Date benSysUpdateDate;

		@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "ben_sys_sync_tst")
		private Date benSysSyncTst;

			@Column(name = "ben_status_input_data")
		private String benStatusInputData;

			@Column(name = "ben_bar_id")
		private Long benBarId;

			@Column(name = "ben_default_object")
		private Boolean benDefaultObject;

			@Column(name = "ben_code_last_used_number")
		private Long benCodeLastUsedNumber;

			

			@Column(name = "ben_unknown")
		private Boolean benUnknown;

			@Column(name = "ben_predominant_activity_code_legal")
		private String benPredominantActivityCodeLegal;

			@Column(name = "ben_predominant_activity_description_legal")
		private String benPredominantActivityDescriptionLegal;
			
			@Column(name = "ben_legal_type")
		private String benLegalType;
			
			@Column(name = "ben_searchkey")
		private String benSearchKey;
		
			@Column( name = "ben_object_has_additional_fields")
		private Boolean benOjectHasAdditionalFields;
			
			@Column( name = "ben_bond_size_legal")
		private String benBondSizeLegal;
			
			@Column(name = "ben_ers")
			private String benErs;
				
				@Column(name = "ben_jmbg_submitter")
			private String benJmbgSubmitter;
				
				@Column(name = "ben_name_submitter")
			private String benNameSubmitter;
				
				@Column(name = "ben_surname_submitter")
			private String benSurnameSubmitter;
				
				@Column(name = "ben_address_submitter")
			private String benAddressSubmitter;
				
				@Column(name = "ben_phone_submitter")
			private String benPhoneSubmitter;
				
				@Column(name = "ben_sex")
			private String benSex;
				
				@Column(name = "ben_jmbg_contractor")
			private String benJmbgContractor;
				
				@Column(name = "ben_name_contractor")
			private String benNameContractor;
				
				@Column(name = "ben_surname_contractor")
			private String benSurnameContractor;
				
				@Column(name = "ben_jmbg_agent")
			private String benJmbgAgent;
				
				@Column(name = "ben_name_agent")
			private String benNameAgent;
				
				@Column(name = "ben_surname_agent")
			private String benSurnameAgent;
				
				@Column(name = "ben_address_agent")
			private String benAddressAgent;
				
				@Column(name = "ben_phone_agent")
			private String benPhoneAgent;
				
				@Column(name = "ben_bpg_mesto")
			private String benBpgMesto;
				
				@Column(name = "ben_bpg_rbr")
			private String benBpgRbr;
				
				@Column(name = "ben_email_agent")
			private String benEmailAgent;


@Column(name="ben_lfr_id")
private Long legalForm;
		public Long getLegalForm(){
			 return legalForm;
		}

		public void setLegalForm(Long legalForm){
			 this.legalForm = legalForm;
		}



@ManyToOne(fetch=FetchType.LAZY) 
@JoinColumn(name="ben_ben_id")
private Beneficiary beneficiary;
		public Beneficiary getBeneficiary(){
			 return beneficiary;
		}

		public void setBeneficiary(Beneficiary beneficiary){
			 this.beneficiary = beneficiary;
		}


		public Long getBenId() {
			return benId;
		}

		public void setBenId(Long benId) {
			this.benId = benId;
		}

		public String getBenCode(){
			 return benCode;
		}

		public void setBenCode(String benCode){
			 this.benCode = benCode;
		}

		public String getBenType(){
			 return benType;
		}

		public void setBenType(String benType){
			 this.benType = benType;
		}

		public String getBenRegistrationNumber(){
			 return benRegistrationNumber;
		}

		public void setBenRegistrationNumber(String benRegistrationNumber){
			 this.benRegistrationNumber = benRegistrationNumber;
		}

		public String getBenVatId(){
			 return benVatId;
		}

		public void setBenVatId(String benVatId){
			 this.benVatId = benVatId;
		}

		public String getBenNameShort(){
			 return benNameShort;
		}

		public void setBenNameShort(String benNameShort){
			 this.benNameShort = benNameShort;
		}

		public String getBenNameLong(){
			 return benNameLong;
		}

		public void setBenNameLong(String benNameLong){
			 this.benNameLong = benNameLong;
		}

		public String getBenPhone(){
			 return benPhone;
		}

		public void setBenPhone(String benPhone){
			 this.benPhone = benPhone;
		}

		public String getBenEmail(){
			 return benEmail;
		}

		public void setBenEmail(String benEmail){
			 this.benEmail = benEmail;
		}

		public String getBenNameShortLegal(){
			 return benNameShortLegal;
		}

		public void setBenNameShortLegal(String benNameShortLegal){
			 this.benNameShortLegal = benNameShortLegal;
		}

		public String getBenNameLongLegal(){
			 return benNameLongLegal;
		}

		public void setBenNameLongLegal(String benNameLongLegal){
			 this.benNameLongLegal = benNameLongLegal;
		}

		public String getBenNameShortLegalLat(){
			 return benNameShortLegalLat;
		}

		public void setBenNameShortLegalLat(String benNameShortLegalLat){
			 this.benNameShortLegalLat = benNameShortLegalLat;
		}

		public String getBenNameLongLegalLat(){
			 return benNameLongLegalLat;
		}

		public void setBenNameLongLegalLat(String benNameLongLegalLat){
			 this.benNameLongLegalLat = benNameLongLegalLat;
		}

		public String getBenStatusLegal(){
			 return benStatusLegal;
		}

		public void setBenStatusLegal(String benStatusLegal){
			 this.benStatusLegal = benStatusLegal;
		}

		public String getBenCityLegal(){
			 return benCityLegal;
		}

		public void setBenCityLegal(String benCityLegal){
			 this.benCityLegal = benCityLegal;
		}

		public String getBenAddressLegal(){
			 return benAddressLegal;
		}

		public void setBenAddressLegal(String benAddressLegal){
			 this.benAddressLegal = benAddressLegal;
		}

		public String getBenPhoneLegal(){
			 return benPhoneLegal;
		}

		public void setBenPhoneLegal(String benPhoneLegal){
			 this.benPhoneLegal = benPhoneLegal;
		}

		public String getBenEmailLegal(){
			 return benEmailLegal;
		}

		public void setBenEmailLegal(String benEmailLegal){
			 this.benEmailLegal = benEmailLegal;
		}

		public Date getBenSysCreateDate(){
			 return benSysCreateDate;
		}

		public void setBenSysCreateDate(Date benSysCreateDate){
			 this.benSysCreateDate = benSysCreateDate;
		}

		public Date getBenSysUpdateDate(){
			 return benSysUpdateDate;
		}

		public void setBenSysUpdateDate(Date benSysUpdateDate){
			 this.benSysUpdateDate = benSysUpdateDate;
		}

		public Date getBenSysSyncTst(){
			 return benSysSyncTst;
		}

		public void setBenSysSyncTst(Date benSysSyncTst){
			 this.benSysSyncTst = benSysSyncTst;
		}

		public String getBenStatusInputData(){
			 return benStatusInputData;
		}

		public void setBenStatusInputData(String benStatusInputData){
			 this.benStatusInputData = benStatusInputData;
		}

		public Long getBenBarId(){
			 return benBarId;
		}

		public void setBenBarId(Long benBarId){
			 this.benBarId = benBarId;
		}

		public Boolean getBenDefaultObject(){
			 return benDefaultObject;
		}

		public void setBenDefaultObject(Boolean benDefaultObject){
			 this.benDefaultObject = benDefaultObject;
		}

		public Long getBenCodeLastUsedNumber(){
			 return benCodeLastUsedNumber;
		}

		public void setBenCodeLastUsedNumber(Long benCodeLastUsedNumber){
			 this.benCodeLastUsedNumber = benCodeLastUsedNumber;
		}

		public String getBenErs(){
			 return benErs;
		}

		public void setBenErs(String benErs){
			 this.benErs = benErs;
		}

		public Boolean getBenUnknown(){
			 return benUnknown;
		}

		public void setBenUnknown(Boolean benUnknown){
			 this.benUnknown = benUnknown;
		}

		public String getBenPredominantActivityCodeLegal(){
			 return benPredominantActivityCodeLegal;
		}

		public void setBenPredominantActivityCodeLegal(String benPredominantActivityCodeLegal){
			 this.benPredominantActivityCodeLegal = benPredominantActivityCodeLegal;
		}

		public String getBenPredominantActivityDescriptionLegal(){
			 return benPredominantActivityDescriptionLegal;
		}

		public void setBenPredominantActivityDescriptionLegal(String benPredominantActivityDescriptionLegal){
			 this.benPredominantActivityDescriptionLegal = benPredominantActivityDescriptionLegal;
		}

		public String getBenLegalType() {
			return benLegalType;
		}

		public void setBenLegalType(String benLegalType) {
			this.benLegalType = benLegalType;
		}

		public String getBenSearchKey() {
			return benSearchKey;
		}

		public void setBenSearchKey(String benSearchKey) {
			this.benSearchKey = benSearchKey;
		}

		public Boolean getBenOjectHasAdditionalFields() {
			return benOjectHasAdditionalFields;
		}

		public void setBenOjectHasAdditionalFields(Boolean benOjectHasAdditionalFields) {
			this.benOjectHasAdditionalFields = benOjectHasAdditionalFields;
		}
		
		public String getBenJmbgSubmitter() {
			return benJmbgSubmitter;
		}

		public void setBenJmbgSubmitter(String benJmbgSubmitter) {
			this.benJmbgSubmitter = benJmbgSubmitter;
		}

		public String getBenNameSubmitter() {
			return benNameSubmitter;
		}

		public void setBenNameSubmitter(String benNameSubmitter) {
			this.benNameSubmitter = benNameSubmitter;
		}

		public String getBenSurnameSubmitter() {
			return benSurnameSubmitter;
		}

		public void setBenSurnameSubmitter(String benSurnameSubmitter) {
			this.benSurnameSubmitter = benSurnameSubmitter;
		}

		public String getBenAddressSubmitter() {
			return benAddressSubmitter;
		}

		public void setBenAddressSubmitter(String benAddressSubmitter) {
			this.benAddressSubmitter = benAddressSubmitter;
		}

		public String getBenPhoneSubmitter() {
			return benPhoneSubmitter;
		}

		public void setBenPhoneSubmitter(String benPhoneSubmitter) {
			this.benPhoneSubmitter = benPhoneSubmitter;
		}

		public String getBenSex() {
			return benSex;
		}

		public void setBenSex(String benSex) {
			this.benSex = benSex;
		}

		public String getBenJmbgContractor() {
			return benJmbgContractor;
		}

		public void setBenJmbgContractor(String benJmbgContractor) {
			this.benJmbgContractor = benJmbgContractor;
		}

		public String getBenNameContractor() {
			return benNameContractor;
		}

		public void setBenNameContractor(String benNameContractor) {
			this.benNameContractor = benNameContractor;
		}

		public String getBenSurnameContractor() {
			return benSurnameContractor;
		}

		public void setBenSurnameContractor(String benSurnameContractor) {
			this.benSurnameContractor = benSurnameContractor;
		}

		public String getBenJmbgAgent() {
			return benJmbgAgent;
		}

		public void setBenJmbgAgent(String benJmbgAgent) {
			this.benJmbgAgent = benJmbgAgent;
		}

		public String getBenNameAgent() {
			return benNameAgent;
		}

		public void setBenNameAgent(String benNameAgent) {
			this.benNameAgent = benNameAgent;
		}

		public String getBenSurnameAgent() {
			return benSurnameAgent;
		}

		public void setBenSurnameAgent(String benSurnameAgent) {
			this.benSurnameAgent = benSurnameAgent;
		}

		public String getBenAddressAgent() {
			return benAddressAgent;
		}

		public void setBenAddressAgent(String benAddressAgent) {
			this.benAddressAgent = benAddressAgent;
		}

		public String getBenPhoneAgent() {
			return benPhoneAgent;
		}

		public void setBenPhoneAgent(String benPhoneAgent) {
			this.benPhoneAgent = benPhoneAgent;
		}

		public String getBenBpgMesto() {
			return benBpgMesto;
		}

		public void setBenBpgMesto(String benBpgMesto) {
			this.benBpgMesto = benBpgMesto;
		}

		public String getBenBpgRbr() {
			return benBpgRbr;
		}

		public void setBenBpgRbr(String benBpgRbr) {
			this.benBpgRbr = benBpgRbr;
		}

		public String getBenEmailAgent() {
			return benEmailAgent;
		}

		public void setBenEmailAgent(String benEmailAgent) {
			this.benEmailAgent = benEmailAgent;
		}
		
      


	
	// custom-start
  
 
  
		

		public String getBenBondSizeLegal() {
			return benBondSizeLegal;
		}

		public void setBenBondSizeLegal(String benBondSizeLegal) {
			this.benBondSizeLegal = benBondSizeLegal;
		}

		@Column(name = "ben_date_of_birth")
	public Date	benDateOfBirth;
		public Date getBenDateOfBirth() {
			return benDateOfBirth;
		}

		public void setBenDateOfBirth(Date benDateOfBirth) {
			this.benDateOfBirth = benDateOfBirth;
		}

  

  

  

  

  

  

  

  

  

  
  // custom-end

}
