package com.vvkee.pattern.filter;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 已婚过滤器
 * 
 * @author xuhf
 *
 */
public class CriteriaMarried implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = Lists.newArrayList();
		for (Person p : persons) {
			if (p.getMaritalStatus().equalsIgnoreCase("Married")) {
				list.add(p);
			}
		}
		return list;
	}

}
