# Getting Started with fispan.com

## Getting Started

### Introduction

#### Introduction

##### The Future Of Commercial Banking Is Integrated

FISPAN makes it simple for banks to remove friction and provide the banking experience of the future to commercial clients. We turn banking services into branded banking experiences embedded within the ERP and accounting software your clients rely on to run their business.

### Building

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=import3)

### Installation

The following section explains how to use the FispanComLib library in a new project.

#### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=createNewProject4)

#### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *FispanComLib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify FispanComLib in `Group Id`, fispan-com-lib in `Artifact Id` and 1.0.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=fispan.com-Java&workspaceName=FispanCom&projectName=FispanComLib&rootNamespace=cloud.fispan.dev1&groupId=FispanComLib&artifactId=fispan-com-lib&version=1.0.0&step=testProject2)

#### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

### Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

#### Fields

| Name | Description |
|  --- | --- |
| production | **Default** |
| environment2 | - |

### Initialize the API Client

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | `ReadonlyHttpClientConfiguration` | Http Client Configuration instance.<br>* See available [builder methods here](#httpclientconfigurationbuilder-class). |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
FispanComClient client = new FispanComClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .accessToken("AccessToken")
    .environment(Environment.PRODUCTION)
    .build();
```

### Authorization

This API uses `OAuth 2 Bearer token`.

## Client Class Documentation

### fispan.comClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

#### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getOAuthTokenController()` | Provides access to OAuthToken controller. | `OAuthTokenController` |
| `getVendorController()` | Provides access to Vendor controller. | `VendorController` |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | `ReadonlyHttpClientConfiguration` |
| `getAccessTokenCredentials()` | The credentials to use with AccessToken. | `AccessTokenCredentials` |
| `getAccessToken()` | OAuth 2.0 Access Token. | `String` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

## API Reference

### List of APIs

* [O Auth Token](#o-auth-token)
* [Vendor](#vendor)

### O Auth Token

#### Overview

Authenticates the user and retrieves a valid OAuth2 Bearer Token.

##### Get instance

An instance of the `OAuthTokenController` class can be accessed from the API Client.

```
OAuthTokenController oAuthTokenController = client.getOAuthTokenController();
```

#### Get O Auth Token

Doing the authentication requires that the grant_type is sent as a parameter. The possible grant types are:

* `client_credentials`: Used for service providers and end users.
* `password`: Used for admin users.

```java
CompletableFuture<AuthToken> getOAuthTokenAsync(
    final GrantTypeEnum grantType,
    final String username,
    final String password)
```

##### Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `grantType` | [`GrantTypeEnum`](#grant-type) | Query, Required | The type of grant that will be used to authenticate the user.<br><br>* `client_credentials` - OAuth2 client credentials flow.<br>* `password` - OAuth2 password flow. |
| `username` | `String` | Query, Optional | The username to be used to authenticate the user. Only valid on for grant_type `password`. |
| `password` | `String` | Query, Optional | The password to be used to authenticate the user. Only valid on for grant_type `password`. |

##### Response Type

[`AuthToken`](#auth-token)

##### Example Usage

```java
GrantTypeEnum grantType = GrantTypeEnum.CLIENT_CREDENTIALS;

oAuthTokenController.getOAuthTokenAsync(grantType, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

##### Example Response *(as JSON)*

```json
{
  "access_token": "261e80be-58e1-4ecf-8f24-c1cc3f8ff168",
  "token_type": "bearer",
  "expires_in": 1800,
  "scope": "read write"
}
```

##### Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid Request | [`ErrorException`](#error) |
| 401 | Unauthorized Request | [`ErrorException`](#error) |

### Vendor

#### Overview

Manages vendors in FI.SPAN platform.

##### Get instance

An instance of the `VendorController` class can be accessed from the API Client.

```
VendorController vendorController = client.getVendorController();
```

#### List Vendors

This API will search FI.SPAN vendors associated with the logged in client or service provider and return
all the vendors found paginated. The default page size is 20. The page number and its size can be changed
using the optional parameter below

* `page`: The page number to be returned.
* `size`: The size of the page to be returned.

```java
CompletableFuture<List<Vendor>> listVendorsAsync(
    final Integer page,
    final Integer size)
```

##### Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | The page number to be returned. It goes from 0 to N, where N depends on the number of records.<br>**Constraints**: `>= 0`, *Multiple Of*: `1` |
| `size` | `Integer` | Query, Optional | The number of records retrieved per page. Defaults to 20 and goes up to 1000, even if<br>it's set to a number greater than 1000.<br>**Default**: `20`<br>**Constraints**: `>= 1`, *Multiple Of*: `1` |

##### Response Type

[`List<Vendor>`](#vendor-1)

##### Example Usage

```java
Integer size = 20;

vendorController.listVendorsAsync(null, size).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Model Reference

### Structures

* [Auth Token](#auth-token)
* [Erp Id](#erp-id)
* [Bank Account](#bank-account)
* [Base Payment Method](#base-payment-method)
* [E Check](#e-check)
* [EMT](#emt)
* [Address](#address)
* [Subject of Payment](#subject-of-payment)
* [Vendor](#vendor-1)

#### Auth Token

##### Class Name

`AuthToken`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccessToken` | `String` | Optional | The access token in GUID format.<br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36` | String getAccessToken() | setAccessToken(String accessToken) |
| `TokenType` | `String` | Optional | The type of the token. | String getTokenType() | setTokenType(String tokenType) |
| `ExpiresIn` | `Integer` | Optional | The duration in seconds of the token before it expires. | Integer getExpiresIn() | setExpiresIn(Integer expiresIn) |
| `Scope` | `String` | Optional | The scope of the generated token. | String getScope() | setScope(String scope) |

##### Example (as JSON)

```json
{
  "access_token": null,
  "token_type": null,
  "expires_in": null,
  "scope": null
}
```

#### Erp Id

##### Class Name

`ErpId`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The internal idenification for the ERP. | String getId() | setId(String id) |
| `ErpProvider` | [`ErpProviderEnum`](#erp-provider) | Optional | The erp's provider. | ErpProviderEnum getErpProvider() | setErpProvider(ErpProviderEnum erpProvider) |

##### Example (as JSON)

```json
{
  "id": null,
  "erpProvider": null
}
```

#### Bank Account

The bank account associated with the payment methods.

##### Class Name

`BankAccount`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The bank account identification | String getId() | setId(String id) |
| `ExternalId` | `String` | Optional | Bank specific account id | String getExternalId() | setExternalId(String externalId) |
| `ErpIds` | [`List<ErpId>`](#erp-id) | Optional | The ERP providers for the bank account<br>**Constraints**: *Minimum Items*: `0` | List<ErpId> getErpIds() | setErpIds(List<ErpId> erpIds) |
| `AccountLabel` | `String` | Optional | A label to help identifying the account. | String getAccountLabel() | setAccountLabel(String accountLabel) |
| `AccountHolderName` | `String` | Optional | Legal entity or subsidiary name. Is used to override Client's name in payables. | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `BankName` | `String` | Optional | The name of the bank | String getBankName() | setBankName(String bankName) |
| `InstitutionNumber` | `String` | Optional | The number of the institution. We can also call it the bank number. Required for Canadian bank accounts | String getInstitutionNumber() | setInstitutionNumber(String institutionNumber) |
| `TransitNumber` | `String` | Optional | The branch identification. Required for Canadian bank accounts | String getTransitNumber() | setTransitNumber(String transitNumber) |
| `RoutingNumber` | `String` | Optional | Required for US bank accounts. This field is masked. | String getRoutingNumber() | setRoutingNumber(String routingNumber) |
| `AccountNumber` | `String` | Optional | Required for both Canadian and US bank accounts. This field is masked. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `EnabledProducts` | [`List<ProductTypeEnum>`](#product-type) | Optional | The products that are enabled for the given bank account. | List<ProductTypeEnum> getEnabledProducts() | setEnabledProducts(List<ProductTypeEnum> enabledProducts) |

##### Example (as JSON)

```json
{
  "id": null,
  "externalId": null,
  "erpIds": null,
  "accountLabel": null,
  "accountHolderName": null,
  "bankName": null,
  "institutionNumber": null,
  "transitNumber": null,
  "routingNumber": null,
  "accountNumber": null,
  "enabledProducts": null
}
```

#### Base Payment Method

##### Class Name

`BasePaymentMethod`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | The type of the payment. | String getType() | setType(String type) |
| `Default` | `Boolean` | Optional | Indicates if the given payment method is to be used by default. | Boolean getDefault() | setDefault(Boolean mDefault) |
| `BankAccount` | [`BankAccount`](#bank-account) | Optional | The bank account associated with the payment methods. | BankAccount getBankAccount() | setBankAccount(BankAccount bankAccount) |

##### Example (as JSON)

```json
{
  "type": null,
  "default": null,
  "bankAccount": null
}
```

#### E Check

##### Class Name

`ECheck`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | The type of the payment. | String getType() | setType(String type) |
| `Default` | `Boolean` | Optional | Indicates if the given payment method is to be used by default. | Boolean getDefault() | setDefault(Boolean mDefault) |
| `BankAccount` | [`BankAccount`](#bank-account) | Optional | The bank account associated with the payment methods. | BankAccount getBankAccount() | setBankAccount(BankAccount bankAccount) |
| `Email` | `String` | Optional | The email associated with the EMT payment method. | String getEmail() | setEmail(String email) |
| `Name` | `String` | Optional | The name associated with the EMT payment method. | String getName() | setName(String name) |

##### Example (as JSON)

```json
{
  "type": null,
  "default": null,
  "bankAccount": null,
  "email": null,
  "name": null
}
```

#### EMT

##### Class Name

`EMT`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | The type of the payment. | String getType() | setType(String type) |
| `Default` | `Boolean` | Optional | Indicates if the given payment method is to be used by default. | Boolean getDefault() | setDefault(Boolean mDefault) |
| `BankAccount` | [`BankAccount`](#bank-account) | Optional | The bank account associated with the payment methods. | BankAccount getBankAccount() | setBankAccount(BankAccount bankAccount) |
| `Email` | `String` | Optional | The email associated with the EMT payment method. | String getEmail() | setEmail(String email) |

##### Example (as JSON)

```json
{
  "type": null,
  "default": null,
  "bankAccount": null,
  "email": null
}
```

#### Address

The address associated with the subject of payment.

##### Class Name

`Address`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExternalId` | `String` | Optional | The external identification for the address. | String getExternalId() | setExternalId(String externalId) |
| `StreetName` | `String` | Optional | The name of the street. | String getStreetName() | setStreetName(String streetName) |
| `StreetNumber` | `String` | Optional | The property number on the given street. | String getStreetNumber() | setStreetNumber(String streetNumber) |
| `City` | `String` | Optional | The city where the address is located | String getCity() | setCity(String city) |
| `StateProvince` | `String` | Optional | The state or province where the address is located. | String getStateProvince() | setStateProvince(String stateProvince) |
| `Country` | `String` | Optional | The country where the address is located. | String getCountry() | setCountry(String country) |
| `PostalCode` | `String` | Optional | The address' postal code. | String getPostalCode() | setPostalCode(String postalCode) |
| `Line1` | `String` | Optional | The line 1 for the address. | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Optional | The line 2 for the address. | String getLine2() | setLine2(String line2) |
| `Types` | [`List<AddressTypeEnum>`](#address-type) | Optional | The types of the address.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `2` | List<AddressTypeEnum> getTypes() | setTypes(List<AddressTypeEnum> types) |
| `DefaultFor` | [`List<PaymentTypeEnum>`](#payment-type) | Optional | Indicates what payment types will use this address as their default address<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `14` | List<PaymentTypeEnum> getDefaultFor() | setDefaultFor(List<PaymentTypeEnum> defaultFor) |

##### Example (as JSON)

```json
{
  "externalId": "null",
  "streetName": "Main Avenue",
  "streetNumber": "125",
  "city": "New York",
  "stateProvince": "NY",
  "country": "United States of America",
  "postalCode": "95825",
  "line1": "null",
  "line2": "Suite 501",
  "types": [],
  "defaultFor": [
    "ACH"
  ]
}
```

#### Subject of Payment

##### Class Name

`SubjectOfPayment`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExternalId` | `String` | Optional | The external identification for the subject of payment. | String getExternalId() | setExternalId(String externalId) |
| `Type` | [`TypeEnum`](#type) | Optional | The subject of payment's type. | TypeEnum getType() | setType(TypeEnum type) |
| `TaxId` | `String` | Optional | Taxation identification number for the company.<br>**Constraints**: *Minimum Length*: `9`, *Maximum Length*: `9` | String getTaxId() | setTaxId(String taxId) |
| `PrincipleOfficerDoB` | `LocalDate` | Optional | Date of Birth is of principle officer within the organization. | LocalDate getPrincipleOfficerDoB() | setPrincipleOfficerDoB(LocalDate principleOfficerDoB) |
| `Ssn` | `String` | Optional | SSN is of principle officer within the organization. SSN length is either 4 or 10 characters long<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `10` | String getSsn() | setSsn(String ssn) |
| `AvailablePaymentMethods` | [`List<PaymentTypeEnum>`](#payment-type) | Optional | - | List<PaymentTypeEnum> getAvailablePaymentMethods() | setAvailablePaymentMethods(List<PaymentTypeEnum> availablePaymentMethods) |
| `RegisteredPaymentMethods` | `List<Object>` | Optional | The registered payment methods within the company. | List<Object> getRegisteredPaymentMethods() | setRegisteredPaymentMethods(List<Object> registeredPaymentMethods) |
| `Address` | [`Address`](#address) | Optional | The address associated with the subject of payment. | Address getAddress() | setAddress(Address address) |

##### Example (as JSON)

```json
{
  "externalId": null,
  "type": null,
  "taxId": null,
  "principleOfficerDoB": null,
  "ssn": null,
  "availablePaymentMethods": null,
  "registeredPaymentMethods": null,
  "address": null
}
```

#### Vendor

##### Class Name

`Vendor`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The vendor id in GUID format.<br>**Constraints**: *Minimum Length*: `36`, *Maximum Length*: `36` | String getId() | setId(String id) |
| `ExternalId` | `String` | Optional | The vendor's external identification. | String getExternalId() | setExternalId(String externalId) |
| `SubjectOfPayment` | [`SubjectOfPayment`](#subject-of-payment) | Optional | - | SubjectOfPayment getSubjectOfPayment() | setSubjectOfPayment(SubjectOfPayment subjectOfPayment) |

##### Example (as JSON)

```json
{
  "id": null,
  "externalId": null,
  "subjectOfPayment": null
}
```

### Enumerations

* [Payment Type](#payment-type)
* [Erp Provider](#erp-provider)
* [Product Type](#product-type)
* [Address Type](#address-type)
* [Grant Type](#grant-type)
* [Type](#type)

#### Payment Type

The possible available payment methods.

##### Class Name

`PaymentTypeEnum`

##### Fields

| Name |
|  --- |
| `ACH` |
| `CHECK` |
| `CPA` |
| `EMT` |
| `RTP` |
| `VCC` |
| `POSITIVEPAY` |
| `WIRE` |
| `SEPA` |
| `BACS` |
| `INTERNATIONALWIRE` |
| `INTERNATIONALACH` |
| `ECHECK` |
| `A2ATRANSFER` |

#### Erp Provider

The erp's provider.

##### Class Name

`ErpProviderEnum`

##### Fields

| Name |
|  --- |
| `NONE` |
| `UNKNOWN` |
| `DUMMY` |
| `FRESHBOOKS` |
| `INTACCT` |
| `MYOB` |
| `NAVISION` |
| `NETSUITE` |
| `ORACLE` |
| `QUICKBOOKS` |
| `QUICKBOOKSDESKTOP` |
| `SAGE50` |
| `SAP` |
| `MSBUSINESSCENTRAL` |
| `MSBUSINESSCENTRALONPREM14` |
| `TESTERP` |
| `XERO` |
| `ACUMATICA` |

##### Example

```
NETSUITE
```

#### Product Type

##### Class Name

`ProductTypeEnum`

##### Fields

| Name |
|  --- |
| `PAYMENT` |
| `RECEIVABLE` |
| `LENDING` |
| `BANKACCOUNTINFO` |
| `VALIDATION` |
| `FXINFO` |
| `ENRICHMENT` |
| `REMITTANCE` |

#### Address Type

##### Class Name

`AddressTypeEnum`

##### Fields

| Name |
|  --- |
| `PAYMENT` |
| `CONTACT` |

#### Grant Type

##### Class Name

`GrantTypeEnum`

##### Fields

| Name |
|  --- |
| `ClientCredentials` |
| `Password` |

#### Type

The subject of payment's type.

##### Class Name

`TypeEnum`

##### Fields

| Name |
|  --- |
| `INDIVIDUAL` |
| `COMPANY` |

##### Example

```
INDIVIDUAL
```

### Exceptions

* [Error](#error)

#### Error

##### Class Name

`ErrorException`

##### Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Optional | The name of the error. | String getError() | setError(String error) |
| `ErrorDescription` | `String` | Optional | The description of the error | String getErrorDescription() | setErrorDescription(String errorDescription) |

##### Example (as JSON)

```json
{
  "error": null,
  "error_description": null
}
```

## Utility Classes Documentation

### ApiHelper Class

This is a Helper class with commonly used utilities for the SDK.

#### Fields

| Name | Description | Type |
|  --- | --- | --- |
| mapper | Deserialization of Json data. | `ObjectMapper` |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `serialize(Object obj)` | Json Serialization of a given object. | `String` |
| `deserialize(String json)` | Json deserialization of the given Json string. | `LinkedHashMap<String, Object>` |
| `deserialize(String json, Class<T> clazz)` | Json deserialization of the given Json string. | `<T extends Object> T` |
| `deserialize(String json, TypeReference<T> typeReference)` | JSON Deserialization of the given json string. | `<T extends Object> T` |
| `deserializeArray(String json, Class<T[]> classArray)` | JSON Deserialization of the given json string. | `<T extends Object> List<T>` |

### FileWrapper Class

Class to wrap file and contentType to be sent as part of a HTTP request.

#### Constructors

| Name | Description |
|  --- | --- |
| `FileWrapper(File file)` | Initialization constructor. |
| `FileWrapper(File file, String contentType)` | Initialization constructor. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getFile()` | File instance. | `File` |
| `getContentType()` | Content type of the file. | `String` |

### LocalDateTime Class

This is a utility class for DateTime operations.

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromUnixTimestamp(Long date)` | Parse a Unix Timestamp to a DateTime object. | `LocalDateTime` |
| `fromUnixTimestamp(String date)` | Parse a Unix Timestamp string to a DateTime object. | `LocalDateTime` |
| `toUnixTimestamp(LocalDateTime value)` | Convert a DateTime object to a Unix Timestamp string. | `String` |
| `toUnixTimestamp(List<LocalDateTime> values)` | Convert a List of DateTime objects to Unix Timestamp strings. | `List<String>` |
| `fromRfc1123DateTime(String date)` | Parse a datetime string in Rfc1123 format to a DateTime object. | `LocalDateTime` |
| `toRfc1123DateTime(LocalDateTime value)` | Convert a DateTime object to a Rfc1123 formatted string. | `String` |
| `toRfc1123DateTime(List<LocalDateTime> values)` | Convert a List of DateTime objects to Rfc1123 formatted strings. | `List<String>` |
| `fromRfc8601DateTime(String date)` | Parse a datetime string in Rfc8601(Rfc3339) format to a DateTime object. | `LocalDateTime` |
| `toRfc8601DateTime(LocalDateTime value)` | Convert a DateTime object to a Rfc8601(Rfc3339) formatted string. | `String` |
| `toRfc8601DateTime(List<LocalDateTime> values)` | Convert a List of DateTime objects to Rfc8601(Rfc3339) formatted strings. | `List<String>` |
| `fromSimpleDate(String date)` | Parse a simple date string to a LocalDate object. | `LocalDate` |
| `toSimpleDate(LocalDate value)` | Convert a LocalDate object to a string. | `String` |
| `toSimpleDate(List<LocalDate> values)` | Convert a List of LocalDate objects to strings. | `List<String>` |

## Common Code Documentation

### HttpRequest Class

Class for creating and managing HTTP Requests.

#### Constructors

| Name | Description |
|  --- | --- |
| `HttpRequest(HttpMethod method, StringBuilder queryUrlBuilder, Headers headers, Map<String, Object> queryParameters, List< SimpleEntry < String, Object >> parameters)` | Initializes a simple http request. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getHttpMethod()` | HttpMethod for the http request. | `HttpMethod` |
| `getHeaders()` | Headers for the http request. | `Headers` |
| `getQueryUrl()` | Query url for the http request. | `String` |
| `getParameters()` | Parameters for the http request. | `List<SimpleEntry<String, Object>>` |
| `getQueryParameters()` | Query parameters for the http request. | `Map<String, Object>` |
| `addQueryParameter(String key, Object value)` | Add Query parameter in http request. | `void` |

### HttpResponse Class

Class to hold HTTP Response.

#### Constructors

| Name | Description |
|  --- | --- |
| `HttpResponse(int code, Headers headers, InputStream rawBody)` | Constructor for HttpResponse. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getStatusCode()` | HTTP Status code of the http response.. | `int` |
| `getHeaders()` | Headers of the http response. | `Headers` |
| `getRawBody()` | Raw body of the http response. | `InputStream` |

### HttpStringResponse Class

Class to hold response body as string.

#### Constructors

| Name | Description |
|  --- | --- |
| `HttpStringResponse(int code, Headers headers, InputStream rawBody, String body)` | Constructor for HttpStringResponse. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getStatusCode()` | HTTP Status code of the http response. | `int` |
| `getHeaders()` | Headers of the http response. | `Headers` |
| `getBody()` | String body of the http response. | `String` |

### HttpContext Class

Class to wrap the request sent to the server and the response received from the server.

#### Constructors

| Name | Description |
|  --- | --- |
| `HttpContext(HttpRequest request, HttpResponse response)` | Constructor for HttpContext. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getRequest()` | Getter for the Http Request. | `HttpRequest` |
| `getHttpContext()` | Getter for the Http Response. | `HttpContext` |

### HttpBodyRequest Class

HTTP Request with an explicit body.

#### Constructors

| Name | Description |
|  --- | --- |
| `HttpBodyRequest(HttpMethod method, StringBuilder queryUrlBuilder, Headers headers, Map<String, Object> queryParams, Object body)` | Create a request with explicit body. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getBody()` | Body for the http request. | `Object` |

### Headers Class

Class for creating and managing HTTP Headers.

#### Constructors

| Name | Description |
|  --- | --- |
| `Headers()` | Default constructor. |
| `Headers(Map<String, List<String>> headers)` | Constructor that creates a new instance using a given Map. |
| `Headers(Headers h)` | Copy Constructor. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `has(String headerName)` | Use to check if the given name is present in headers. | `boolean` |
| `names()` | Returns a Set containing all header names. | `Set<String>` |
| `value(String headerName)` | Returns the first value associated with a given header name, or null if the header name is not found. | `String` |
| `values(String headerName)` | Returns a List of all values associated with a given header name, or null if the header name is not found. | `List<String>` |
| `asSimpleMap()` | Returns a Map of the headers, giving only one value for each header name. | `Map<String, String>` |
| `asMultimap()` | Returns a simulated MultiMap of the headers. | `Map<String, List<String>>` |
| `cloneHeaderMap(Map<String, List<String>> headerMap)` | Clones a header map. | `Map<String, List<String>>` |
| `add(String headerName, String value)` | Adds a value for a header name to this object. | `void` |
| `add(String headerName, List<String> values)` | Adds a List of values for a header name to this object. | `void` |
| `addAllFromMap(Map<String, String> headers)` | Adds values from a Map to this object. | `void` |
| `addAllFromMultiMap(Map<String, List<String>> headers)` | Adds values from a simulated Multi-Map to this object. | `void` |
| `addAll(Headers headers)` | Adds all the entries in a Headers object to this object. | `void` |
| `remove(String headerName)` | Removes the mapping for a header name if it is present. | `List<String>` |

### ApiException Class

This is the base class for all exceptions that represent an error response from the server.

#### Constructors

| Name | Description |
|  --- | --- |
| `ApiException(String reason)` | Initialization constructor. |
| `ApiException(String reason, HttpContext context)` | Initialization constructor. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getResponseCode()` | The HTTP response code from the API request | `int` |
| `getHeaders()` | The HTTP response body from the API request. | `Headers` |

### Configuration Interface

This is the base class for all exceptions that represent an error response from the server.

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClientConfig()` | Http Client Configuration instance.<br>* See available [builder methods here](#httpclientconfigurationbuilder-class). | `ReadonlyHttpClientConfiguration` |
| `getAccessToken()` | OAuth 2.0 Access Token. | `String` |
| `getBaseUri(Server server)` | Get base URI by current environment. | `String` |
| `getBaseUri()` | Get base URI by current environment. | `String` |

### HttpClientConfiguration Class

Class for holding http client configuration.

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getTimeout()` | The timeout in seconds to use for making HTTP requests. | `long` |
| `getNumberOfRetries()` | The number of retries to make. | `int` |
| `getBackOffFactor()` | To use in calculation of wait time for next request in case of failure. | `int` |
| `getRetryInterval()` | To use in calculation of wait time for next request in case of failure. | `long` |
| `getHttpStatusCodesToRetry()` | Http status codes to retry against. | `Set<Integer>` |
| `getHttpMethodsToRetry()` | Http methods to retry against. | `Set<HttpMethod>` |
| `getMaximumRetryWaitTime()` | The maximum wait time for overall retrying requests. | `long` |
| `shouldRetryOnTimeout()` | Whether to retry on request timeout. | `boolean` |
| `getHttpClientInstance()` | The OkHttpClient instance used to make the HTTP calls. | `okhttp3.OkHttpClient` |
| `shouldOverrideHttpClientConfigurations()` | Allow the SDK to override HTTP client instance's settings used for features like retries, timeouts etc. | `boolean` |
| `toString()` | Converts this HttpClientConfiguration into string format. | `String` |
| `newBuilder()` | Builds a new {@link HttpClientConfiguration.Builder} object. Creates the instance with the current state. | `HttpClientConfiguration.Builder` |

### HttpClientConfiguration.Builder Class

Class to build instances of {@link HttpClientConfiguration}.

#### Constructors

| Name | Description |
|  --- | --- |
| `Builder()` | Default Constructor to initiate builder with default properties. |

#### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `timeout(long timeout)` | Sets the timeout in seconds to use for making http requests. | `Builder` |
| `numberOfRetries(int numberOfRetries)` | Sets the number of retries to make. | `Builder` |
| `backOffFactor(int backOffFactor)` | Sets to use in calculation of wait time for next request in case of failure. | `Builder` |
| `retryInterval(long retryInterval)` | Sets to use in calculation of wait time for next request in case of failure. | `Builder` |
| `httpStatusCodesToRetry(Set<Integer> httpStatusCodesToRetry)` | Sets http status codes to retry against. | `Builder` |
| `httpMethodsToRetry(Set<HttpMethod> httpMethodsToRetry)` | Sets http methods to retry against. | `Builder` |
| `maximumRetryWaitTime(long maximumRetryWaitTime)` | Sets the maximum wait time for overall retrying requests. | `Builder` |
| `shouldRetryOnTimeout(boolean shouldRetryOnTimeout)` | Sets whether to retry on request timeout. | `Builder` |
| `httpClientInstance(okhttp3.OkHttpClient httpClientInstance)` | Sets the okhttpclient instance used to make the http calls. | `Builder` |
| `httpClientInstance(okhttp3.OkHttpClient httpClientInstance, boolean overrideHttpClientConfigurations)` | Sets the okhttpclient instance used to make the http calls and an option to Allow the SDK to override HTTP client instance's settings used for features like retries, timeouts etc. | `Builder` |
| `build()` | Builds a new HttpClientConfiguration object using the set fields. | `HttpClientConfiguration` |

