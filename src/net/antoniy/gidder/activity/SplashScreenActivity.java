package net.antoniy.gidder.activity;

import net.antoniy.gidder.R;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends BaseActivity {
//	private final static String INTENT_ACTION_START_MAIN_MENU = "net.antoniy.gidder.START_MAIN_MENU_ACTIVITY";
	private final static String INTENT_ACTION_START_SLIDE = "net.antoniy.gidder.START_SLIDE_ACTIVITY";
	
	@Override
	protected void setup() {
		setContentView(R.layout.splash_screen);
	}

	@Override
	protected void initComponents(Bundle savedInstanceState) {
//		try {
//			long start = System.currentTimeMillis();
////			new SDCardRepositoryManager().createRepository(null);
//			Repository repository = new LocalDiskRepositoryManager().createRepository("/sdcard/tmp/repo1.git");
//			repository.create(true);
//			repository.close();
//			Log.i("SplashScreenActivity", "Time: " + (System.currentTimeMillis() - start));
//		} catch (RepositoryNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		Thread splashThread = new Thread() {
	         @Override
	         public void run() {
	            try {
	               int waited = 0;
	               while (waited < 2000) {
	                  sleep(100);
	                  waited += 100;
	               }
	            } catch (InterruptedException e) {
	               // do nothing
	            } finally {
	               finish();
	               Intent i = new Intent(INTENT_ACTION_START_SLIDE);
	               startActivity(i);
	            }
	         }
	      };
	      splashThread.start();
	}

}