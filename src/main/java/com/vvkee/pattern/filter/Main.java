package com.vvkee.pattern.filter;

import java.util.List;

import com.google.common.collect.Lists;

public class Main {

	public static void main(String[] args) {

		List<Person> persons = Lists.newArrayList();
		persons.add(new Person("Xuhf", GenderEnum.MALE.name(), "Married"));
		persons.add(new Person("Lijie", GenderEnum.FEMALE.name(), "Married"));
		persons.add(new Person("Bill", GenderEnum.MALE.name(), "Single"));
		persons.add(new Person("Andy", GenderEnum.MALE.name(), "Single"));
		persons.add(new Person("HanMeimei", GenderEnum.FEMALE.name(), "Single"));
		persons.add(new Person("XiaoMing", GenderEnum.MALE.name(), "Single"));
		persons.add(new Person("hudor", GenderEnum.MALE.name(), "Married"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();

		Criteria single = new CriteriaSingle();
		Criteria married = new CriteriaMarried();

		Criteria maleAndMarried = new AndCriteria(male, married);
		Criteria maleOrMarried = new OrCriteria(male, married);

		System.out.println("male and married");
		System.out.println(maleAndMarried.meetCriteria(persons));

		System.out.println("male or married");
		System.out.println(maleOrMarried.meetCriteria(persons));

		System.out.println("female and married");
		Criteria femaleAndMarried = new AndCriteria(female, married);
		System.out.println(femaleAndMarried.meetCriteria(persons));

		System.out.println("female or married");
		Criteria femaleOrMarried = new OrCriteria(female, married);
		System.out.println(femaleOrMarried.meetCriteria(persons));
	}
}
