package com.base.Republic.wsclient;

import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;

import org.apache.cxf.Bus;
import org.apache.cxf.ws.policy.IgnorablePolicyInterceptorProvider;
import org.apache.cxf.ws.policy.PolicyInterceptorProviderRegistry;
import org.springframework.beans.factory.annotation.Value;

import com.base.Republic.model.Beneficiary;
import com.base.Republic.wsclient.data.apws.IListaAp;
import com.base.Republic.wsclient.data.apws.ListaAp;
import com.base.Republic.wsclient.data.response.*;
import com.base.Republic.wsclient.data.request.*;

public class ListApServiceClient {

	@Value("${aprwsdl.url}")
	private URL urlWSDL;
	
	private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "ListaAp");
	private static IListaAp port = null;
	
	public IListaAp setConnection() {

		
		if (port == null) {

			// URL wsdlURL = ListaAp.WSDL_LOCATION;

			// service initialization
			ListaAp service = new ListaAp(this.urlWSDL, SERVICE_NAME);
			port = service.getBasicHttpsBindingIListaAp();

			// security policy apache cxf
			org.apache.cxf.endpoint.Client client = org.apache.cxf.frontend.ClientProxy.getClient(port);
			org.apache.cxf.endpoint.Endpoint cxfEndpoint = client.getEndpoint();

			Bus bus = client.getBus();
			PolicyInterceptorProviderRegistry reg = bus.getExtension(PolicyInterceptorProviderRegistry.class);
			Set<QName> set = new HashSet<>();
			set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "TransportToken"));
			set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "TransportBinding"));
			set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "HttpsToken"));
			set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "AlgorithmSuite"));
			set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "Basic256"));
			set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "Layout"));
			set.add(new QName("http://schemas.xmlsoap.org/ws/2005/07/securitypolicy", "Strict"));
			reg.register(new IgnorablePolicyInterceptorProvider(set));
		}

		return port;
	}
	
	public Beneficiary getData(String maticniBrojField,
			Integer ithemType) throws Exception {
		Beneficiary result = new Beneficiary();
		
		try {
			
			ТTipRegistracionogEntiteta aprZahtev_data = ТTipRegistracionogEntiteta.ITEM_2;

			TAprZahtev aprZahtev_podaci = new TAprZahtev();

			Beneficiary ogranak = null;

			aprZahtev_podaci.setMatBrOrgPodnosiocaField("17130846");
			aprZahtev_podaci.setNazivOrgPodnosiocaField("SnT");
			aprZahtev_podaci.setMaticniBrojField(maticniBrojField);

			if (ithemType != null) {
				switch (ithemType) {
				case 1:
					aprZahtev_data = ТTipRegistracionogEntiteta.ITEM_1;
					aprZahtev_podaci.setТipField(aprZahtev_data);

					IListaAp port = this.setConnection();
					ResponseMessage responseMessage = port.getRegListaEntiteta(aprZahtev_podaci);

					
					if (!responseMessage.getErrorCode().getValue().toString().equals("-1")) {


						
						
						TAprZahtevResponse res = responseMessage.getResult().getValue();
						ArrayOf\u0422RegistracioniEntitet reg1 = res.getListaRegistracionihEntitetaField();

						List<ТRegistracioniEntitet> listaRegistracionihEntiteta = reg1.getТRegistracioniEntitet();
						ТRegistracioniEntitet regEntitet = listaRegistracionihEntiteta.get(0);

						ArrayOfTGrupa arrayGrupaField = regEntitet.getListaGrupaField();
						List<TGrupa> listaGrupaField = arrayGrupaField.getTGrupa();

						for (TGrupa grupa : listaGrupaField) {

							

							
							ArrayOfTPolje arrayPolja = grupa.getListaPoljaField();
							List<TPolje> listaPolja = arrayPolja.getTPolje();

							for (TPolje polje : listaPolja) {
								System.out.println("Naziv polja:  " + polje.getNazivField());
								System.out.println("Vrednost polja: " + polje.getVrednostField());
								System.out.println("Tip polja: " + polje.getTipField());
								System.out.println("--------------------------------------");

								// case item 1 !!!
								result = this.retrieveBeneficiaryDataItem1("CREATE",result, grupa, polje);
								

							}
						}

					} else {

						
					}

					break;
				case 2:
					aprZahtev_data = ТTipRegistracionogEntiteta.ITEM_2;
					aprZahtev_podaci.setТipField(aprZahtev_data);

					IListaAp port2 = this.setConnection();
					ResponseMessage responseMessage2 = port2.getRegListaEntiteta(aprZahtev_podaci);
					
					if (!responseMessage2.getErrorCode().getValue().toString().equals("-1")) {

						TAprZahtevResponse res2 = responseMessage2.getResult().getValue();
						ArrayOf\u0422RegistracioniEntitet reg2 = res2.getListaRegistracionihEntitetaField();

						List<ТRegistracioniEntitet> listaRegistracionihEntiteta2 = reg2.getТRegistracioniEntitet();
						ТRegistracioniEntitet regEntitet2 = listaRegistracionihEntiteta2.get(0);

						ArrayOfTGrupa arrayGrupaField2 = regEntitet2.getListaGrupaField();
						List<TGrupa> listaGrupaField2 = arrayGrupaField2.getTGrupa();

						for (TGrupa grupa : listaGrupaField2) {

							System.out.println("Identifikator grupe: " + grupa.getIdentifikatorGrupeField());

							
							ArrayOfTPolje arrayPolja2 = grupa.getListaPoljaField();
							List<TPolje> listaPolja2 = arrayPolja2.getTPolje();

							for (TPolje polje : listaPolja2) {
								System.out.println("Naziv polja:  " + polje.getNazivField());
								System.out.println("Vrednost polja: " + polje.getVrednostField());
								System.out.println("Tip polja: " + polje.getTipField());
								System.out.println("--------------------------------------");

								// case item 2 !!!
								result = this.retrieveBeneficiaryDataItem2("CREATE",result, grupa, polje);
								

							}
						}
					}
					 else {
						
					}

					break;
				default:
					break;
				}
				
		
		
	}
	
		}catch (WebServiceException e) {
			e.printStackTrace();
			throw new Exception("errorDescription= " + e.getMessage().toString());
		}
		return result;
	}
	
	public Beneficiary retrieveBeneficiaryDataItem1(String mode, Beneficiary beneficiary, TGrupa grupa,
			TPolje polje) throws Exception {

		// mapiranje podataka sa APR-a u BeneficiaryDTO i

		if (polje.getNazivField().equals("MaticniBroj") && grupa.getIdentifikatorGrupeField().equals("1001")) {
			if (mode.equals("CREATE")) {

				beneficiary.setBenRegistrationNumber(polje.getVrednostField());
			}
		}
		if (polje.getNazivField().equals("IdentifikatorStatusa_NazivStatusaCirilicni")
				&& grupa.getIdentifikatorGrupeField().equals("1002")) {
			beneficiary.setBenStatusLegal(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("IdentifikatorPravneForme_NazivPravneFormeCirilicni")
				&& grupa.getIdentifikatorGrupeField().equals("1004")) {
			beneficiary.setBenLegalType(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("PoslovnoIme") && grupa.getIdentifikatorGrupeField().equals("1005")) {

			beneficiary.setBenNameLongLegal(polje.getVrednostField());
			if (mode.equals("CREATE")) {

				beneficiary.setBenNameLong(polje.getVrednostField());
				beneficiary.setBenNameShort(polje.getVrednostField());
			}
		}
		if (polje.getNazivField().equals("PoslovnoImeLatinica") && grupa.getIdentifikatorGrupeField().equals("1005")) {

			beneficiary.setBenNameLongLegalLat(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("SkracenoPoslovnoIme") && grupa.getIdentifikatorGrupeField().equals("1006")
				&& !polje.getNazivField().isEmpty()) {

			beneficiary.setBenNameShortLegal(polje.getVrednostField());
			if (mode.equals("CREATE")) {

				beneficiary.setBenNameShort(polje.getVrednostField());
			}
		}
		if (polje.getNazivField().equals("SkracenoPoslovnoImeLatinica")
				&& grupa.getIdentifikatorGrupeField().equals("1006")) {

			beneficiary.setBenNameShortLegalLat(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("IdentifikatorMesta_NazivMestaCirilicni")
				&& grupa.getIdentifikatorGrupeField().equals("1010")) {

			beneficiary.setBenCityLegal(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("NazivUlice") && grupa.getIdentifikatorGrupeField().equals("1011")) {
			beneficiary.setBenAddressLegal(polje.getVrednostField());

		}
		if (beneficiary.getBenAddressLegal() != null && !beneficiary.getBenAddressLegal().equals("")) {

			String benAddressNumberLegal = beneficiary.getBenAddressLegal().concat(" ").concat(
					polje.getNazivField().equals("AdresaBroj") && grupa.getIdentifikatorGrupeField().equals("1011")
							? polje.getVrednostField()
							: "");

			beneficiary.setBenAddressLegal(benAddressNumberLegal.trim());

		}
		if (polje.getNazivField().equals("EMailAdresa") && grupa.getIdentifikatorGrupeField().equals("1013")) {

			beneficiary.setBenEmailLegal(polje.getVrednostField());
			if (mode.equals("CREATE")) {

				beneficiary.setBenEmail(polje.getVrednostField());
			}
		}
		if (polje.getNazivField().equals("PreteznaDelatnostSifra")
				&& grupa.getIdentifikatorGrupeField().equals("1016")) {

			// delatnost sifra
			beneficiary.setBenPredominantActivityCodeLegal(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("SifraDelatnosti_OpisDelatnostiCirilicni")
				&& grupa.getIdentifikatorGrupeField().equals("1016")) {

			// delatnost naziv
			beneficiary.setBenPredominantActivityDescriptionLegal(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("PIB") && grupa.getIdentifikatorGrupeField().equals("1017")) {
			// PIB
			if (mode.equals("CREATE")) {
				beneficiary.setBenVatId(polje.getVrednostField());
			}
		}

		if (polje.getNazivField().equals("Telefon1") && grupa.getIdentifikatorGrupeField().equals("1074")) {
			// Telefon 1
			beneficiary.setBenPhoneLegal(polje.getVrednostField());
			if (mode.equals("CREATE")) {
				beneficiary.setBenPhone(polje.getVrednostField());
			}
		}

		if (polje.getNazivField().equals("Telefon2") && grupa.getIdentifikatorGrupeField().equals("1074")) {
			// Telefon 2
			if (!beneficiary.getBenPhoneLegal().isEmpty()) {
				beneficiary
						.setBenPhoneLegal(beneficiary.getBenPhoneLegal().concat(",").concat(polje.getVrednostField()));
			} else {
				beneficiary.setBenPhoneLegal(polje.getVrednostField());
			}
			if (mode.equals("CREATE")) {
				if (!beneficiary.getBenPhone().isEmpty()) {
					beneficiary.setBenPhone(beneficiary.getBenPhone().concat(",").concat(polje.getVrednostField()));
				} else {
					beneficiary.setBenPhone(polje.getVrednostField());
				}
			}
		}
		

		return beneficiary;
	}
	
	public Beneficiary retrieveBeneficiaryDataItem2(String mode, Beneficiary beneficiary, TGrupa grupa,
			TPolje polje) throws Exception {

		if (polje.getNazivField().equals("MaticniBroj") && grupa.getIdentifikatorGrupeField().equals("1041")) {
			if (mode.equals("CREATE")) {
				beneficiary.setBenRegistrationNumber(polje.getVrednostField());
			}
		}
		if (polje.getNazivField().equals("IdentifikatorStatusa_NazivStatusaCirilicni")
				&& grupa.getIdentifikatorGrupeField().equals("1042")) {

			beneficiary.setBenStatusLegal(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("PoslovnoIme") && grupa.getIdentifikatorGrupeField().equals("1045")) {

			beneficiary.setBenNameLongLegal(polje.getVrednostField());
			if (mode.equals("CREATE")) {

				beneficiary.setBenNameLong(polje.getVrednostField());
				beneficiary.setBenNameShort(polje.getVrednostField());
			}
		}
		if (polje.getNazivField().equals("PoslovnoImeLatinica") && grupa.getIdentifikatorGrupeField().equals("1045")) {

			beneficiary.setBenNameLongLegalLat(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("SkracenoPoslovnoIme") && grupa.getIdentifikatorGrupeField().equals("1046")
				&& !polje.getVrednostField().isEmpty()) {

			beneficiary.setBenNameShortLegal(polje.getVrednostField());
			if (mode.equals("CREATE")) {

				beneficiary.setBenNameShort(polje.getVrednostField());
			}
		}
		if (polje.getNazivField().equals("Naziv") && grupa.getIdentifikatorGrupeField().equals("1047")) {
			if (beneficiary.getBenNameShortLegal() == null || beneficiary.getBenNameShortLegal().isEmpty()) {

				beneficiary.setBenNameShortLegal(polje.getVrednostField());
				if (mode.equals("CREATE")) {

					beneficiary.setBenNameShort(polje.getVrednostField());
				}
			}
		}
		if (polje.getNazivField().equals("SkracenoPoslovnoImeLatinica")
				&& grupa.getIdentifikatorGrupeField().equals("1046") && !polje.getVrednostField().equals("")) {

			beneficiary.setBenNameShortLegalLat(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("NazivLatinica") && grupa.getIdentifikatorGrupeField().equals("1047")) {
			if (beneficiary.getBenNameShortLegalLat() == null || beneficiary.getBenNameShortLegalLat().isEmpty()) {

				beneficiary.setBenNameLongLegalLat(polje.getVrednostField());
			}
		}
		// podaci vezani za adresu preduzeca
		if (polje.getNazivField().equals("IdentifikatorMesta_NazivMestaCirilicni")
				&& grupa.getIdentifikatorGrupeField().equals("1051")) {

			beneficiary.setBenCityLegal(polje.getVrednostField());
		}



		if (polje.getNazivField().equals("NazivUlice") && grupa.getIdentifikatorGrupeField().equals("1052")) {

			beneficiary.setBenAddressLegal(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("AdresaBroj") && grupa.getIdentifikatorGrupeField().equals("1052")) {

			if (beneficiary.getBenAddressLegal() != null && !beneficiary.getBenAddressLegal().equals("")) {
				String benAddressNumberLegal = beneficiary.getBenAddressLegal().concat(" ").concat(
						polje.getNazivField().equals("AdresaBroj") && grupa.getIdentifikatorGrupeField().equals("1052")
								? polje.getVrednostField()
								: "");
				beneficiary.setBenAddressLegal(benAddressNumberLegal.trim());
			}
		}
		if (polje.getNazivField().equals("PreteznaDelatnostSifra")
				&& grupa.getIdentifikatorGrupeField().equals("1057")) {

			beneficiary.setBenPredominantActivityCodeLegal(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("SifraDelatnosti_OpisDelatnostiCirilicni")
				&& grupa.getIdentifikatorGrupeField().equals("1057")) {

			beneficiary.setBenPredominantActivityDescriptionLegal(polje.getVrednostField());
		}
		if (polje.getNazivField().equals("PIB") && grupa.getIdentifikatorGrupeField().equals("1058")) {
			if (mode.equals("CREATE")) {

				beneficiary.setBenVatId(polje.getVrednostField());
			}
		}

		if (polje.getNazivField().equals("Telefon1") && grupa.getIdentifikatorGrupeField().equals("1075")) {
			// Telefon 1
			beneficiary.setBenPhoneLegal(polje.getVrednostField());
			if (mode.equals("CREATE")) {
				beneficiary.setBenPhone(polje.getVrednostField());
			}
		}

		if (polje.getNazivField().equals("Telefon2") && grupa.getIdentifikatorGrupeField().equals("1075")) {
			// Telefon 2
			if (!beneficiary.getBenPhoneLegal().isEmpty()) {
				beneficiary
						.setBenPhoneLegal(beneficiary.getBenPhoneLegal().concat(",").concat(polje.getVrednostField()));
			} else {
				beneficiary.setBenPhoneLegal(polje.getVrednostField());
			}
			if (mode.equals("CREATE")) {
				if (!beneficiary.getBenPhone().isEmpty()) {
					beneficiary.setBenPhone(beneficiary.getBenPhone().concat(",").concat(polje.getVrednostField()));
				} else {
					beneficiary.setBenPhone(polje.getVrednostField());
				}
			}
		}

		if (polje.getNazivField().equals("EPosta") && grupa.getIdentifikatorGrupeField().equals("1075")) {

			beneficiary.setBenEmailLegal(polje.getVrednostField());
			if (mode.equals("CREATE")) {

				beneficiary.setBenEmail(polje.getVrednostField());
			}
		}
		return beneficiary;
	}

}

	
