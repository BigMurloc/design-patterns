/**
 * Singleton is a creational design pattern.
 * <p>
 * It ensures that there is a single instance of its class while also providing access point to it.
 * <p>
 * Pros: Single instance :) & global access point
 * <p>
 * Cons: https://www.michaelsafyan.com/tech/design/patterns/singleton
 * <p>
 * - In a concurrent systems there is a risk of creating multiple singleton objects thus breaking the contract
 * <p>
 * - If Singleton is mutable then the system may become unpredictable...
 * <p>
 * - Risk of abusing pattern in scenarios that does not need to be singleton, later on causing pricey refactor
 * <p>
 * - Since the creation method is static - more difficult to test
 * <p>
 *
 */
package singleton;