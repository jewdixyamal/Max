package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: npb  reason: default package */
public final /* synthetic */ class npb implements x3a, lde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ npb(int i, Context context, boolean z) {
        this.a = i;
        this.b = context;
        this.c = z;
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        SharedPreferences.Editor edit = v3c.q(this.b).edit();
        edit.putBoolean("proxy_retention", this.c);
        edit.apply();
    }

    public Object get() {
        switch (this.a) {
            case 1:
                return are.r(this.b, false, this.c);
            case 2:
                return are.r(this.b, true, this.c);
            default:
                return are.t(this.b, this.c);
        }
    }
}
