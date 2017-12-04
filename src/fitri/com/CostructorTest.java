package fitri.com;

import fitri.com.Employee;
public class CostructorTest {
    public static void main(String[] args) {
        
        Departement dep = new Departement("Finance Departement");
        dep.setSddress("Sudirman Street");
        dep.setEmail("finance@indocyber.co.id");
        dep.setPhoneNumber("021-1293878364");
        
        Student pelajar = new Student("Smith");
        System.out.println("");
        
        System.out.println(pelajar);
        
        fitri.com.Employee pegawai = new fitri.com.Employee();
        System.out.println("Nama : " + pegawai.employeeName);
        System.out.println("Gaji : " + pegawai.salary);
        
        Employee staff = new Employee("Engkus",200000.0);
        System.out.println("Nama : " + staff.employeeName);
        System.out.println("Gaji : " + staff.salary);
        System.out.println("Umur : " + staff.age);
        System.out.println(staff);
    }

    private static class Departmenet {

        public Departmenet() {
        }
    }
    
}
