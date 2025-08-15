package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import androidx.mediarouter.app.e;

/* renamed from: og8  reason: default package */
public final class og8 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ og8(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    dh8 dh8 = (dh8) seekBar.getTag();
                    e eVar = (e) ((pg8) this.b).G0.get(dh8.c);
                    if (eVar != null) {
                        eVar.B(i == 0);
                    }
                    dh8.j(i);
                    return;
                }
                return;
            default:
                w3b w3b = (w3b) this.b;
                if (!z || !w3b.v0) {
                    w3b.t0.setVisibility(8);
                    return;
                }
                v3b v3b = w3b.w0;
                if (v3b != null) {
                    ((g07) v3b).B0.g(new jv3(i));
                }
                uff uff = w3b.t0;
                uff.b.setText(tfg.c((long) i));
                t4b t4b = w3b.s0;
                uff.setTranslationX(Math.min((float) ((t4b.getWidth() - w3b.o.getWidth()) - uff.getWidth()), Math.max((float) w3b.c.getWidth(), ((float) (t4b.getThumbOffset() + (w3b.getPaddingLeft() + t4b.getThumb().getBounds().centerX()))) - (((float) uff.getWidth()) / 2.0f))));
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                pg8 pg8 = (pg8) this.b;
                if (pg8.H0 != null) {
                    pg8.C0.removeMessages(2);
                }
                pg8.H0 = (dh8) seekBar.getTag();
                return;
            default:
                v3b listener = ((w3b) this.b).getListener();
                if (listener != null) {
                    ((g07) listener).B0.g(kv3.a);
                    return;
                }
                return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.a) {
            case 0:
                ((pg8) this.b).C0.sendEmptyMessageDelayed(2, 500);
                return;
            default:
                w3b w3b = (w3b) this.b;
                v3b listener = w3b.getListener();
                if (listener != null) {
                    ((g07) listener).B0.g(new lv3(seekBar.getProgress()));
                }
                w3b.t0.setVisibility(8);
                return;
        }
    }
}
