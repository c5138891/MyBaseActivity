package cn.c5138891.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.ssoct.vlibrary.mvp_base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.ssoct.radarscan.R;


public class TestActivity extends BaseActivity {
    private static final String TAG = "MacTrackActivity";
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.creatroom)
    Button creatroom;
    @BindView(R.id.roomnum)
    EditText roomnum;
    @BindView(R.id.joinroom)
    Button joinroom;
    @BindView(R.id.dl_drawer)
    LinearLayout dlDrawer;
    @BindView(R.id.login)
    Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //init();
    }

}
