import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LinkedListTest {
	
	
	
	public static void main(String[] args) throws IOException {
		Employee emp1 = new Employee(101,"Jack",10000);
		Employee emp2 = new Employee(102,"Jane",20000);
		Employee emp3 = new Employee(103,"Jill",30000);
		Employee emp = new Employee(100,"Omkar",300000);
		Employee emp4 = new Employee(106,"Sanket",300000);
		
		
		MyLinkedList list = new MyLinkedList();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
//		list.add_begining(emp);
//		list.addAfter(emp4, 101);
//		list.printAll();
//		list.deleteLast();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Employee id to delete");
//		int a = sc.nextInt();
//		
//		list.delete(a);
//		
//		list.printAll();
//		list.deleteAll();
		list.printAll();
		
		FileOutputStream fs =new  FileOutputStream("data.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(emp);
		os.close();
		fs.close();
		
		
		
	}

	

}

class MyLinkedList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Employee head = null;
	Employee current = null;
	
	void add(Employee node) {
		if(head == null) {
			head = node;
			current = node;
			current.next = null;
			current.prev = null;
		}
		else {
			current.next = node;
			node.prev = current;
			current = node;
		}
	}
	void printAll(){
		Employee curr = head;
		while(curr!= null) {
			System.out.println(curr);
			curr = curr.next;
		}
	}
	void add_begining(Employee node) {
		if(head == null) {
			head = node;
			current = node;
			current.next = null;
			current.prev = null;
		}
		else {
			//Employee temp = null;
			//temp = head;
			node.next = head;
			head = node;
			
		}
	}
	void addAfter(Employee node, int empNumber) {
		if(head == null) {
			head = node;
			current = node;
			current.next = null;
			current.prev = null;
		}
		else {
			Employee ptr = head;
			Employee finder = null;
			while(ptr!=null) {
				if(ptr.getEmpNumber()== empNumber) {
					finder = ptr;
					Employee temp = finder.next;
					node.next = temp;
					finder.next = node;
					break;	
				}
				ptr= ptr.next;
				
			}
		}
	}
	
	public void deleteAll() {
		this.head = null;
		System.out.println("Deleted All");
	}
	public void delete(int empNumber) {
		Employee ptr = head;
		
		while(ptr.next != null) {
			if(ptr.next.getEmpNumber()== empNumber) {
				Employee temp = ptr.next;
				Employee temp1 = temp.next;
				ptr.next = temp1;
				break;
			}
			ptr = ptr.next;
		}
	}
	public void deleteLast() {
		Employee ptr = head;
		while(ptr!= null) {
			if(ptr.next.next == null) ptr.next= null; 
			
			ptr= ptr.next;
		}
		
	}
	

}


class Employee implements Serializable{
	private int empNumber;
	
	private String empName;
	
	private float empSalary;
	
	Employee next;
	Employee prev;
	
	public Employee(int empNumber, String empName, float empSalary) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.empSalary = empSalary;
		
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	
	
	
	
}
