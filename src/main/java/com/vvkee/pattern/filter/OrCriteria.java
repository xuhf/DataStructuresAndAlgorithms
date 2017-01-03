package com.vvkee.pattern.filter;

import java.util.List;

/**
 * or运算，符合条件1或者符合条件2
 * 
 * @author xuhf
 *
 */
public class OrCriteria implements Criteria {

	private Criteria criteria;

	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

		/**
		 * 合并结果集
		 */
		for (Person person : otherCriteriaItems) {
			if (!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
