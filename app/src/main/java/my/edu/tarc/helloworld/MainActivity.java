package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewMessage ;
    ImageView imageViewApplePen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Show UI
        /*This is another comment*/
        //R =resource
        setContentView(R.layout.activity_main);

        //Link UI to program
        textViewMessage = (TextView)findViewById(R.id.TextViewMessage);
        imageViewApplePen = (ImageView)findViewById(R.id.ApplePen);
    }

    public void showMessage(View view){
        textViewMessage.setText(getText(R.string.message));
    }

    public void disappear(View view){
        imageViewApplePen.setVisibility(View.GONE);
    }

    public void visible(View view){
        imageViewApplePen.setVisibility(View.VISIBLE);
    }

}
