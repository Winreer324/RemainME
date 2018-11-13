package com.example.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.remindme.R;
import com.example.remindme.adapter.RemindListAdapter;
import com.example.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();

        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()) );

        return view;
    }
    // пока что заглушка (типа сервера), но это будет возращатся то что приходит с сервера
    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Test item 1"));
        data.add(new RemindDTO("Test item 2"));
        data.add(new RemindDTO("Test item 3"));
        data.add(new RemindDTO("Test item 4"));
        data.add(new RemindDTO("Test item 5"));
        data.add(new RemindDTO("Test item 6"));
        data.add(new RemindDTO("Test item 7"));

        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
