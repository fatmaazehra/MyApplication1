package com.example.yapra_000.myapplication1;

import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.felipecsl.gifimageview.library.GifImageView;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    GifImageView gifimageView ;
    Button buton1,buton2,buton3,buton4,elsa,spidermen,minyonlar,masha;
    int kontrol=0;
    TextView uyarı;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      gifimageView=(GifImageView)findViewById(R.id.gifImageview);
      buton1=(Button)findViewById(R.id.buton1);
      buton2=(Button)findViewById(R.id.buton2);
      buton3=(Button)findViewById(R.id.buton3);
      buton1.setOnClickListener(this);
      buton2.setOnClickListener(this);
      buton3.setOnClickListener(this);
        buton4=(Button)findViewById(R.id.buton4);
        buton4.setOnClickListener(this);

      elsa=(Button)findViewById(R.id.elsa);
      elsa.setOnClickListener(this);

        spidermen=(Button)findViewById(R.id.spiderman);
        spidermen.setOnClickListener(this);
        minyonlar=(Button)findViewById(R.id.minyonlar);
        minyonlar.setOnClickListener(this);
        masha=(Button)findViewById(R.id.masha);
        masha.setOnClickListener(this);
        uyarı=(TextView) findViewById(R.id.textView);
        uyarı.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
    int id=view.getId();
        if(id==R.id.elsa){
            kontrol=1;
            buton1.setText("Şarkı ");
            buton2.setText("Giyin" );
            buton3.setText("Olafı Yap" );
            buton4.setText("Ana "); }
        if(id==R.id.spiderman){
            kontrol=2;
            buton1.setText("Göz Kırp");
            buton2.setText("Kachow" );
            buton3.setText("Lastik " );
            buton4.setText("Mater"); }
        if(id==R.id.minyonlar){
            kontrol=3;
            buton1.setText("Gülmek");
            buton2.setText("Dans" );
            buton3.setText("Gru" );
            buton4.setText("Şarkı"); }
        if(id==R.id.masha){
            kontrol=4;
            buton1.setText("Yemek");
            buton2.setText("Koca Ayı" );
            buton3.setText("Dans" );
            buton4.setText("Gitar"); }

    if(id==R.id.buton1){
            if(kontrol==0){
                uyarı.setText("Önce karakter seçiniz");
            }
        if(kontrol==1){
            new RetrieveByteArray().execute("https://firstsevenweeks.files.wordpress.com/2016/09/giphy-41.gif?w=387&h=309");
            gifimageView.startAnimation();
        }
        if(kontrol==2){
            new RetrieveByteArray().execute("https://media.giphy.com/media/ptWWlr7iCHOhi/giphy.gif");
            gifimageView.startAnimation();
        }
        if(kontrol==3){
            new RetrieveByteArray().execute("https://www.bestepebloggers.com/wp-content/uploads/minyonlar-gif.gif");
            gifimageView.startAnimation();
        }
        if(kontrol==4){
            new RetrieveByteArray().execute("https://avatars.mds.yandex.net/get-pdb/812271/a2f59460-4d30-4f19-a3c1-c42fbb9c798a/orig");
            gifimageView.startAnimation();
        }
    }
    if(id==R.id.buton2){

        if(kontrol==0){
            uyarı.setText("Önce karakter seçiniz");
        }
        if(kontrol==1){
            new RetrieveByteArray().execute("https://data.whicdn.com/images/248847008/original.gif");
            gifimageView.startAnimation();
        }
        if(kontrol==2){
            new RetrieveByteArray().execute("https://media3.giphy.com/media/WApIcl7whuH3W/giphy.gif");
            gifimageView.startAnimation();
        }
        if(kontrol==3){
            new RetrieveByteArray().execute("https://media.giphy.com/media/Hwbi707djvimc/giphy.gif");
            gifimageView.startAnimation();
        }
        if(kontrol==4){
            new RetrieveByteArray().execute("https://zippy.gfycat.com/SpottedAridAlligator.gif");
            gifimageView.startAnimation();
        }
    }
    if(id==R.id.buton3){

        if(kontrol==0){
            uyarı.setText("Önce karakter seçiniz");
        }
        if(kontrol==1){
            new RetrieveByteArray().execute("https://78.media.tumblr.com/e205f6ab41be4f252c40823cb9ff15ee/tumblr_n88ur0C1xo1shyusgo1_r2_500.gif");
            gifimageView.startAnimation();
        }
        if(kontrol==2){
            new RetrieveByteArray().execute("https://media.giphy.com/media/g9ibUdbOCcw6c/giphy.gif");
            gifimageView.startAnimation();
        }
        if(kontrol==3){
            new RetrieveByteArray().execute("https://i.pinimg.com/originals/65/55/d2/6555d2bd40cef124baae2933816f16c4.gif");
            gifimageView.startAnimation();
        }
        if(kontrol==4){
            new RetrieveByteArray().execute("https://1.bp.blogspot.com/-H3N1t_N4izo/VHFaGRbZa4I/AAAAAAAACAA/qyvG9sJnv-o/w405-h226-p/Gambar%2BDP%2BBBM%2BMasha%2BBergerak%2BAnimasi%2BLucu%2BMain%2BSalju.gif");
            gifimageView.startAnimation();
        }
    }
        if(id==R.id.buton4){

            if(kontrol==0){
                uyarı.setText("Önce karakter seçiniz");
            }
            if(kontrol==1){
                new RetrieveByteArray().execute("https://media.giphy.com/media/qw34QecwZ9iKc/giphy.gif");
                gifimageView.startAnimation();
            }
            if(kontrol==2){
                new RetrieveByteArray().execute("https://i.gifer.com/Bt2y.gif");
                gifimageView.startAnimation();
            }
            if(kontrol==3){
                new RetrieveByteArray().execute("https://thumbs.gfycat.com/GlitteringPalatableDromaeosaur-size_restricted.gif");
                gifimageView.startAnimation();
            }
            if(kontrol==4){
                new RetrieveByteArray().execute("https://avatars.mds.yandex.net/get-pdb/224463/a0a48811-b136-4a02-8f4b-9d9a44e8c3e0/orig");
                gifimageView.startAnimation();
            }
        }
    }
    class RetrieveByteArray extends AsyncTask<String,Void,byte[]>
    {


        @Override
        protected byte[] doInBackground(String... strings) {
            try {
                URL url=new URL(strings[0]);
                HttpURLConnection urlConnection= (HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200){
                    InputStream in = new BufferedInputStream(urlConnection.getInputStream()) ;
                    ByteArrayOutputStream buffer =new ByteArrayOutputStream();
                    int nRead;
                    byte[] data =new byte[10240];
                    while ((nRead=in.read(data,0,data.length))!=-1){
                        buffer.write(data,0,nRead);
                    }
                    buffer.flush();
                    return buffer.toByteArray();

                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }

           return null;
        }

        @Override
        protected void onPostExecute(byte[] bytes) {
            super.onPostExecute(bytes);
            gifimageView.setBytes(bytes);
        }
    }


}

