module com.domain {
  exports org.domain;
  exports org.domain.service;

  provides org.domain.service.StringRepository with
      org.domain.service.MemoryStringRepository,
      org.domain.service.DatabaseStringRepository;
}