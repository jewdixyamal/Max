package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import androidx.mediarouter.app.e;
import java.util.Collections;

/* renamed from: mf8  reason: default package */
public final class mf8 extends lz7 {
    public final /* synthetic */ int h;
    public final /* synthetic */ KeyEvent.Callback i;

    public /* synthetic */ mf8(KeyEvent.Callback callback, int i2) {
        this.h = i2;
        this.i = callback;
    }

    public void A(dh8 dh8) {
        e eVar;
        KeyEvent.Callback callback = this.i;
        switch (this.h) {
            case 2:
                d dVar = (d) callback;
                SeekBar seekBar = (SeekBar) dVar.b1.get(dh8);
                int i2 = dh8.o;
                int i3 = d.z1;
                if (seekBar != null && dVar.W0 != dh8) {
                    seekBar.setProgress(i2);
                    return;
                }
                return;
            case 4:
                int i4 = pg8.e1;
                pg8 pg8 = (pg8) callback;
                if (pg8.H0 != dh8 && (eVar = (e) pg8.G0.get(dh8.c)) != null) {
                    int i5 = eVar.F0.o;
                    eVar.B(i5 == 0);
                    eVar.H0.setProgress(i5);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void B() {
        switch (this.h) {
            case 0:
                ((of8) this.i).getClass();
                return;
            default:
                return;
        }
    }

    public void s() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                return;
            default:
                return;
        }
    }

    public void t() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                return;
            default:
                return;
        }
    }

    public void u() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                return;
            default:
                return;
        }
    }

    public void v() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                return;
            case 1:
                ((qf8) this.i).g();
                return;
            case 3:
                ((gg8) this.i).g();
                return;
            case 4:
                ((pg8) this.i).n();
                return;
            default:
                return;
        }
    }

    public final void w(dh8 dh8) {
        gaa b;
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                return;
            case 1:
                ((qf8) this.i).g();
                return;
            case 2:
                ((d) this.i).q(true);
                return;
            case 3:
                ((gg8) this.i).g();
                return;
            default:
                pg8 pg8 = (pg8) this.i;
                if (dh8 == pg8.t0 && dh8.a() != null) {
                    ch8 ch8 = dh8.a;
                    ch8.getClass();
                    eh8.b();
                    for (dh8 dh82 : Collections.unmodifiableList(ch8.b)) {
                        if (!Collections.unmodifiableList(pg8.t0.u).contains(dh82) && (b = pg8.t0.b(dh82)) != null && b.B() && !pg8.v0.contains(dh82)) {
                            pg8.o();
                            pg8.m();
                            return;
                        }
                    }
                }
                pg8.n();
                return;
        }
    }

    public void x() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                return;
            case 1:
                ((qf8) this.i).g();
                return;
            case 3:
                ((gg8) this.i).g();
                return;
            case 4:
                ((pg8) this.i).n();
                return;
            default:
                return;
        }
    }

    public void y(dh8 dh8) {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                return;
            case 1:
                ((qf8) this.i).dismiss();
                return;
            case 3:
                ((gg8) this.i).dismiss();
                return;
            case 4:
                pg8 pg8 = (pg8) this.i;
                pg8.t0 = dh8;
                pg8.o();
                pg8.m();
                return;
            default:
                return;
        }
    }

    public void z() {
        switch (this.h) {
            case 0:
                ((of8) this.i).b();
                return;
            case 2:
                ((d) this.i).q(false);
                return;
            case 4:
                ((pg8) this.i).n();
                return;
            default:
                return;
        }
    }
}
