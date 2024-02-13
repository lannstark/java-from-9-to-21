module com.api {
   requires com.domain;
   uses org.domain.service.StringRepository;

   requires java.net.http;
}