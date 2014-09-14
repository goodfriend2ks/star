package com.viettel.web.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(value = "/api/test")
public class FowardController {
	
	@Autowired
	private HttpServletRequest context;
	
	@RequestMapping(value = "/fwd", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> list(@RequestParam MultiValueMap<String, String> params) {
		try {
			Map<String, String> message = new HashMap<>();
			
			Enumeration<String> headers = context.getHeaderNames();
			while (headers.hasMoreElements()) {
				String header = headers.nextElement();
				message.put(header, context.getHeader(header));
				
				//System.out.println(header + "=" + message.get(header));
			}
			
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.OK);
		} catch (Exception ex) {
			//Map<String, String> message = errorException(ex, "Cannot get users");
			Map<String, String> message = new HashMap<>();
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/cach1", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> cach1(@RequestParam MultiValueMap<String, String> params) {
		try {
			Map<String, String> message = new HashMap<>();
			
			Enumeration<String> headers = context.getHeaderNames();
			while (headers.hasMoreElements()) {
				String header = headers.nextElement();
				message.put("1-" + header, context.getHeader(header));
			}
			
			List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
			interceptors.add(new XUserAgentInterceptor(context));
			
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.setRequestFactory(clientHttpRequestFactory());
			restTemplate.setInterceptors(interceptors);
			
			Object value = restTemplate.getForObject("http://localhost:8080/viettel-one-web/api/test/fwd", Object.class);
			if (value != null && value instanceof Map) {
				Map<String, String> mapValues = (Map<String, String>)value;
				for (String k : mapValues.keySet()) {
					message.put(k, mapValues.get(k));
				}
			}
			
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = new HashMap<>();
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/cach2", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> cach2(@RequestParam MultiValueMap<String, String> params) {
		try {
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.add("Cookie", "111111111112222222222222");
			
			Map<String, String> message = new HashMap<>();
			
			Enumeration<String> headers = context.getHeaderNames();
			while (headers.hasMoreElements()) {
				String header = headers.nextElement();
				message.put("1-" + header, context.getHeader(header));
				
				httpHeaders.add(header, context.getHeader(header));
			}
			
			RestTemplate restTemplate = new RestTemplate();
			restTemplate.setRequestFactory(clientHttpRequestFactory());
			
			HttpEntity<String> entity = new HttpEntity<String>("parameters", httpHeaders);
			
			ResponseEntity<?> value = restTemplate.exchange("http://localhost:8080/viettel-one-web/api/test/fwd", HttpMethod.GET, entity, Object.class);
			if (value != null && value.getBody() instanceof Map) {
				Map<String, String> mapValues = (Map<String, String>)value.getBody();
				for (String k : mapValues.keySet()) {
					message.put(k, mapValues.get(k));
				}
			}
			
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.OK);
		} catch (Exception ex) {
			Map<String, String> message = new HashMap<>();
			return new ResponseEntity<Map<String, String>>(message, HttpStatus.BAD_REQUEST);
		}
	}
	
	private ClientHttpRequestFactory clientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setReadTimeout(2000);
        factory.setConnectTimeout(2000);
        return factory;
    }
}

class XUserAgentInterceptor implements ClientHttpRequestInterceptor {

	private HttpServletRequest context;
	
	public XUserAgentInterceptor(HttpServletRequest context) {
		this.context = context;
	}
	
    @Override
    public ClientHttpResponse intercept(
            HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {

        HttpHeaders headers = request.getHeaders();
        headers.add("X-User-Agent", "My App v2.1");
        headers.add("Cookie", "111111111112222222222222");
        
        Enumeration<String> httpHeaders = context.getHeaderNames();
		while (httpHeaders.hasMoreElements()) {
			String header = httpHeaders.nextElement();
			headers.add(header, context.getHeader(header));
		}
		
        return execution.execute(request, body);
    }
}
