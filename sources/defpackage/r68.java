package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.Serializable;

/* renamed from: r68  reason: default package */
public final class r68 {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Cloneable f;
    public final Cloneable g;
    public Object h;

    /* JADX WARNING: type inference failed for: r1v2, types: [float[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Cloneable, float[]] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Cloneable, float[]] */
    public r68() {
        this.c = new int[2];
        this.d = new float[2];
        this.e = new float[2];
        this.f = new float[2];
        this.g = new float[2];
        this.h = null;
        b();
    }

    public void a() {
        us usVar = ((cj8) this.h).X;
        s68 s68 = (s68) this.d;
        b78 b78 = s68.e;
        b78.getClass();
        if (usVar.get(((c78) b78).a.getBinder()) != s68) {
            int i = cj8.w0;
            return;
        }
        int i2 = this.b & 1;
        Bundle bundle = (Bundle) this.f;
        if (i2 != 0) {
            int i3 = cj8.w0;
        }
        try {
            c78 c78 = (c78) s68.e;
            c78.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", (String) this.e);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", (Bundle) this.g);
            c78.a(3, bundle2);
        } catch (RemoteException unused) {
        }
    }

    public void b() {
        this.a = false;
        this.b = 0;
        for (int i = 0; i < 2; i++) {
            ((int[]) this.c)[i] = -1;
        }
    }

    public void c() {
        if (!this.a) {
            this.a = true;
            a();
            return;
        }
        throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.c);
    }

    public void d() {
        uf4 uf4;
        if (this.a) {
            this.a = false;
            b9b b9b = (b9b) this.h;
            if (b9b != null && (uf4 = (uf4) b9b.c) != null && !uf4.d) {
                uf4.j.set(uf4.k);
            }
        }
    }

    public r68(cj8 cj8, Object obj, s68 s68, String str, Bundle bundle) {
        this.h = cj8;
        this.d = s68;
        this.e = str;
        this.f = bundle;
        this.g = null;
        this.c = obj;
    }
}
