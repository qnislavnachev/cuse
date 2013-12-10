package com.clouway.cuse.gae.filters;

import com.clouway.cuse.spi.filters.SearchFilter;

import java.util.List;

/**
 * @author Ivan Lazov <ivan.lazov@clouway.com>
 */
public class LessThanFilter implements SearchFilter {

  private final SearchableDate searchableDate;

  public LessThanFilter(SearchableDate searchableDate) {
    this.searchableDate = searchableDate;
  }

  @Override
  public String getValue(List<String> fields) {
    return fields.get(0) + " < " + searchableDate.getValue();
  }
}
