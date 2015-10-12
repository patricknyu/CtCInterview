###Q:
Write an SQL query to get a list of tenants who are renting more than one apartment.

###A:

```sql
SELECT Tenants.TenantName
FROM Tenants INNER JOIN
(SELECT TenantID
FROM AptTenants
GROUP BY (TenantID)
WHERE count(*) > 1) as Temp
ON Tenants.TennantID = Temp.TenantID
```
