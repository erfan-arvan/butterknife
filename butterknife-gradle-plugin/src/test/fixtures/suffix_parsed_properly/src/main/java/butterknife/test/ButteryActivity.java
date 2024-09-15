package butterknife.test;
import javax.annotation.Nullable;import butterknife.BindView;
import com.example.butterknife.R;
import com.example.butterknife.R2;

class ButteryActivity extends Activity {

  @BindView(R2.id.title) TextView title;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ButterKnife.bind(this);

  }

}