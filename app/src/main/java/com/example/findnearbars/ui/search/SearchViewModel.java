package com.example.findnearbars.ui.search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SearchViewModel  extends ViewModel {

    private MutableLiveData<String> text;

    public SearchViewModel() {
        text = new MutableLiveData<>();
        text.setValue("Search");
    }

    public MutableLiveData<String> getText() {
        return text;
    }
}
