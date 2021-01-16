package com.mosscorp.market.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AccountId}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccountId.builder()}.
 */
@Generated(from = "AccountId", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableAccountId extends AccountId {
  private final String accountId;

  private ImmutableAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * @return The value of the {@code accountId} attribute
   */
  @Override
  public String accountId() {
    return accountId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AccountId#accountId() accountId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for accountId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccountId withAccountId(String value) {
    String newValue = Objects.requireNonNull(value, "accountId");
    if (this.accountId.equals(newValue)) return this;
    return new ImmutableAccountId(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccountId} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccountId
        && equalTo((ImmutableAccountId) another);
  }

  private boolean equalTo(ImmutableAccountId another) {
    return accountId.equals(another.accountId);
  }

  /**
   * Computes a hash code from attributes: {@code accountId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + accountId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AccountId} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return com.google.common.base.Objects.toStringHelper("AccountId")
        .omitNullValues()
        .add("accountId", accountId)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link AccountId} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccountId instance
   */
  public static ImmutableAccountId copyOf(AccountId instance) {
    if (instance instanceof ImmutableAccountId) {
      return (ImmutableAccountId) instance;
    }
    return ImmutableAccountId.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAccountId ImmutableAccountId}.
   * <pre>
   * ImmutableAccountId.builder()
   *    .accountId(String) // required {@link AccountId#accountId() accountId}
   *    .build();
   * </pre>
   * @return A new ImmutableAccountId builder
   */
  public static ImmutableAccountId.Builder builder() {
    return new ImmutableAccountId.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAccountId ImmutableAccountId}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AccountId", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_ACCOUNT_ID = 0x1L;
    private long initBits = 0x1L;

    private String accountId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AccountId} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AccountId instance) {
      Objects.requireNonNull(instance, "instance");
      accountId(instance.accountId());
      return this;
    }

    /**
     * Initializes the value for the {@link AccountId#accountId() accountId} attribute.
     * @param accountId The value for accountId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder accountId(String accountId) {
      this.accountId = Objects.requireNonNull(accountId, "accountId");
      initBits &= ~INIT_BIT_ACCOUNT_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAccountId ImmutableAccountId}.
     * @return An immutable instance of AccountId
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAccountId build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAccountId(accountId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ACCOUNT_ID) != 0) attributes.add("accountId");
      return "Cannot build AccountId, some of required attributes are not set " + attributes;
    }
  }
}
