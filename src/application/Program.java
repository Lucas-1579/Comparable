package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entitie.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Temp\\in.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				String[] vect = line.split(",");
				list.add(new Employee(vect[0], Double.parseDouble(vect[1])));
				line = br.readLine();
			}
			
			Collections.sort(list);
			for(Employee s : list) {
				System.out.println(s.getName() + "," + s.getSalary());
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
