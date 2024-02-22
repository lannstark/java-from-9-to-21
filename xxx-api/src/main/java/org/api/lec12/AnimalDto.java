package org.api.lec12;

public sealed interface AnimalDto {
  public static AnimalDto of(Animal animal) {
//    return switch (animal) {
//      case Dog dog -> DogDto.of(dog);
//      case Cat cat -> CatDto.of(cat);
//    };
    return switch (animal.getType()) {
      case DOG -> DogDto.of((Dog) animal);
      case CAT -> CatDto.of((Cat) animal);
    };
  }
}

record DogDto(
    String ownerName
) implements AnimalDto {
  public static DogDto of(Dog dog) {
    return new DogDto(dog.getOwnerName());
  }
}

record CatDto(
    String name,
    int age
) implements AnimalDto {
  public static CatDto of(Cat cat) {
    return new CatDto(cat.getName(), cat.getAge());
  }
}