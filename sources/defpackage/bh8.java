package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bh8  reason: default package */
public final class bh8 {
    public final tg8 a;
    public final int b;
    public final dh8 c;
    public final dh8 d;
    public final dh8 e;
    public final ArrayList f;
    public final WeakReference g;
    public final bm7 h = null;
    public boolean i = false;
    public boolean j = false;

    public bh8(ah8 ah8, dh8 dh8, tg8 tg8, int i2, dh8 dh82, ArrayList arrayList) {
        ArrayList arrayList2 = null;
        this.g = new WeakReference(ah8);
        this.d = dh8;
        this.a = tg8;
        this.b = i2;
        this.c = ah8.r;
        this.e = dh82;
        this.f = arrayList != null ? new ArrayList(arrayList) : arrayList2;
        ah8.m.postDelayed(new nn6(13, this), 15000);
    }

    public final void a() {
        bm7 bm7;
        eh8.b();
        if (!this.i && !this.j) {
            WeakReference weakReference = this.g;
            ah8 ah8 = (ah8) weakReference.get();
            tg8 tg8 = this.a;
            if (ah8 != null && ah8.z == this && ((bm7 = this.h) == null || !bm7.isCancelled())) {
                this.i = true;
                ah8.z = null;
                ah8 ah82 = (ah8) weakReference.get();
                int i2 = this.b;
                dh8 dh8 = this.c;
                if (ah82 != null && ah82.r == dh8) {
                    Message obtainMessage = ah82.m.obtainMessage(263, dh8);
                    obtainMessage.arg1 = i2;
                    obtainMessage.sendToTarget();
                    tg8 tg82 = ah82.s;
                    if (tg82 != null) {
                        tg82.h(i2);
                        ah82.s.d();
                    }
                    HashMap hashMap = ah82.v;
                    if (!hashMap.isEmpty()) {
                        for (tg8 tg83 : hashMap.values()) {
                            tg83.h(i2);
                            tg83.d();
                        }
                        hashMap.clear();
                    }
                    ah82.s = null;
                }
                ah8 ah83 = (ah8) weakReference.get();
                if (ah83 != null) {
                    dh8 dh82 = this.d;
                    ah83.r = dh82;
                    ah83.s = tg8;
                    yg8 yg8 = ah83.m;
                    dh8 dh83 = this.e;
                    if (dh83 == null) {
                        Message obtainMessage2 = yg8.obtainMessage(262, new mpa(dh8, dh82));
                        obtainMessage2.arg1 = i2;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = yg8.obtainMessage(264, new mpa(dh83, dh82));
                        obtainMessage3.arg1 = i2;
                        obtainMessage3.sendToTarget();
                    }
                    ah83.v.clear();
                    ah83.g();
                    ah83.k();
                    ArrayList arrayList = this.f;
                    if (arrayList != null) {
                        ah83.r.n(arrayList);
                    }
                }
            } else if (!this.i && !this.j) {
                this.j = true;
                if (tg8 != null) {
                    tg8.h(0);
                    tg8.d();
                }
            }
        }
    }
}
