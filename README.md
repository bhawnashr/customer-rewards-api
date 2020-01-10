# Customer-Reward-Api

This Api calculates reward points per month and the total reward of a customer by using data from H2 database, which is an in-memory database.

## Instructions to use this Api

1.  ```mvn clean install```

2. Run the Application: 
```
mvn spring-boot:run
```
3. To check Rewards of a customer, use this api endpoint: 

```http://localhost:8080/customer-rewards-api/transaction/{customerId} ```                
e.g:
http://localhost:8080/customer-rewards-api/transaction/customer-1

Response :

```json
{
"monthlyRewards": {
"2019-12": 90
},
"totalReward": 90
}
```
http://localhost:8080/customer-rewards-api/transaction/customer-2
```json
{
"monthlyRewards": {
"2020-02": 52,
"2019-12": 270,
"2019-11": 360
},
"totalReward": 682
}

```
## Technologies Used 

Java 8, Spring boot, H2 database, Junit and mockito.