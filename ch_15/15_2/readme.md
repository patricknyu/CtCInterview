###Q:
Write a SQL query to get a list of all buildings and the number of open requests (Request in which status equals 'Open').

###A:

```sql
SELECT BuildingName, ISNULL(Count,0) as 'Count'
FROM Buildings
LEFT JOIN
(SELECT BuildingID, count(*) as 'Count'
FROM Apartments
INNER JOIN
Requests
ON Apartments.AptID = Requests.AptID
WHERE Requests.Status = 'Open')
as Temp
ON Buildings.BuildingID = Temp.BuildingID
```
