package demo.intentdemo.com.badgedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import demo.intentdemo.com.badgedemo.BadgeFactory;
import demo.intentdemo.com.badgedemo.BadgeView;
import demo.intentdemo.com.badgedemo.R;

public class MainActivity extends AppCompatActivity {


    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;


    BadgeView badgeView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        //大圆点
        BadgeView circle = BadgeFactory.createCircle(this);
        circle.setBindView(tv1);

        //小圆点
        BadgeView dot = BadgeFactory.createDot(this);
        dot.setBindView(tv2);

        //很丑的椭圆，没有任何弧度
        BadgeView oval = BadgeFactory.createOval(this);
        oval.setBindView(tv3);

        //竖直的小火柴
        BadgeView rectangle = BadgeFactory.createRectangle(this);
        rectangle.setBindView(tv4);

        //长方形，然后两边是圆形（比较符合消息小圆点里面带文字的那种）
        BadgeView roundRect = BadgeFactory.createRoundRect(this);
        roundRect.setBindView(tv5);

        BadgeView square = BadgeFactory.createSquare(this);
        square.setBindView(tv6);
    }

    private void initialize() {
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
    }
}
