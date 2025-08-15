package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: h6a  reason: default package */
public final class h6a implements qu7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ h6a(v4 v4Var, int i) {
        this.a = i;
        this.b = v4Var;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                SharedPreferences.Editor edit = ((SharedPreferences) ((je7) ((pl8) qp4.u0.b((Context) this.b.c(Context.class)).Y).c).getValue()).edit();
                gq9.a.getClass();
                edit.putString("nightmode", yb9.g(fq9.b));
                edit.putString("themename", sba.d.a);
                edit.apply();
                return;
            default:
                ((k33) this.b.c(k33.class)).b();
                return;
        }
    }
}
