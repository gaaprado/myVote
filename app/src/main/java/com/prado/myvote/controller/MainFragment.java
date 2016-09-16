package com.prado.myvote.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prado.myvote.R;

public class MainFragment extends Fragment {

    private String tipo;

    public MainFragment(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;

        switch(tipo) {
            case "Ranking":
                view = inflater.inflate(R.layout.fragment_ranking, container, false);
                return view;

            case "Prefeito":
                view = inflater.inflate(R.layout.fragment_prefeito, container, false);
                return view;

            case "Vereador":
                view = inflater.inflate(R.layout.fragment_vereador, container, false);
                return view;
        }

        return null;
    }

}
