package com.example.tema3android.activities.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tema3android.R;


public class BooksFragment extends Fragment {

    private EditText mTitleEditText;
    private EditText mAuthorEditText;
    private EditText mDescriptionEditText;
    private RecyclerView mBooksRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_books,container,false);

        mTitleEditText = view.findViewById(R.id.bookTitleEditText);
        mAuthorEditText = view.findViewById(R.id.bookAuthorEditText);
        mDescriptionEditText = view.findViewById(R.id.bookDescriptionEditText);

        mBooksRecyclerView = view.findViewById(R.id.bookRecyclerView);

        return view;
    }
}