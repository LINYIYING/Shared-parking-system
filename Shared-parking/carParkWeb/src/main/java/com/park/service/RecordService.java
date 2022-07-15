package com.park.service;

import java.util.List;
import java.util.Map;

import com.park.pojo.Record;

public interface RecordService {
	int addRecord(Record record);
	int updateRecord(Record record);
	List<Record> queryAll();
	int deleteRecord(int id);
	Record queryRecordById(int id);
	List<Record> queryRecordByUserName(String userName, String isCharge);
	List<Record> findAllRecordByPage(int satrt, int end);
}
