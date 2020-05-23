package com.example.bookscardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvtitle;
    private ImageView img;
    private Button button;
    private String pdfUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvtitle= findViewById(R.id.txtTitle);
        img= findViewById(R.id.bookthumbnail);
        button= findViewById(R.id.read);

        //Receive data
        Intent intent= getIntent();
        String Title= intent.getExtras().getString("Title");
        int image = intent.getExtras().getInt("Thumbnail");
        pdfUrl= intent.getExtras().getString("BookPdfLink");



        //setting values
        tvtitle.setText(Title);

        img.setImageResource(image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(getBaseContext(),PdfActivity.class);
                intent.putExtra("pdfLink",pdfUrl);
                startActivity(intent);

            }
        });

    }


//    public void openPdf(View view) {
//        Intent intent= new Intent(getBaseContext(),PdfActivity.class);
//        String url= (String).se
//        startActivity(intent);
//    }


}
