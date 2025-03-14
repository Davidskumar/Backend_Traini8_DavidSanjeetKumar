# Backend_Traini8_DavidSanjeetKumar

## 🚀 Project Overview
This is a Spring Boot & MongoDB backend for managing Government-funded Training Centers.

## 📌 Tech Stack
- **Java 17**
- **Spring Boot 3.4.3**
- **MongoDB** (Using `MongoRepository` for database interaction)
- **Maven** (Dependency management)
- **Postman or Curl** (For API testing)

## 📌 Setup Instructions

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/yourusername/Backend_Traini8_DavidSanjeetKumar.git
cd Backend_Traini8_DavidSanjeetKumar
```

### **2️⃣ Install Dependencies & Build the Project**
```sh
mvn clean install
```

### **3️⃣ Start MongoDB** (If not already running)
```sh
mongod  # For Linux/Mac
net start MongoDB  # For Windows
```

### **4️⃣ Run the Project**
```sh
mvn spring-boot:run
```

### **5️⃣ Test API Endpoints**
Use **Postman** or **Curl** to test APIs.

---

## 📌 API Endpoints

### **1️⃣ Create Training Center (POST API)**
- **Endpoint:** `/api/training-centers`
- **Method:** `POST`
- **Request Body (JSON):**
```json
{
  "centerName": "Tech Academy",
  "centerCode": "TC1234567890",
  "address": {
    "detailedAddress": "123 Street",
    "city": "New Delhi",
    "state": "Delhi",
    "pincode": "110001"
  },
  "studentCapacity": 500,
  "coursesOffered": ["Java", "Python"],
  "contactEmail": "info@techacademy.com",
  "contactPhone": "9876543210"
}
```
- **Response (Success - 200 OK):**
```json
{
  "id": "65ffb4c9e3b1d4f2a8c9ab56",
  "centerName": "Tech Academy",
  "centerCode": "TC1234567890",
  "address": {
    "detailedAddress": "123 Street",
    "city": "New Delhi",
    "state": "Delhi",
    "pincode": "110001"
  },
  "studentCapacity": 500,
  "coursesOffered": ["Java", "Python"],
  "createdOn": 1675555555555,
  "contactEmail": "info@techacademy.com",
  "contactPhone": "9876543210"
}
```

### **2️⃣ Get All Training Centers (GET API)**
- **Endpoint:** `/api/training-centers`
- **Method:** `GET`
- **Response:**
```json
[
  {
    "id": "65ffb4c9e3b1d4f2a8c9ab56",
    "centerName": "Tech Academy",
    "centerCode": "TC1234567890",
    "studentCapacity": 500,
    "coursesOffered": ["Java", "Python"]
  }
]
```

### **3️⃣ Filter Training Centers by City**
- **Endpoint:** `/api/training-centers/city/{city}`
- **Example Request:**
```
GET /api/training-centers/city/New Delhi
```

### **4️⃣ Filter Training Centers by Course**
- **Endpoint:** `/api/training-centers/course/{course}`
- **Example Request:**
```
GET /api/training-centers/course/Java
```

---

## 📌 Features Implemented
✅ **Spring Boot API for Training Centers**  
✅ **MongoDB Integration**  
✅ **Validation using Annotations (`@NotBlank`, `@Pattern`, `@Min`, etc.)**  
✅ **CreatedOn field auto-generated**  
✅ **Exception Handling (`@ExceptionHandler`)**  
✅ **Filtering by City & Course**  
✅ **Performance Optimization (MongoDB Indexing)**  
✅ **Proper MVC Structure (`Controller → Service → Repository`)**  
✅ **Unit Tested & Ready for Deployment**  

---

## 📌 Deployment Instructions (Optional)
If you want to deploy this on a cloud platform like AWS or Heroku:
1. **Create a MongoDB Atlas Database** (or host MongoDB on a cloud instance)
2. **Modify `application.properties` to connect to the cloud database**
3. **Deploy using Docker, AWS Elastic Beanstalk, or Heroku**

---


