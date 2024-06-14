# criptobites

<details>
<summary>healthcheck endpoint</summary>

### request

```http
GET /healthcheck HTTP/1.1
Host: https://hello-world-app.redbush-14610476.eastus.azurecontainerapps.io/
```

### response

```http
200 OK
Body:
OK
```

</details>

<details>
<summary>register endpoint</summary>

### request

```http
POST /register HTTP/1.1
Host: https://hello-world-app.redbush-14610476.eastus.azurecontainerapps.io/
Content-Type: application/json
Body:
{
    "full_name": "lucas",
    "phone_number": "219999999",
    "email": "email",
    "password": "senha"
}
```

### response

```http
201 CREATED
Content-Type: application/json
Body:
{
    "full_name": "lucas",
    "email": "email",
}
```

</details>

<details>
<summary>login endpoint</summary>

### request

```http
POST /login HTTP/1.1
Host: https://hello-world-app.redbush-14610476.eastus.azurecontainerapps.io/
Content-Type: application/json
Body:
{
    "email": "email",
    "password": "senha"
}
```

### response

```http
200 OK
Content-Type: application/json
Body:
{
    "full_name": "lucas",
    "email": "email",
}
```

</details>
