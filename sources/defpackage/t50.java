package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: t50  reason: default package */
public final class t50 implements p40 {
    public boolean X;
    public boolean Y;
    public final r50 Z = new r50(this);
    public final ch9 a;
    public final jpb b;
    public final khe c;
    public final q40 o;

    public t50(Context context, ch9 ch9, jpb jpb) {
        this.a = ch9;
        this.b = jpb;
        khe d = u50.a.getAccessor().d(kr1.class);
        this.c = new khe(new a5(context, 4));
        this.o = new q40(context, this);
        o9g o9g = new o9g(3, (Object) this);
        khe khe = new khe(new x5(16, this));
        ((uh9) ch9).e(o9g);
        ((wr1) ((kr1) d.getValue())).d((s50) khe.getValue());
    }

    public static final boolean a(t50 t50) {
        for (AudioDeviceInfo type : ((AudioManager) t50.c.getValue()).getDevices(2)) {
            int type2 = type.getType();
            if (type2 == 3 || type2 == 4 || type2 == 8) {
                return true;
            }
        }
        return false;
    }

    public static final void c(t50 t50) {
        boolean z = ((uh9) t50.a).x;
        q40 q40 = t50.o;
        if (z) {
            q40.m(1);
            t50.d();
            return;
        }
        q40.k();
        if (t50.X) {
            t50.X = false;
            jpb jpb = t50.b;
            jpb.b();
            jpb.h.remove(t50.Z);
        }
    }

    public final boolean b() {
        return ((uh9) this.a).x;
    }

    public final void d() {
        if (this.Y && !this.X && ((uh9) this.a).x) {
            this.X = true;
            jpb jpb = this.b;
            jpb.a();
            jpb.h.add(this.Z);
        }
    }

    public final float e() {
        return ((uh9) this.a).z;
    }

    public final void g(float f) {
    }

    public final void onAudioFocusChange(int i) {
        this.o.j(i);
    }

    public final void pause() {
        ch9 ch9 = this.a;
        if (!ch9.b()) {
            ((uh9) ch9).q();
        }
    }

    public final void play() {
        ch9 ch9 = this.a;
        if (!ch9.b()) {
            this.o.m(1);
            ((uh9) ch9).r();
        }
    }
}
