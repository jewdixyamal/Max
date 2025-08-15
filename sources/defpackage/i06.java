package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: i06  reason: default package */
public abstract class i06 implements ov6 {
    public final Object a = new Object();
    public final ov6 b;
    public final HashSet c = new HashSet();

    public i06(ov6 ov6) {
        this.b = ov6;
    }

    public final Image Z() {
        return this.b.Z();
    }

    public final void a(h06 h06) {
        synchronized (this.a) {
            this.c.add(h06);
        }
    }

    public void close() {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((h06) it.next()).a(this);
        }
    }

    public int getHeight() {
        return this.b.getHeight();
    }

    public su6 getImageInfo() {
        return this.b.getImageInfo();
    }

    public int getWidth() {
        return this.b.getWidth();
    }

    public final int k0() {
        return this.b.k0();
    }

    public final sy4[] v() {
        return this.b.v();
    }
}
