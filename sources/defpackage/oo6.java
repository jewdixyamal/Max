package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: oo6  reason: default package */
public final class oo6 extends pnf {
    public final je7 X;
    public final SharedPreferences Y;
    public final ArrayList Z;
    public final o23 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0 = r0e.a(r());
    public final s35 t0 = new s35(0);

    public oo6() {
        fi4 fi4 = fi4.a;
        Class<Context> cls = Context.class;
        Class<f5a> cls2 = f5a.class;
        khe d = fi4.getAccessor().d(cls2);
        khe d2 = fi4.getAccessor().d(m7b.class);
        khe d3 = fi4.getAccessor().d(kke.class);
        this.b = new o23((je7) fi4.getAccessor().d(av0.class), (je7) fi4.getAccessor().d(cls2), (je7) fi4.getAccessor().d(xie.class), (Context) fi4.getAccessor().c(cls));
        this.c = d2;
        this.o = d3;
        this.X = d;
        this.Y = ((Context) fi4.getAccessor().c(cls)).getSharedPreferences("dev_tools", 0);
        List M = y53.M("api.oneme.ru", "api-test.oneme.ru", "api-tg.oneme.ru", "api-test2.oneme.ru");
        ArrayList arrayList = new ArrayList(M.size());
        arrayList.addAll(M);
        d63.X(arrayList, new String[0]);
        this.Z = arrayList;
    }

    public final m7b q() {
        return (m7b) this.c.getValue();
    }

    public final kl7 r() {
        kl7 l = j1e.l();
        ArrayList arrayList = this.Z;
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList2.add(new go6(str, Boolean.valueOf(tpa.f(str, ((p7b) q()).a.D()))));
        }
        l.addAll(arrayList2);
        String str2 = "";
        String string = this.Y.getString("Custom", str2);
        if (!(string == null || string.length() == 0)) {
            str2 = zr6.i(" (", string, ")");
        }
        l.add(new go6(wg0.i("Custom", str2), Boolean.valueOf(tpa.f(string, ((p7b) q()).a.D()))));
        return j1e.d(l);
    }

    public final void s(String str) {
        j47.T(this.a, ((w9a) ((kke) this.o.getValue())).a().plus(xq9.a), (vx3) null, new no6(str, this, (Continuation) null), 2);
    }
}
