/*
 * FispanComLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package cloud.fispan.dev1.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for EMT type.
 */
public class EMT {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean mDefault;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BankAccount bankAccount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

    /**
     * Default constructor.
     */
    public EMT() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  mDefault  Boolean value for mDefault.
     * @param  bankAccount  BankAccount value for bankAccount.
     * @param  email  String value for email.
     */
    public EMT(
            String type,
            Boolean mDefault,
            BankAccount bankAccount,
            String email) {
        this.type = type;
        this.mDefault = mDefault;
        this.bankAccount = bankAccount;
        this.email = email;
    }

    /**
     * Getter for Type.
     * The type of the payment.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The type of the payment.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Default.
     * Indicates if the given payment method is to be used by default.
     * @return Returns the Boolean
     */
    @JsonGetter("default")
    public Boolean getDefault() {
        return mDefault;
    }

    /**
     * Setter for Default.
     * Indicates if the given payment method is to be used by default.
     * @param mDefault Value for Boolean
     */
    @JsonSetter("default")
    public void setDefault(Boolean mDefault) {
        this.mDefault = mDefault;
    }

    /**
     * Getter for BankAccount.
     * The bank account associated with the payment methods.
     * @return Returns the BankAccount
     */
    @JsonGetter("bankAccount")
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Setter for BankAccount.
     * The bank account associated with the payment methods.
     * @param bankAccount Value for BankAccount
     */
    @JsonSetter("bankAccount")
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * Getter for Email.
     * The email associated with the EMT payment method.
     * @return Returns the String
     */
    @JsonGetter("email")
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * The email associated with the EMT payment method.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Converts this EMT into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EMT [" + "type=" + type + ", mDefault=" + mDefault + ", bankAccount=" + bankAccount
                + ", email=" + email + "]";
    }

    /**
     * Builds a new {@link EMT.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EMT.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .mDefault(getDefault())
                .bankAccount(getBankAccount())
                .email(getEmail());
        return builder;
    }

    /**
     * Class to build instances of {@link EMT}.
     */
    public static class Builder {
        private String type;
        private Boolean mDefault;
        private BankAccount bankAccount;
        private String email;



        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for mDefault.
         * @param  mDefault  Boolean value for mDefault.
         * @return Builder
         */
        public Builder mDefault(Boolean mDefault) {
            this.mDefault = mDefault;
            return this;
        }

        /**
         * Setter for bankAccount.
         * @param  bankAccount  BankAccount value for bankAccount.
         * @return Builder
         */
        public Builder bankAccount(BankAccount bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Builds a new {@link EMT} object using the set fields.
         * @return {@link EMT}
         */
        public EMT build() {
            return new EMT(type, mDefault, bankAccount, email);
        }
    }
}
