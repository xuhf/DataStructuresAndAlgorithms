package com.vvkee.pattern.filter;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 过滤女性
 * 
 * @author xuhf
 *
 */
public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = Lists.newArrayList();
		for (Person p : persons) {
			if (p.getGender().equalsIgnoreCase(GenderEnum.FEMALE.name())) {
				list.add(p);
			}
		}
		return list;
	}

}
