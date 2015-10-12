###Q:
Building # 11 is undergoing a major renovation.  Implement a query to close all requests from apartments in this building.

###A:

```sql
UPDATE Requests
SET Status = 'Closed'
WHERE AptID in
(SELECT AptID
FROM Apartments
WHERE Apartments.BuildingID = 11)
```
