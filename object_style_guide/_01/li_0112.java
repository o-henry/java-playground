package object_style_guide._01;

public class li_0112 {
    final class Immutable {
        private int someNumber;

        public Immutable(int initialNumber) {
            this.someNumber = initialNumber;
        }

        public Immutable increase() {
            // doesn't change the state of object
            // Instead return a new instance with the value of someNumber increased.
            return new Immutable(someNumber + 1);
        }
    }
}
