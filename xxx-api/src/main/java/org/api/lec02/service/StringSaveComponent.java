package org.api.lec02.service;

import org.domain.service.StringRepository;

public class StringSaveComponent {

  private final StringRepository stringRepository = StringRepositoryLoader.getDefault();

  public void mainLogic() {
    stringRepository.save("문자열");
  }

  public static void main(String[] args) {
    StringSaveComponent component = new StringSaveComponent();
    component.mainLogic();
  }

}