package cn.bdqn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.Special;

public interface SpecialDao {
	/**
	 * ��ѯȫ��
	 */
	List<Special> getAll();
	/**
	 * ɾ��
	 */
	int del(@Param(value="id")int id);
	/**
	 * ���
	 */
	int add(Special special);
	/**
	 * ����id��ѯ��Ϣ
	 */
	Special getById(@Param(value="id")int id);
	/**
	 * �޸�
	 */
	int upd(Special special);
}
