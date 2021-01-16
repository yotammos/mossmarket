package com.mosscorp.market.model;

import com.google.common.primitives.Doubles;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MarketItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMarketItem.builder()}.
 */
@Generated(from = "MarketItem", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableMarketItem extends MarketItem {
  private final String accountId;
  private final String itemId;
  private final String name;
  private final double price;

  private ImmutableMarketItem(String accountId, String itemId, String name, double price) {
    this.accountId = accountId;
    this.itemId = itemId;
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
   * @return The value of the {@code itemId} attribute
   */
  @Override
  public String itemId() {
    return itemId;
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
   * Copy the current immutable object by setting a value for the {@link MarketItem#accountId() accountId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for accountId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketItem withAccountId(String value) {
    String newValue = Objects.requireNonNull(value, "accountId");
    if (this.accountId.equals(newValue)) return this;
    return new ImmutableMarketItem(newValue, this.itemId, this.name, this.price);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketItem#itemId() itemId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for itemId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketItem withItemId(String value) {
    String newValue = Objects.requireNonNull(value, "itemId");
    if (this.itemId.equals(newValue)) return this;
    return new ImmutableMarketItem(this.accountId, newValue, this.name, this.price);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketItem#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketItem withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableMarketItem(this.accountId, this.itemId, newValue, this.price);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MarketItem#price() price} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for price
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMarketItem withPrice(double value) {
    if (Double.doubleToLongBits(this.price) == Double.doubleToLongBits(value)) return this;
    return new ImmutableMarketItem(this.accountId, this.itemId, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMarketItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMarketItem
        && equalTo((ImmutableMarketItem) another);
  }

  private boolean equalTo(ImmutableMarketItem another) {
    return accountId.equals(another.accountId)
        && itemId.equals(another.itemId)
        && name.equals(another.name)
        && Double.doubleToLongBits(price) == Double.doubleToLongBits(another.price);
  }

  /**
   * Computes a hash code from attributes: {@code accountId}, {@code itemId}, {@code name}, {@code price}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + accountId.hashCode();
    h += (h << 5) + itemId.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Doubles.hashCode(price);
    return h;
  }

  /**
   * Prints the immutable value {@code MarketItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return com.google.common.base.Objects.toStringHelper("MarketItem")
        .omitNullValues()
        .add("accountId", accountId)
        .add("itemId", itemId)
        .add("name", name)
        .add("price", price)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link MarketItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MarketItem instance
   */
  public static ImmutableMarketItem copyOf(MarketItem instance) {
    if (instance instanceof ImmutableMarketItem) {
      return (ImmutableMarketItem) instance;
    }
    return ImmutableMarketItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableMarketItem ImmutableMarketItem}.
   * <pre>
   * ImmutableMarketItem.builder()
   *    .accountId(String) // required {@link MarketItem#accountId() accountId}
   *    .itemId(String) // required {@link MarketItem#itemId() itemId}
   *    .name(String) // required {@link MarketItem#name() name}
   *    .price(double) // required {@link MarketItem#price() price}
   *    .build();
   * </pre>
   * @return A new ImmutableMarketItem builder
   */
  public static ImmutableMarketItem.Builder builder() {
    return new ImmutableMarketItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableMarketItem ImmutableMarketItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MarketItem", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ACCOUNT_ID = 0x1L;
    private static final long INIT_BIT_ITEM_ID = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private static final long INIT_BIT_PRICE = 0x8L;
    private long initBits = 0xfL;

    private String accountId;
    private String itemId;
    private String name;
    private double price;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code MarketItem} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(MarketItem instance) {
      Objects.requireNonNull(instance, "instance");
      accountId(instance.accountId());
      itemId(instance.itemId());
      name(instance.name());
      price(instance.price());
      return this;
    }

    /**
     * Initializes the value for the {@link MarketItem#accountId() accountId} attribute.
     * @param accountId The value for accountId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder accountId(String accountId) {
      this.accountId = Objects.requireNonNull(accountId, "accountId");
      initBits &= ~INIT_BIT_ACCOUNT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link MarketItem#itemId() itemId} attribute.
     * @param itemId The value for itemId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder itemId(String itemId) {
      this.itemId = Objects.requireNonNull(itemId, "itemId");
      initBits &= ~INIT_BIT_ITEM_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link MarketItem#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link MarketItem#price() price} attribute.
     * @param price The value for price 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder price(double price) {
      this.price = price;
      initBits &= ~INIT_BIT_PRICE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableMarketItem ImmutableMarketItem}.
     * @return An immutable instance of MarketItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableMarketItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableMarketItem(accountId, itemId, name, price);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ACCOUNT_ID) != 0) attributes.add("accountId");
      if ((initBits & INIT_BIT_ITEM_ID) != 0) attributes.add("itemId");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_PRICE) != 0) attributes.add("price");
      return "Cannot build MarketItem, some of required attributes are not set " + attributes;
    }
  }
}
