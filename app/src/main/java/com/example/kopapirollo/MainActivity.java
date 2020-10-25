package com.example.kopapirollo;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView gep_imageHp1, gep_imageHp2, gep_imageHp3,imageHp1,imageHp2,imageHp3, A_gep_valasztasa_kep, A_te_valasztasod_kep;
    private TextView dontetlen;
    private int ertek, elet,gep_elet,dontetlen_ertek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elet = 3;
        gep_elet=3;
        init();
        player_valszt();
        gep_valaszt();
        dontes();
    }



    private void init(){
            imageHp1 = findViewById(R.id.image_hp1);
            imageHp2 = findViewById(R.id.image_hp2);
            imageHp3 = findViewById(R.id.image_hp3);
        gep_imageHp1 = findViewById(R.id.gep_image_hp1);
        gep_imageHp2 = findViewById(R.id.gep_image_hp2);
        gep_imageHp3 = findViewById(R.id.gep_image_hp3);
            dontetlen = findViewById(R.id.dontetlen);



        }


public void player_valszt(){
    final ImageButton ko = findViewById(R.id.ko);
    ko.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            A_te_valasztasod_kep.setImageResource(R.drawable.rock);
            }
        });
    final ImageButton papir = findViewById(R.id.papir);
    papir.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            A_te_valasztasod_kep.setImageResource(R.drawable.paper);
        }
    });
    final ImageButton ollo = findViewById(R.id.ollo);
    ollo.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            A_te_valasztasod_kep.setImageResource(R.drawable.scissors);
        }
    });
    }


 public void gep_valaszt(){
     this.ertek = (int)(Math.random()*3)+1;
     switch (this.ertek) {
         case 1:
             A_gep_valasztasa_kep.setImageResource(R.drawable.rock);
             break;
         case 2:
             A_gep_valasztasa_kep.setImageResource(R.drawable.paper);
             break;
         case 3:
             A_gep_valasztasa_kep.setImageResource(R.drawable.scissors);
             break;

     }
 }
 public void dontes(){
     if (this.ertek==1 && A_te_valasztasod_kep.equals(R.drawable.rock)) {
        dontetlen_ertek++;
     }else if (this.ertek==1 && A_te_valasztasod_kep.equals(R.drawable.paper)) {
        gep_eletCsokkentes();
     }else if (this.ertek==1 && A_te_valasztasod_kep.equals(R.drawable.scissors)) {
        eletCsokkentes();
     }else if (this.ertek==2 && A_te_valasztasod_kep.equals(R.drawable.rock)) {
            eletCsokkentes();
     }else if (this.ertek==2 && A_te_valasztasod_kep.equals(R.drawable.paper)) {
        dontetlen_ertek++;
     }else if (this.ertek==2 && A_te_valasztasod_kep.equals(R.drawable.scissors)) {
        gep_eletCsokkentes();
     }else if (this.ertek==3 && A_te_valasztasod_kep.equals(R.drawable.rock)) {
        gep_eletCsokkentes();
     }else if (this.ertek==3 && A_te_valasztasod_kep.equals(R.drawable.paper)) {
        eletCsokkentes();
     }else if (this.ertek==3 && A_te_valasztasod_kep.equals(R.drawable.scissors)) {
         dontetlen_ertek++;
     }
     dontetlen.setText("Döntetlenek száma: "+dontetlen_ertek);
    }
        private void gep_eletCsokkentes() {
            switch (gep_elet) {
                case 3:
                    gep_imageHp3.setImageResource(R.drawable.heart1);
                    break;
                case 2:
                    gep_imageHp2.setImageResource(R.drawable.heart1);
                    break;
                case 1:
                    gep_imageHp1.setImageResource(R.drawable.heart1);
                    break;
                default:
                    break;
            }
            gep_elet--;
            if (gep_elet < 1) {
                //TODO: GAME OVER
            }
    }
    private void eletCsokkentes () {
        switch (elet) {
            case 3:
                imageHp3.setImageResource(R.drawable.heart1);
                break;
            case 2:
                imageHp2.setImageResource(R.drawable.heart1);
                break;
            case 1:
                imageHp1.setImageResource(R.drawable.heart1);
                break;
            default:
                break;
        }
        elet--;
        if (elet < 1) {
            //TODO: GAME OVER
        }
    }
}
