package aide.myapp;
import android.support.v7.app.*;
import android.os.*;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.*;
import android.widget.Button;
import android.view.View.*;
import android.view.*;
import android.content.*;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener
{

	@Override
	public void onClick(View p1)
	{
		Toast.makeText(this,"h",Toast.LENGTH_SHORT).show();
		checkEmptyData();

	}

	TextInputEditText edtEmail,edtPass;
	Toolbar toolbar;
	Button loginBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_login);
		toolbar = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		edtEmail = (TextInputEditText)findViewById(R.id.login_email);
		edtPass = (TextInputEditText)findViewById(R.id.login_pass);
		loginBtn = (Button)findViewById(R.id.loginButton);
		loginBtn.setOnClickListener(this);
	}
	public boolean loginUserExists(String em, String pw)
	{
		if (em.equals("gp26101998@gmail.com") && pw.equals("1234"))
		{
			Intent i=new Intent(this, MainActivity.class);
			startActivity(i);
			finish();
			return true;
		}
		return false;
	}
	public void checkEmptyData()
	{
		String email,pass;
		if (edtEmail == null || edtEmail.toString().trim().isEmpty())
		{
			edtEmail.setError("Enter email");
		}
		else if (edtPass == null || edtPass.toString().trim().isEmpty())
		{
			edtPass.setError("Enter Password");
		}
		else
		{
			email = edtEmail.getText().toString();
			pass = edtPass.getText().toString();
			loginUserExists(email, pass);
		}
	}
}