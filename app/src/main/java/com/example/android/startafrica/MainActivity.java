package com.example.android.startafrica;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore1(View view) {
        String readMore1 = "Founder: Johann Kok" + "\nWebsite: http://www.seebox.co.za";
        displayMessage(readMore1);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage(String message) {
        TextView seeBoxReadMore = (TextView) findViewById(R.id.read_more1);
        seeBoxReadMore.setTextColor(Color.BLACK);
        seeBoxReadMore.setText(message);
        seeBoxReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore2(View view) {
        String readMore2 = "Founder: Kwabena Danso" + "\nWebsite: http://booomers.com/";
        displayMessage2(readMore2);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage2(String message) {
        TextView boomersReadMore = (TextView) findViewById(R.id.read_more2);
        boomersReadMore.setTextColor(Color.BLACK);
        boomersReadMore.setText(message);
        boomersReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore3(View view) {
        String readMore3 = "Founder: James Steere" + "\nWebsite: http://www.idropwater.com";
        displayMessage3(readMore3);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage3(String message) {
        TextView iDropWaterReadMore = (TextView) findViewById(R.id.read_more3);
        iDropWaterReadMore.setTextColor(Color.BLACK);
        iDropWaterReadMore.setText(message);
        iDropWaterReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore4(View view) {
        String readMore4 = "Founder: Dr. William Mapham" + "\nWebsite: http://www.vulamobile.com/";
        displayMessage4(readMore4);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage4(String message) {
        TextView vulaMobileReadMore = (TextView) findViewById(R.id.read_more4);
        vulaMobileReadMore.setTextColor(Color.BLACK);
        vulaMobileReadMore.setText(message);
        vulaMobileReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore5(View view) {
        String readMore5 = "Founders: John Lush, Gunter Rust, Toivo Thomas" + "\nWebsite: http://agri-cyclenamibia.weebly.com/";
        displayMessage5(readMore5);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage5(String message) {
        TextView agricycleReadMore = (TextView) findViewById(R.id.read_more5);
        agricycleReadMore.setTextColor(Color.BLACK);
        agricycleReadMore.setText(message);
        agricycleReadMore.setGravity(Gravity.CENTER);
    }


    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore6(View view) {
        String readMore6 = "Founder: Chinazo Ikenna" + "\nWebsite: http://www.solarkobo.com";
        displayMessage6(readMore6);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage6(String message) {
        TextView solarKoboReadMore = (TextView) findViewById(R.id.read_more6);
        solarKoboReadMore.setTextColor(Color.BLACK);
        solarKoboReadMore.setText(message);
        solarKoboReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore7(View view) {
        String readMore7 = "Website: http://www.max.ng";
        displayMessage7(readMore7);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage7(String message) {
        TextView maxReadMore = (TextView) findViewById(R.id.read_more7);
        maxReadMore.setTextColor(Color.BLACK);
        maxReadMore.setText(message);
        maxReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore8(View view) {
        String readMore8 = "Founder: Antony Tonee Ndungu" + "\nWebsite: http://kytabu.com";
        displayMessage8(readMore8);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage8(String message) {
        TextView kytabuReadMore = (TextView) findViewById(R.id.read_more8);
        kytabuReadMore.setTextColor(Color.BLACK);
        kytabuReadMore.setText(message);
        kytabuReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore9(View view) {
        String readMore9 = "Founder: Eyram Tawia" + "\nWebsite: http://letiarts.com/";
        displayMessage9(readMore9);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage9(String message) {
        TextView letiArtsReadMore = (TextView) findViewById(R.id.read_more9);
        letiArtsReadMore.setTextColor(Color.BLACK);
        letiArtsReadMore.setText(message);
        letiArtsReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore10(View view) {
        String readMore10 = "Founder: Amanda Gicharu" + "\nWebsite: http://www.techrepublicafrica.com/";
        displayMessage10(readMore10);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage10(String message) {
        TextView techRepReadMore = (TextView) findViewById(R.id.read_more10);
        techRepReadMore.setTextColor(Color.BLACK);
        techRepReadMore.setText(message);
        techRepReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore11(View view) {
        String readMore11 = "Website: http://www.settic.sn/";
        displayMessage11(readMore11);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage11(String message) {
        TextView setTicReadMore = (TextView) findViewById(R.id.read_more11);
        setTicReadMore.setTextColor(Color.BLACK);
        setTicReadMore.setText(message);
        setTicReadMore.setGravity(Gravity.CENTER);
    }


    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore12(View view) {
        String readMore12 = "Founder: Adama Kane" + "\nWebsite: http://www.jokkosante.org/";
        displayMessage12(readMore12);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage12(String message) {
        TextView jokkoReadMore = (TextView) findViewById(R.id.read_more12);
        jokkoReadMore.setTextColor(Color.BLACK);
        jokkoReadMore.setText(message);
        jokkoReadMore.setGravity(Gravity.CENTER);
    }


    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore13(View view) {
        String readMore13 = "Founder: Harouna Ba" + "\nWebsite: http://greenwashafrica.com/";
        displayMessage13(readMore13);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage13(String message) {
        TextView greenwashReadMore = (TextView) findViewById(R.id.read_more13);
        greenwashReadMore.setTextColor(Color.BLACK);
        greenwashReadMore.setText(message);
        greenwashReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore14(View view) {
        String readMore14 = "Website: http://ologa.com/";
        displayMessage14(readMore14);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage14(String message) {
        TextView ologaReadMore = (TextView) findViewById(R.id.read_more14);
        ologaReadMore.setTextColor(Color.BLACK);
        ologaReadMore.setText(message);
        ologaReadMore.setGravity(Gravity.CENTER);
    }


    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore15(View view) {
        String readMore15 = "Website: http://gomyway.com";
        displayMessage15(readMore15);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage15(String message) {
        TextView gomywayReadMore = (TextView) findViewById(R.id.read_more15);
        gomywayReadMore.setTextColor(Color.BLACK);
        gomywayReadMore.setText(message);
        gomywayReadMore.setGravity(Gravity.CENTER);
    }


    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore16(View view) {
        String readMore16 = "Founder: Theuri Mwangi" + "\nWebsite: https://mymookh.com/";
        displayMessage16(readMore16);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage16(String message) {
        TextView mookhReadMore = (TextView) findViewById(R.id.read_more16);
        mookhReadMore.setTextColor(Color.BLACK);
        mookhReadMore.setText(message);
        mookhReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore17(View view) {
        String readMore17 = "Founder: Terry Kanu-Iroegbu" + "\nWebsite: https://www.pushcv.com";
        displayMessage17(readMore17);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage17(String message) {
        TextView pushCvReadMore = (TextView) findViewById(R.id.read_more17);
        pushCvReadMore.setTextColor(Color.BLACK);
        pushCvReadMore.setText(message);
        pushCvReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore18(View view) {
        String readMore18 = "Website: http://www.wecyclers.com";
        displayMessage18(readMore18);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage18(String message) {
        TextView wecyclersReadMore = (TextView) findViewById(R.id.read_more18);
        wecyclersReadMore.setTextColor(Color.BLACK);
        wecyclersReadMore.setText(message);
        wecyclersReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore19(View view) {
        String readMore19 = "Website: https://www.ace.ng";
        displayMessage19(readMore19);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage19(String message) {
        TextView aceReadMore = (TextView) findViewById(R.id.read_more19);
        aceReadMore.setTextColor(Color.BLACK);
        aceReadMore.setText(message);
        aceReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore20(View view) {
        String readMore20 = "Website: http://hellodoc.ng/";
        displayMessage20(readMore20);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage20(String message) {
        TextView helloDocReadMore = (TextView) findViewById(R.id.read_more20);
        helloDocReadMore.setTextColor(Color.BLACK);
        helloDocReadMore.setText(message);
        helloDocReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore21(View view) {
        String readMore21 = "Website: http://www.flyingdoctorsnigeria.com/";
        displayMessage21(readMore21);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage21(String message) {
        TextView flyingDocReadMore = (TextView) findViewById(R.id.read_more21);
        flyingDocReadMore.setTextColor(Color.BLACK);
        flyingDocReadMore.setText(message);
        flyingDocReadMore.setGravity(Gravity.CENTER);
    }


    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore22(View view) {
        String readMore22 = "Website: http://www.kilivr.com/";
        displayMessage22(readMore22);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage22(String message) {
        TextView kiliVrReadMore = (TextView) findViewById(R.id.read_more22);
        kiliVrReadMore.setTextColor(Color.BLACK);
        kiliVrReadMore.setText(message);
        kiliVrReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore23(View view) {
        String readMore23 = "Founder: Tinashe Makaza" + "\nWebsite: http://www.virtualbank.co.zw/";
        displayMessage23(readMore23);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage23(String message) {
        TextView virtualBankReadMore = (TextView) findViewById(R.id.read_more23);
        virtualBankReadMore.setTextColor(Color.BLACK);
        virtualBankReadMore.setText(message);
        virtualBankReadMore.setGravity(Gravity.CENTER);
    }

    /**
     * This method is called when the "Read More" text is tapped.
     */

    public void readMore24(View view) {
        String readMore24 = "Website: http://www.smsgh.com";
        displayMessage24(readMore24);
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage24(String message) {
        TextView smsghReadMore = (TextView) findViewById(R.id.read_more24);
        smsghReadMore.setTextColor(Color.BLACK);
        smsghReadMore.setText(message);
        smsghReadMore.setGravity(Gravity.CENTER);
    }

}
