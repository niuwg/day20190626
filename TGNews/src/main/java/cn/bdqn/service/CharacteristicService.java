package cn.bdqn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.Characteristic;

public interface CharacteristicService {
	//查询
	List<Characteristic> getAll();
	//���
	int add(Characteristic characteristic);
	//ɾ��
	int del(int id);
	//�޸ĵ�һ��
	Characteristic getById(int id);
	//�޸ĵڶ���
	int upd(Characteristic characteristic);
}
