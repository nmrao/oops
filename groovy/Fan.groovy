import groovy.transform.Canonical
@Canonical
abstract class Fan {
  Watts watts
  int speed
  int rpm
}
