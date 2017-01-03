package com.vvkee.pattern.filter;

import java.util.List;

/**
 * and运算，符合条件1并且符合条件2
 * 
 * @author xuhf
 *
 */
public class AndCriteria implements Criteria {

	private Criteria criteria;

	private Criteria otherCriteria;

	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(list);
	}

}
