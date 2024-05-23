package ilp037.creation.builder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpBuilderApp {

	public static void main(String[] args) throws Exception {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new URI("http://viacep.com.br/ws/06462100/json"))
				.version(Version.HTTP_2)
				.GET()
				.build();
		HttpResponse<String> response =
				HttpClient.newBuilder()
				.followRedirects(HttpClient.Redirect.ALWAYS)
				.build()
				.send(request, BodyHandlers.ofString());
		System.out.println(response.body());
	}
}
