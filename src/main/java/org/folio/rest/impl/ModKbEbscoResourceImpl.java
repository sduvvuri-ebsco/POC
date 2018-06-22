package org.folio.rest.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Qualifier;
import javax.ws.rs.core.Response;

import org.folio.rest.jaxrs.model.Attributes;
import org.folio.rest.jaxrs.model.Attributes_;
import org.folio.rest.jaxrs.model.Data;
import org.folio.rest.jaxrs.model.Datum;
import org.folio.rest.jaxrs.model.Jsonapi;
import org.folio.rest.jaxrs.model.Meta;
import org.folio.rest.jaxrs.model.Meta_;
import org.folio.rest.jaxrs.model.Packages;
import org.folio.rest.jaxrs.model.Provider;
import org.folio.rest.jaxrs.model.ProviderCollection;
import org.folio.rest.jaxrs.model.ProviderProviderIdPut;
import org.folio.rest.jaxrs.model.ProviderToken;
import org.folio.rest.jaxrs.model.Proxy;
import org.folio.rest.jaxrs.model.Relationships;
import org.folio.rest.jaxrs.resource.ProvidersResource;

import com.sun.jna.platform.win32.WinBase.SECURITY_ATTRIBUTES;

import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Handler;

public class ModKbEbscoResourceImpl implements ProvidersResource {
@Override
public void getEholdingsProviders(String q, Integer page, Integer count, Sort sort, FilterSelected filterSelected,
		FilterType filterType, Map<String, String> okapiHeaders, Handler<AsyncResult<Response>> asyncResultHandler,
		Context vertxContext) throws Exception {
	
	Attributes attributesOne = new Attributes();
	attributesOne.setName("Ebsco");
	attributesOne.setPackagesTotal(627);
	attributesOne.setPackagesSelected(49);
	attributesOne.setProviderToken(null);
	attributesOne.setSupportsCustomPackages(false);
	
	Attributes attributesTwo = new Attributes();
	attributesTwo.setName("EBSCO Open Access Lists");
	attributesTwo.setPackagesTotal(23);
	attributesTwo.setPackagesSelected(6);
	attributesTwo.setProviderToken(null);
	attributesTwo.setSupportsCustomPackages(true);
	
	Meta metaOne = new Meta();
	metaOne.setIncluded(false);
	
	Packages packageOne = new Packages();
	packageOne.setMeta(metaOne);
	
	Relationships relationOne = new Relationships();
	relationOne.setPackages(packageOne);
	
	Datum entryOne = new Datum();
	entryOne.setId("19");
	entryOne.setType("providers");
	entryOne.setAttributes(attributesOne);
	entryOne.setRelationships(relationOne);
	
	Datum entryTwo = new Datum();
	entryTwo.setId("273");
	entryTwo.setType("providers");
	entryTwo.setAttributes(attributesTwo);
	entryTwo.setRelationships(relationOne);
	
	List<Datum> data = new ArrayList<Datum>();
	data.add(entryOne);
	data.add(entryTwo);
	
	Jsonapi jsonapi = new Jsonapi();
	jsonapi.setVersion("1.0");
	
	Meta_ meta = new Meta_();
	meta.setTotalResults(2);
	
	ProviderCollection entity = new ProviderCollection();
	entity.setData(data);
	entity.setJsonapi(jsonapi);
	entity.setMeta(meta);
	asyncResultHandler.handle(Future.succeededFuture(ProvidersResource.GetEholdingsProvidersResponse.withVndApiJsonOK(entity)));
}

@Override
public void getEholdingsProvidersByProviderId(String providerId, String include, Map<String, String> okapiHeaders,
		Handler<AsyncResult<Response>> asyncResultHandler, Context vertxContext) throws Exception {
	// TODO Auto-generated method stub
	
}

@Override
public void putEholdingsProvidersByProviderId(String providerId, ProviderProviderIdPut entity,
		Map<String, String> okapiHeaders, Handler<AsyncResult<Response>> asyncResultHandler, Context vertxContext)
		throws Exception {
	
	Jsonapi jsonapi = new Jsonapi();
	jsonapi.setVersion("1.0");
	
	Data dataPut = new Data();
	dataPut.setId("18");
	dataPut.setType("providers");
	
	ProviderToken providerToken = new ProviderToken();
	providerToken.setFactName("[[galesiteid]]");
	providerToken.setPrompt("/itweb/");
	providerToken.setHelpText("\u003cul\u003e\r\n    \u003cli\u003eEnter your Gale\u003csup\u003e®\u003c/sup\u003e site ID in the space provided below. The site ID may contain a combination of alpha/numeric characters, varying in length. \u003cblockquote style=\"margin-right: 0px;\" dir=\"ltr\"\u003e\r\n    \u003cp\u003e Example: The site ID immediately follows /itweb/ in a URL. The site ID in the following URL is \u003ci\u003eaa11bb22\u003c/i\u003e. \u003c/p\u003e\r\n    \u003c/blockquote\u003e\u003c/li\u003e\r\n\u003c/ul\u003e\r\n\u003cblockquote style=\"margin-right: 0px;\" dir=\"ltr\"\u003e\u003cblockquote style=\"margin-right: 0px;\" dir=\"ltr\"\u003e\r\n\u003cp\u003e\u003cspan style=\"text-decoration: underline;\"\u003ehttp://infotrac.galegroup.com/itweb/aa11bb22?db=AIM\u003c/span\u003e\u003c/p\u003e\r\n\u003c/blockquote\u003e\u003c/blockquote\u003e\u003cbr /\u003e\r\n\u003cul\u003e\r\n    \u003cli\u003eIf no site ID is specified, your Gale Group links may not function properly, as Gale Group requires this information for authentication. \u003c/li\u003e\r\n    \u003cli\u003eIf you are unable to locate the site ID, please contact Gale Group. For contact information, visit: \u003ca href=\"http://access.gale.com/authentication/\"\u003ehttp://access.gale.com/authentication/\u003c/a\u003e. \u003c/li\u003e\r\n\u003c/ul\u003e\r\n");
	providerToken.setValue("hellotoken");
	
	Proxy proxy = new Proxy();
	proxy.setId("EZProxy");
	
	Attributes_ attributes = new Attributes_();
	attributes.setName("Gale | Cengage");
	attributes.setPackagesTotal(243);
	attributes.setPackagesSelected(18);
	attributes.setProviderToken(providerToken);
	attributes.setSupportsCustomPackages(false);
	attributes.setProxy(proxy);
	dataPut.setAttributes(attributes);
	
	Meta metaOne = new Meta();
	metaOne.setIncluded(false);
	
	Packages packageOne = new Packages();
	packageOne.setMeta(metaOne);
	
	Relationships relationOne = new Relationships();
	relationOne.setPackages(packageOne);
	
	dataPut.setRelationships(relationOne);
	
	Provider entityPut = new Provider();
	entityPut.setData(dataPut);
	entityPut.setJsonapi(jsonapi);
	asyncResultHandler.handle(Future.succeededFuture(ProvidersResource.PutEholdingsProvidersByProviderIdResponse.withVndApiJsonOK(entityPut)));
}
}
