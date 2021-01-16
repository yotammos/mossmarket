package com.mosscorp.market.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PutItemRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePutItemRequest.builder()}.
 */
@Generated(from = "PutItemRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutablePutItemRequest extends PutItemRequest {
  private final String accountId;
  private final String name;
  private final double price;

  private ImmutablePutItemRequest(String accountId, String name, double price) {
    this.accountId = accountId;
    this.name = name;
    this.price = price;
  }

  /**
   * @return The value of the {@code accountId} attribute
   */
  @Override
  public String accountId() {
    return accountId;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code price} attribute
   */
  @Override
  public double price() {
    return price;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PutItemRequest#accountId() accountId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for accountId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePutItemRequest withAccountId(String value) {
    String newValue = Objects.requireNonNull(value, "accountId");
    if (this.accountId.equals(newValue)) return this;
    return new ImmutablePutItemRequest(newValue, this.name, this.price);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PutItemRequest#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePutItemRequest withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutablePutItemRequest(this.accountId, newValue, this.price);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PutItemRequest#price() price} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for price
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePutItemRequest withPrice(double value) {
    if (Double.doubleToLongBits(this.price) == Double.doubleToLongBits(value)) return this;
    return new ImmutablePutItemRequest(this.accountId, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePutItemRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePutItemRequest
        && equalTo((ImmutablePutItemRequest) another);
  }

  private boolean equalTo(ImmutablePutItemRequest another) {
    return accountId.equals(another.accountId)
        && name.equals(another.name)
        && Double.doubleToLongBits(price) == Double.doubleToLongBits(another.price);
  }

  /**
   * Computes a hash code from attributes: {@code accountId}, {@code name}, {@code price}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + accountId.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Double.hashCode(price);
    return h;
  }

  /**
   * Prints the immutable value {@code PutItemRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PutItemRequest{"
        + "accountId=" + accountId
        + ", name=" + name
        + ", price=" + price
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link PutItemRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PutItemRequest instance
   */
  public static ImmutablePutItemRequest copyOf(PutItemRequest instance) {
    if (instance instanceof ImmutablePutItemRequest) {
      return (ImmutablePutItemRequest) instance;
    }
    return ImmutablePutItemRequest.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePutItemRequest ImmutablePutItemRequest}.
   * <pre>
   * ImmutablePutItemRequest.builder()
   *    .accountId(String) // required {@link PutItemRequest#accountId() accountId}
   *    .name(String) // required {@link PutItemRequest#name() name}
   *    .price(double) // required {@link PutItemRequest#price() price}
   *    .build();
   * </pre>
   * @return A new ImmutablePutItemRequest builder
   */
  public static ImmutablePutItemRequest.Builder builder() {
    return new ImmutablePutItemRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePutItemRequest ImmutablePutItemRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PutItemRequest", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ACCOUNT_ID = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_PRICE = 0x4L;
    private long initBits = 0x7L;

    private String accountId;
    private String name;
    private double price;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PutItemRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PutItemRequest instance) {
      Objects.requireNonNull(instance, "instance");
      accountId(instance.accountId());
      name(instance.name());
      price(instance.price());
      return this;
    }

    /**
     * Initializes the value for the {@link PutItemRequest#accountId() accountId} attribute.
     * @param accountId The value for accountId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder accountId(String accountId) {
      this.accountId = Objects.requireNonNull(accountId, "accountId");
      initBits &= ~INIT_BIT_ACCOUNT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PutItemRequest#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link PutItemRequest#price() price} attribute.
     * @param price The value for price 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder price(double price) {
      this.price = price;
      initBits &= ~INIT_BIT_PRICE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePutItemRequest ImmutablePutItemRequest}.
     * @return An immutable instance of PutItemRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePutItemRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePutItemRequest(accountId, name, price);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ACCOUNT_ID) != 0) attributes.add("accountId");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_PRICE) != 0) attributes.add("price");
      return "Cannot build PutItemRequest, some of required attributes are not set " + attributes;
    }
  }
}
