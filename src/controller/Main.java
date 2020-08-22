package controller;

import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

public class Main{
	public static void main(String args[]) throws Exception {
		SkillDAO skilldao = new SkillDAO();
		
		TreeMap<Integer,Skill>map = new TreeMap<Integer,Skill>();
		map=skilldao.skillCount();
//		System.out.println("Players"+"Skill");
		for(Entry<Integer,Skill> op: map.entrySet())
		{
			@SuppressWarnings("unused")
			int count =op.getKey();
			Skill skill =op.getValue();
			System.out.println(skill.getSkillcount()+ " " +skill.getSkillName());
			}
	}
}
