package com.prateek.springootweb.springbootweb.controllers;

import com.prateek.springootweb.springbootweb.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController // Marks this class as a REST controller to handle HTTP requests.
@RequestMapping(path = "/employees") // Base URL for all endpoints in this controller.
public class EmployeeController {

    /**
     * Endpoint to fetch an employee by their ID.
     * HTTP Method: GET
     * Path: /employees/{employeeId}
     *
     * @param Id The employee's unique identifier, passed as a path variable.
     * @return An EmployeeDTO object representing the employee details.
     */
    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeByID(@PathVariable(name = "employeeId") Long Id) {
        // Simulate returning an employee's details.
        return new EmployeeDTO("Prateek Gupta", Id, "prateekparauliya@gmail.com", 22, LocalDate.of(2024, 11, 20), true);
    }

    /**
     * Endpoint to fetch all employees with optional query parameters for filtering and sorting.
     * HTTP Method: GET
     * Path: /employees
     *
     * @param age    Optional query parameter to filter employees by age.
     * @param sortBy Optional query parameter to sort the employees by a specific field.
     * @return A string response indicating the query parameters.
     */
    @GetMapping
    public String getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age,
                                  @RequestParam(required = false) String sortBy) {
        return "Hi my age :" + age + " " + sortBy;
    }

    /**
     * Endpoint to create a new employee.
     * HTTP Method: POST
     * Path: /employees
     *
     * @param inputEmployee The employee details sent in the request body.
     * @return The created EmployeeDTO object with an assigned ID.
     */
    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
        inputEmployee.setId(1000L); // Assign a new ID to the employee.
        return inputEmployee;
    }

    /**
     * Endpoint to update an employee's details completely (all fields).
     * HTTP Method: PUT
     * Path: /employees
     *
     * @return A string response indicating the update operation.
     */
    @PutMapping
    public String updateEmployeeById() {
        return "Hello from Put";
    }

    /**
     * Endpoint to delete an employee by their ID.
     * HTTP Method: DELETE
     * Path: /employees
     *
     * @return A string response indicating the delete operation.
     */
    @DeleteMapping
    public String deleteEmployeeById() {
        return "Hello from Delete";
    }

    /**
     * Endpoint to partially update an employee's details (specific fields).
     * HTTP Method: PATCH
     * Path: /employees
     *
     * @return A string response indicating the patch operation.
     */
    @PatchMapping
    public String patchEmployeeById() {
        return "Hello from Patch";
    }
}
