package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.mediarouter.app.d;

/* renamed from: wf8  reason: default package */
public final class wf8 implements View.OnClickListener {
    public final /* synthetic */ d a;

    public wf8(d dVar) {
        this.a = dVar;
    }

    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        int id = view.getId();
        int i = 1;
        d dVar = this.a;
        if (id == 16908313 || id == 16908314) {
            if (dVar.t0.g()) {
                if (id == 16908313) {
                    i = 2;
                }
                dVar.Z.getClass();
                eh8.g(i);
            }
            dVar.dismiss();
        } else if (id == dvb.mr_control_playback_ctrl) {
            if (dVar.c1 != null && (playbackStateCompat = dVar.e1) != null) {
                int i2 = 0;
                if (playbackStateCompat.getState() != 3) {
                    i = 0;
                }
                if (i != 0 && (dVar.e1.getActions() & 514) != 0) {
                    dVar.c1.getTransportControls().pause();
                    i2 = n1c.mr_controller_pause;
                } else if (i != 0 && (dVar.e1.getActions() & 1) != 0) {
                    dVar.c1.getTransportControls().stop();
                    i2 = n1c.mr_controller_stop;
                } else if (i == 0 && (dVar.e1.getActions() & 516) != 0) {
                    dVar.c1.getTransportControls().play();
                    i2 = n1c.mr_controller_play;
                }
                AccessibilityManager accessibilityManager = dVar.x1;
                if (accessibilityManager != null && accessibilityManager.isEnabled() && i2 != 0) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                    obtain.setPackageName(dVar.u0.getPackageName());
                    obtain.setClassName(wf8.class.getName());
                    obtain.getText().add(dVar.u0.getString(i2));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
            }
        } else if (id == dvb.mr_close) {
            dVar.dismiss();
        }
    }
}
