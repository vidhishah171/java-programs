package javacollections;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1,"Vidhi","Developer","Ahmedabad","17 Jan 2000"));
		empList.add(new Employee(4,"Nidhi","Developer","Surat","17 Jun 2000"));
		empList.add(new Employee(3,"Shikha","QA","Jamnagar","14 August 1994"));
		empList.add(new Employee(2,"Aditi","Programmer","Ahmedabad","15 Oct 2002"));
		empList.forEach(e -> System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpDesignation()));
		Map<Integer,String> empMap=new HashMap<Integer, String>();
		for(Employee e:empList) {
			empMap.put(e.getEmpId(),e.getEmpName()+", "+e.getEmpAddress()+", "+e.getEmpDesignation()+", "+e.getEmpDob());
		}
//		System.out.println(empMap);
		for(Map.Entry<Integer,String> entry:empMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		ArrayList<String> list=new ArrayList<>();
		for(Map.Entry<Integer, String> e:empMap.entrySet()) {
			list.add(e.getKey()+":"+e.getValue());
		}
		System.out.println("List");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		List<Employee> record=empList.stream().filter(e -> e.getEmpDesignation()=="Developer" || e.getEmpAddress()=="Ahmedabad").collect(Collectors.toList());
		record.forEach(e -> System.out.println(e.getEmpId()+":"+e.getEmpName()+", "+e.getEmpDesignation()));
	}

}
