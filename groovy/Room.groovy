import groovy.transform.Canonical
@Canonical
abstract class Room {
 List<Bulb> bulbs
 List<Fan> fans
 List<Window> windows
 List<Door> door
}
