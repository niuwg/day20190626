package cn.bdqn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.Columnn;
import cn.bdqn.pojo.News;

public interface NewsssDao {
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
	int del(@Param(value="id")int id);
	/**
	 * ����id��ѯ������Ϣ
	 */
	Columnn getById(@Param(value="id")int id);
	/**
	 * �޸�
	 */
	int upd(Columnn columnn);
}
