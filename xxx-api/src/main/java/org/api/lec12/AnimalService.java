package org.api.lec12;

public class AnimalService {
  // AnimalType
  public AnimalDto getInformation(AnimalType type, long id) {
    // Animal animal = animalRepository.findByTypeAndId(type, id);
    Animal animal = new Dog();
    return AnimalDto.of(animal);
  }
}
