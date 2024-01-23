package com.github.silexmc.tokens.api;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

public interface TokensAPI {
    BigInteger getTokens(UUID uniqueID);

    String getStringTokens(UUID uniqueID);

    String getFormatTokens(UUID uniqueID);

    BigDecimal getTotalTokens(UUID uniqueID);

    String getStringTotalTokens(UUID uniqueID);

    String getFormatTotalTokens(UUID uniqueID);

    void setTokens(UUID uniqueID, BigInteger value);

    void giveTokens(UUID uniqueID, BigInteger value);

    void takeTokens(UUID uniqueID, BigInteger value);

    boolean hasTokens(UUID uniqueID, BigInteger value);

    default void setTokens(UUID uniqueID, Integer value) {
        this.setTokens(uniqueID, BigInteger.valueOf(value));
    }

    default void giveTokens(UUID uniqueID, Integer value) {
        this.giveTokens(uniqueID, BigInteger.valueOf(value));
    }

    default void takeTokens(UUID uniqueID, Integer value) {
        this.takeTokens(uniqueID, BigInteger.valueOf(value));
    }

    default boolean hasTokens(UUID uniqueID, Integer value) {
        return this.hasTokens(uniqueID, BigInteger.valueOf(value));
    }
}
