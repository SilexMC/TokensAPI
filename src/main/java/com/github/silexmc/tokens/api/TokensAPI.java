package com.github.silexmc.tokens.api;

import java.math.BigDecimal;
import java.util.UUID;

public interface TokensAPI {
    BigDecimal getTokens(UUID uniqueID);

    String getStringTokens(UUID uniqueID);

    String getFormatTokens(UUID uniqueID);

    BigDecimal getTotalTokens(UUID uniqueID);

    String getStringTotalTokens(UUID uniqueID);

    String getFormatTotalTokens(UUID uniqueID);

    void setTokens(UUID uniqueID, BigDecimal value);

    void giveTokens(UUID uniqueID, BigDecimal value);

    void takeTokens(UUID uniqueID, BigDecimal value);

    boolean hasTokens(UUID uniqueID, BigDecimal value);

    default void setTokens(UUID uniqueID, Double value) {
        this.setTokens(uniqueID, BigDecimal.valueOf(value));
    }

    default void giveTokens(UUID uniqueID, Double value) {
        this.giveTokens(uniqueID, BigDecimal.valueOf(value));
    }

    default void takeTokens(UUID uniqueID, Double value) {
        this.takeTokens(uniqueID, BigDecimal.valueOf(value));
    }

    default boolean hasTokens(UUID uniqueID, Double value) {
        return this.hasTokens(uniqueID, BigDecimal.valueOf(value));
    }
}
