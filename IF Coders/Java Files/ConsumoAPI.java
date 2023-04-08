package <nome_do_seu_pacote>;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.*;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.validation.constraints.NotNull;

import org.apache.commons.io.IOUtils;
import org.json.*;

public class ConsumoAPI {

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Pets{
		private int id;
		private String name;
		private Category category;
		private List<String> photoUrls = new ArrayList<>();
		private List<Category> tags = new ArrayList<>();
		private String status;
		
		@Override
		public String toString() {
			return "Pets [id=" + id + ", name=" + name + ", category=" + category + ", photoUrls=" + photoUrls
					+ ", tags=" + tags + ", status=" + status + "]";
		}
	}
	
	@Getter
	@Setter
	public static class Category{
		public Category(long long1, String string) {
			this.id = long1;
			this.name = string;
		}

		@NotNull
		private Long id;
		
		@NotNull
		private String name;
	}
	
	private static List<Pets> datatable = new ArrayList<>();
	
	public static void main(String[] args) {
		try{
			
			// Gerando certificado
//			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
//				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
//					return null;
//				}
//
//				public void checkClientTrusted(X509Certificate[] certs, String authType) {
//				}
//
//				public void checkServerTrusted(X509Certificate[] certs, String authType) {
//				}
//			} };
//
//	        // Install the all-trusting trust manager
//	        SSLContext sc = SSLContext.getInstance("SSL");
//	        sc.init(null, trustAllCerts, new java.security.SecureRandom());
//	        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
//	    
//	        // Create all-trusting host name verifier
//	        HostnameVerifier allHostsValid = new HostnameVerifier() {
//	            public boolean verify(String hostname, SSLSession session) {
//	                return true;
//	            }
//	        };
			
			
			URL url = new URL("https://petstore3.swagger.io/api/v3/pet/findByStatus?status=available");
			HttpsURLConnection connHttps = (HttpsURLConnection) url.openConnection();
			
			connHttps.setRequestProperty("Content-Type","application/json");
			connHttps.setRequestMethod("GET");
			
			InputStreamReader io = new InputStreamReader(connHttps.getInputStream());
			String jsonResult = new String(IOUtils.toByteArray(io), "UTF-8");
			//jsonResult = jsonResult.substring(1, jsonResult.length());
			
			JSONArray obj2 = new JSONArray(jsonResult);
			System.out.println("jsonResult: "+ jsonResult);
			System.out.println("Convertido:\n" + obj2);
			
			for(int i = 0; i < obj2.length(); i++) {
				JSONObject obj = obj2.getJSONObject(i);
				
				Pets p = new Pets();
				p.id = (int) obj.getInt("id");
				p.name = obj.getString("name");
				p.category = new Category( obj.getJSONObject("category").getLong("id"), obj.getJSONObject("category").getString("name"));
				
				datatable.add(p);
				System.out.println(p);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
