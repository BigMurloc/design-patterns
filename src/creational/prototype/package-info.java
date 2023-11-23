/**
 * Prototype pattern is basically a deep clone pattern. <p></p>
 * It declares creational.prototype interface with method clone() which is implemented by concrete class and its subclasses <p></p>
 * When cloning the object we call clone() on an interface or a class and its subclasses call super.clone() and then proceed with cloning its fields <p></p>
 * Use cases: <p></p>
 * When we have a mutable object and want to perform some kind of simulation we can copy its instance to dereference the origin object <p>
 * It also can come in handy when we want to slightly modify a template object
 * e.g. commonly used configuration - we can keep it in some kind of registry and call for creational.prototype and then apply proper changes
 */
package creational.prototype;