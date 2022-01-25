package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
  public static List<Address> collect(List<Profile> profiles) {
    List<Address> addresses = profiles.stream()
        .map(value -> value.getAddress())
        .collect(Collectors.toList());

    return addresses;
  }
}
