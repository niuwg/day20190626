package cn.bdqn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.Special;

public interface SpecialService {
	/**
	 * ��ѯȫ��
	 */
	List<Special> getAll();
	/**
	 * ɾ��
	 */
	int del(int id);
	/**
	 * ���
	 */
	int add(Special special);
	/**
	 * ����id��ѯ��Ϣ
	 */
	Special getById(int id);
	/**
	 * �޸�
	 */
	int upd(Special special);
}
