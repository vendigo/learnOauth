## Users

| username | password  | encoded                                                      | roles                 |
|----------|-----------|--------------------------------------------------------------|-----------------------|
| vendigo  | adminpass | $2a$10$ZFKXBIIJk15AXtkn7bRsEu.XDXcKUi8v/CXHBy0OzX0Bsf7O02YbS | ROLE_ADMIN, ROLE_USER |
| petro    | userpass  | $2a$10$gLm1ImV7ymnn/3c.H00ue.lYt.Q9LO0dOFTPTATjtcOvOFJrdTysW | ROLE_USER             |

Getting token:

```cmd
curl -X POST \
  http://localhost:8080/oauth/token \
  -H 'Authorization: Basic YXV0aC1jbGllbnQ6YXV0aC1zZWNyZXQ=' \
  -H 'Cache-Control: no-cache' \
  -H 'content-type: multipart/form-data' \
  -F grant_type=password \
  -F username=vendigo \
  -F password=adminpass
 ```
 
 Getting movies:
 
```cmd
curl -X GET \
  http://localhost:8081/movies \
  -H 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1Mzc0NDY2MDcsInVzZXJfbmFtZSI6InZlbmRpZ28iLCJhdXRob3JpdGllcyI6WyJST0xFX1VTRVIiLCJST0xFX0FETUlOIl0sImp0aSI6IjBlZWI5NDNmLWE0MDUtNGRjMy1hNTMyLTdkYTI3ZjUwMjMwNiIsImNsaWVudF9pZCI6ImF1dGgtY2xpZW50Iiwic2NvcGUiOlsicHJvZmlsZSJdfQ.UftnJRkIxsrUygHB8kWUzis76gvXUhA3cGweAfywLsU' \
  -H 'Cache-Control: no-cache' \  
```
