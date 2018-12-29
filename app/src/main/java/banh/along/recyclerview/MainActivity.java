package banh.along.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvTest;
    List<ItemPhanTu> itemPhanTus;
    ItemAdapter itemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTest = findViewById(R.id.rvTest);
        itemPhanTus = new ArrayList<>();
        itemPhanTus.add(new ItemPhanTu("1", "Dịch vụ quản gia cao cấp"));
        itemPhanTus.add(new ItemPhanTu("2", "Dịch vụ quản gia cao cấp"));
        itemPhanTus.add(new ItemPhanTu("3", "Dịch vụ quản gia cao cấp"));
        itemPhanTus.add(new ItemPhanTu("4", "Dịch vụ quản gia cao cấp"));
        itemPhanTus.add(new ItemPhanTu("5", "Dịch vụ quản gia cao cấp"));
        itemPhanTus.add(new ItemPhanTu("6", "Dịch vụ quản gia cao cấp"));
        itemPhanTus.add(new ItemPhanTu("7", "Dịch vụ quản gia cao cấp"));
        /*ItemPhanTu itemPhanTu1 = new ItemPhanTu();
        itemPhanTu1.stepp = "1";
        itemPhanTu1.nameOfStep = "Dịch vụ quản gia cao cấp";

        itemPhanTus.add(itemPhanTu1);*/
        itemAdapter = new ItemAdapter(itemPhanTus, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvTest.setLayoutManager(linearLayoutManager);
        rvTest.setAdapter(itemAdapter);

    }
}
