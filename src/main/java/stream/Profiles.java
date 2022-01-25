package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
  public static List<Address> collect(List<Profile> profiles) {
    List<Address> addresses = profiles.stream()
        .map(value -> value.getAddress())
        .collect(Collectors.toList());
    return addresses;
  }

  public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
    List<Address> addressList = profiles.stream()
        .map(value -> value.getAddress())
        .sorted(Comparator.comparing(Address::getCity))
        .distinct()
        .collect(Collectors.toList());
    return addressList;
  }

}

