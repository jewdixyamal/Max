package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* renamed from: qh8  reason: default package */
public class qh8 {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final ii8 a;

    public qh8(Context context, u75 u75, ffc ffc, oz7 oz7, Bundle bundle, Bundle bundle2, imc imc) {
        synchronized (b) {
            HashMap hashMap = c;
            if (!hashMap.containsKey("")) {
                hashMap.put("", this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
        }
        this.a = new ii8(this, context, u75, ffc, oz7, bundle, bundle2, imc);
    }

    public final ao0 a() {
        return this.a.m;
    }

    public final ii8 b() {
        return this.a;
    }

    public final q3b c() {
        return this.a.s.a;
    }

    public final PendingIntent d() {
        return this.a.t;
    }

    public final boolean e() {
        return this.a.p;
    }
}
