package com.example.wb773.unitycontrol;

import android.app.Activity;
import android.widget.Toast;

import com.unity3d.player.UnityPlayer;

import org.apache.commons.lang.text.StrBuilder;

/**
 * Created by wb773 on 2017/10/03.
 */

public class Controller {

        public static void showToast(final String message) {
            final Activity activity = UnityPlayer.currentActivity;
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    StrBuilder sb = new StrBuilder();

                    sb.append("a").append("b").append("c").append(message);
                    System.out.println(sb);
                    Toast.makeText(activity, sb.toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
}
