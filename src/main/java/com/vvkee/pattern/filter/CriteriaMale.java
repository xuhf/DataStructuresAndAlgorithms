package com.vvkee.pattern.filter;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 过滤男性
 * 
 * @author xuhf
 *
 */
public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = Lists.newArrayList();
		for (Person p : persons) {
			if (p.getGender().equalsIgnoreCase(GenderEnum.MALE.name())) {
				list.add(p);
			}
		}
		return list;
	}

}
