package com.dfjx.frontier.common;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public abstract class Pagination<T> {
    private final Integer total;
    private final Integer offset;
    private final Integer limit;

    protected List<T> data;

    public Pagination(Integer total, Integer offset, Integer limit) {
        this.total = total;
        this.offset = offset;
        this.limit = limit;
    }
}
