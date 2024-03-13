package javacollections;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import reflection.Parent2;
import java.io.*;

public class ArrayListTest{
	static void iteration(ArrayList<?> list) {
		Iterator<?> iter=list.iterator();
		while(iter.hasNext()) {
			//Object obj=iter.next();
			System.out.println(iter.next());
		}
	}
	
	static void serializeDeserialize(ArrayList<?> alist) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Java Programs\\helloworld\\bin\\javacollections\\Serialize.txt"));
		oos.writeObject(alist);
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Java Programs\\helloworld\\bin\\javacollections\\Serialize.txt"));
		ArrayList<?> list=(ArrayList<?>) ois.readObject();
		System.out.println(list);
	}
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("value1");
		arrayList.add("value2");
		arrayList.add("value1");
		arrayList.add("value2");
		System.out.println(arrayList);
		System.out.println("3rd value: "+arrayList.get(2));
		Iterator<String> itr=arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		arrayList.remove("value1");
		arrayList.set(0, "value3");
		Collections.sort(arrayList);
		serializeDeserialize(arrayList);
		arrayList.add(3,"value4");
		System.out.println();
		for(String value:arrayList) {
			System.out.println(value);
		}
		System.out.println();
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Cherry");
		fruits.add("Strawberry");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.addAll(1,arrayList);
		System.out.println(fruits);
		fruits.removeAll(arrayList);
		System.out.println(fruits);
		fruits.removeIf(str->str.contains("tr"));
		System.out.println(fruits);
		while(!fruits.isEmpty()) {
			fruits.remove(0);
		}
		System.out.println(fruits);
		System.out.println();
		
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		System.out.print("| ");
		intList.forEach((n)-> System.out.print(n+" | "));
		System.out.println();
		System.out.println(intList.subList(1,3));
		//intList.removeRange(1,3);
		System.out.println(intList);
		
		System.out.println();
		ListIterator<String> listIter=arrayList.listIterator(arrayList.size());
		
		while(listIter.hasPrevious()) {
			System.out.println("Next-"+listIter.nextIndex()+" PreviousIndex-"+listIter.previousIndex()+" "+listIter.previous());
			
		}
		listIter.set("Valuex");
		while(listIter.hasNext()) {
			System.out.println(listIter.next());			
		}
		
		Parent2 parentobj=new Parent2(1,"Vidhi","Shah");
		Parent2 parentobj1=new Parent2(2,"Shah","Vidhi");
		ArrayList<Parent2> parentObjList = new ArrayList<Parent2>();
		parentObjList.add(parentobj1);
		parentObjList.add(new Parent2(0,"XYZ",null));
		parentObjList.add(parentobj);
		System.out.println();
		parentObjList.forEach((x)-> System.out.println(x.getFirstName()+"_"+x.getLastName()+"_"+x.getVar()));
		System.out.println();
		//Collections.sort(parentObjList);
		Comparator<Parent2> cmp=Comparator.comparing(Parent2::getLastName,Comparator.nullsLast(Comparator.naturalOrder()));
		Collections.sort(parentObjList,cmp);
		Collections.sort(parentObjList,(p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		Collections.sort(parentObjList,(p1,p2) -> p1.compareTo(p2));
//		Collections.sort(parentObjList,Comparator.comparingInt(Parent2::getVar));
		Iterator<Parent2> iter=parentObjList.iterator();
		while(iter.hasNext()) {
			Parent2 p=iter.next();
			System.out.println(p.getVar()+" "+p.getFirstName()+" "+p.getLastName());
		}
		CopyOnWriteArrayList<Integer> intListx=new CopyOnWriteArrayList<Integer>();
		intListx.add(1);
		intListx.add(2);
		intListx.add(3);
		intListx.add(4);
		Iterator<Integer> it = intListx.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i==2) {
//				it.remove();
				intListx.remove(i);
			}
		}
		System.out.println(intListx);

	}

}
