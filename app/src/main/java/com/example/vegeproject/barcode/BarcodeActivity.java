package com.example.vegeproject.barcode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.vegeproject.search.FirebaseList;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import com.example.vegeproject.R;

import java.util.StringTokenizer;

public class BarcodeActivity extends AppCompatActivity {

    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("list");
    private FirebaseList firebaseList = new FirebaseList();
    private IntentIntegrator Scan;
    static String string;
    int i=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);

        readFirebaseList("8801062522392");

        result_fragment fragment = new result_fragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.barcode_activity, fragment).commit();
        Scan = new IntentIntegrator(this);
        Scan.setOrientationLocked(false);//폰 방향대로 가로세로모드변경
        Scan.setPrompt("바코드를 카메라 중앙에 맞춰주세요.");
        Scan.initiateScan();

    }

    private void readFirebaseList(String searchItem){

        databaseReference.orderByChild("barcode").equalTo(searchItem).addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot data: dataSnapshot.getChildren()){
                    firebaseList.prdlstNm = data.child("prdlstNm").getValue(String.class);
                    firebaseList.allergy = data.child("allergy").getValue(String.class);
                    firebaseList.barcode = data.child("barcode").getValue(String.class);
                    Log.w("FirebaseData", firebaseList.prdlstNm + ", " + firebaseList.allergy + ", " + firebaseList.barcode);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w("FireBaseData", "loadPost:onCancelled", databaseError.toException());
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        //바코드값 result에 받기
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if(result != null) {
            //뒤로가기 시 바코드 종료 후 mainActivity로 돌아감
            if(result.getContents() == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
                finish();
            }
            //바코드 정보 입력성공 시
             else {
                Toast.makeText(this, "바코드값: " + result.getContents(), Toast.LENGTH_LONG).show();
                string=result.getContents();

            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

}
