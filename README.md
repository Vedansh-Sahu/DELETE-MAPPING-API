# Journal Application API (DELETE/POST Edition)

A Spring Boot-based backend module configured for journal entry creation and database cleanup operations in MongoDB. This version of the application exposes REST endpoints to write new logs, target specific records for deletion, or wipe the entire collection, returning simple boolean confirmations back to the client.

---

## 🚀 Features

* **Entry Creation**: Persists a new journal entry while automatically generating the record's creation timestamp.
* **Targeted Deletion**: Deletes a specific journal entry by its unique BSON `ObjectId` and returns a `true` status indicator upon execution.
* **Bulk Purging**: Clears the entire journal database collection in a single transaction, returning a `true` status confirmation.
* **Streamlined Return Signalling**: Uses lightweight boolean primitives for deletion mappings, simplifying status communication for consumer clients.

---

## 📂 Structural Overview

The application is structured into decoupled, single-responsibility layers:
* **Controller (`JournalEntryControllerV2`)**: Binds the endpoint paths under `/journal`, captures variables from path parameters, maps request bodies, and returns raw confirmation states.
* **Service (`JournalEntryService`)**: Implements internal routing logic, bridging the request controllers with repository interactions.
* **Repository (`JournalEntryRepository`)**: Connects directly to the underlying MongoDB database to handle record creations and absolute deletion queries.

---

## 🛣️ Active API Endpoints

All endpoints are hosted under the base mapping prefix: `/journal`

| Method | Endpoint | Description | Payload / Path Parameters | Returns |
| :--- | :--- | :--- | :--- | :--- |
| **POST** | `/journal` | Adds a new journal entry to the database and configures its timestamp. | Requires a JSON representation of `JournalEntry` in the body. | `JournalEntry` (created entity) |
| **DELETE** | `/journal/id/{myId}` | Deletes a single journal entry associated with the provided ID. | Requires a valid MongoDB hexadecimal `ObjectId` as `{myId}`. | `boolean` (`true`) |
| **DELETE** | `/journal` | Erases all journal entries from the collection database. | None. | `boolean` (`true`) |

---

## 🛠️ Technology Stack

* **Java** (JDK 17+)
* **Spring Boot Framework** (Spring Web)
* **Spring Data MongoDB**
* **BSON Types** (`ObjectId`)

---

## ⚡ Quick Start

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/delete-mapping-api.git](https://github.com/your-username/delete-mapping-api.git)
