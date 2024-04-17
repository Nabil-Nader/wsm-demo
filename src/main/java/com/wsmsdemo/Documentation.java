package com.wsmsdemo;

/**
 * Documentation for the WSMS Demo Application.
 * This class provides an overview of the application's structure and functionality.
 */
public class Documentation {

    /**
     * Controller Package: com.wsmsdemo.controller
     * Contains classes responsible for handling incoming HTTP requests and delegating business logic to the Service layer.
     * Classes:
     * - StaffController: Manages CRUD operations for Staff entities. Utilizes StaffService for business logic execution.
     */

    /**
     * Entity Package: com.wsmsdemo.model
     * Comprises classes that represent the data model of the application.
     * Classes:
     * - ListModel: Represents a staff entity with attributes such as staff_name, check_code, is_delete, is_lock, and error_check_code_counter.
     */

    /**
     * Service Package: com.wsmsdemo.service
     * Includes classes that implement the core business logic of the application, interacting with the Repository layer for data access.
     * Classes:
     * - StaffService: Provides services for managing Staff entities, including create, update, delete, and partial update operations. Interacts with StaffRepository for data persistence.
     */

    /**
     * Repository Package: com.wsmsdemo.repository
     * Contains interfaces for data access and manipulation. Extends JpaRepository for CRUD operations and custom queries.
     * Classes:
     * - StaffRepository: Manages data access for Staff entities. Supports operations like finding by staffName, isLock, and isDelete.
     */
}
