package cn.bdqn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.Columnn;

public interface NewsssService {
	/**
	 * ��ѯȫ����Ŀ
	 */
	List<Columnn> getAll();
	/**
	 * �����Ŀ
	 */
	int add(Columnn columnn);
	/**
	 * ɾ����Ŀ
	 */
	int del(int id);
	/**
	 * ����id��ѯ������Ϣ
	 */
	Columnn getById(int id);
	/**
	 * �޸�
	 */
	int upd(Columnn columnn);
}
