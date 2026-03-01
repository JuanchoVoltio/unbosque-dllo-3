package edu.unbosque;

import java.util.List;

public abstract class Figure {
    private List<Integer> data;

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}
