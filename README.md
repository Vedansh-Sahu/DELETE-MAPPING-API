🗑️ Delete API Endpoints
These endpoints handle the deletion of journal entries from the database.

1. Delete All Journal Entries
Deletes every journal entry present in the database.

URL: /journal

Method: DELETE

Auth Required: No

Permissions: Open

Response
Success Code: 200 OK

Content-Type: application/json

Response Body:

JSON
true
2. Delete Journal Entry by ID
Deletes a specific journal entry matching the provided unique MongoDB ObjectId.

URL: /journal/id/{myId}

Method: DELETE

Auth Required: No

Permissions: Open
