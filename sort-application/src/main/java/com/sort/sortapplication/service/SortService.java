package com.sort.sortapplication.service;

import java.util.ArrayList;
import java.util.List;

import com.sort.sortapplication.model.SortBean;

public interface SortService {

	public SortBean perFormSortMetrics(String beforeSortData);

	public List<SortBean> fethcAllTheHistoryData();
}
