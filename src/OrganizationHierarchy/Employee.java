package OrganizationHierarchy;

class Employee {
        String id;
        String firstName;
        String lastName;
        String reportsTo;

        public Employee(String id, String firstName, String lastName, String reportsTo) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.reportsTo = reportsTo;
        }

        public String getFullName() {
            return firstName + lastName + "(" + id + ")";
        }
    }

